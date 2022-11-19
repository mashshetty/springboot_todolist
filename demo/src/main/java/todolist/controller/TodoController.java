package todolist.controller;



import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import todolist.model.Todo;
import todolist.serviceImpl.ServiceImpl;


@Controller
public class TodoController {
	
	private ServiceImpl serviceimpl;

	public TodoController(ServiceImpl serviceimpl) {
		super();
		this.serviceimpl = serviceimpl;
	}
	
	
	@PostMapping("/addtododata")
	public String addTodo(@ModelAttribute("todo") Todo todo) {
		
		 serviceimpl.addTodo(todo);	
		 
		 return "redirect:/";
		 
		 
		
	}

	@RequestMapping("/addtodo")
	public String addTodo(Model model) {
		Todo todo = new Todo();
		model.addAttribute("todo", todo);
		 return "addtodo"; 
	}
	
	@RequestMapping("/")
	public String getTodos(Model model) {
	model.addAttribute("todo",serviceimpl.getTodo());
		 return "welcome"; 
	}
	
	
	@GetMapping("/delete/{id}")
	public String deletetodo(@PathVariable Long id) {
		serviceimpl.delete(id);
		
		return "redirect:/";
		
	}
	
	
	@GetMapping("/update/{id}")
	public String updateTodo(@PathVariable Long id, Model model) {
		Todo todo = serviceimpl.getTodo(id);
		model.addAttribute(todo);
		return "updatetodo";
	}
	
	@RequestMapping("/updatex/{id}")
	public String update(@ModelAttribute Todo todo,@PathVariable Long id) {
		
		Todo atodo = serviceimpl.getTodo(id);
		atodo.setId(todo.getId());
		atodo.settitlexx(todo.gettitlexx());
		atodo.setdescxx(todo.getdescxx());
		serviceimpl.updateTodo(atodo);
		return "redirect:/";
	}
	
	
}

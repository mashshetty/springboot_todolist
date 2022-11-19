package todolist.serviceImpl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import java.util.List;
import todolist.model.Todo;
import todolist.repo.TodoRepo;
import todolist.serviceInterface.ServiceInterface;


@Service
public class ServiceImpl implements ServiceInterface {
	
	private TodoRepo todorepo;

	public ServiceImpl(TodoRepo todorepo) {
		super();
		this.todorepo = todorepo;
	}

	
	public Todo addTodo(Todo todo) {
		todorepo.save(todo);
		return todo;
		
		
	}


	@Override
	public List<Todo> getTodo() {
		// TODO Auto-generated method stub
		System.out.println((List<Todo>) todorepo.findAll());
		return (List<Todo>) todorepo.findAll();
		
		
	}


	@Override
	public void delete(Long id) {
		todorepo.deleteById(id);
		
	}


	@Override
	public void updateTodo(Todo todo) {
		todorepo.save(todo);
		
	}


	@Override
	public Todo getTodo(Long id) {
		
		return todorepo.getById(id);
	}

	

	

}

package todolist.serviceInterface;

import java.util.ArrayList;

import java.util.List;
import todolist.model.Todo;

public interface ServiceInterface {
	Todo addTodo(Todo todo);
	
	List<Todo> getTodo();
	
	void delete(Long id);
	
	void updateTodo(Todo todo);
	
	Todo getTodo(Long id);

}

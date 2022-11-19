package todolist.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import todolist.model.Todo;

public interface TodoRepo extends JpaRepository<Todo, Long> {

}

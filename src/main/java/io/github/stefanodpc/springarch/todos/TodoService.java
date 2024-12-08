package io.github.stefanodpc.springarch.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Service allows using it later in dependancy injection
@Service
public class TodoService {

    @Autowired
    public TodoRepository repository;

    // Can use dependency injection with constructor or @Autowired
    /*
     * public TodoService(TodoRepository todoRepository){
     *   this.repository = todoRepository;
     * }
     */    

    public TodoEntity save(TodoEntity newTodo){
        return repository.save(newTodo);
    }

    public void updateStatus(TodoEntity todo){
        repository.save(todo);
    }

    public TodoEntity getById(Integer id){
        return repository.findById(id).orElse(null);
    }
}

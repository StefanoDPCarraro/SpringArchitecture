package io.github.stefanodpc.springarch.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

// @Service allows using it later in dependancy injection
@Service
public class TodoService {

    @Autowired
    public TodoRepository repository;
    @Autowired
    private TodoValidator validator;
    @Autowired
    private MailSender mailSender;

    // Can use dependency injection with constructor or @Autowired
    /*
     * public TodoService(TodoRepository todoRepository){
     *   this.repository = todoRepository;
     * }
     */    

    public TodoEntity save(TodoEntity newTodo){
        try{
            validator.validate(newTodo);
        }
        catch(IllegalArgumentException e){
            var errorMessage = e.getMessage();
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, errorMessage);
        }
        return repository.save(newTodo);
    }

    public void updateStatus(TodoEntity todo){
        repository.save(todo);
        String status = todo.getFinished() == Boolean.TRUE ? "finished" : "not finished";
        mailSender.send("Todo " + todo.getDescription() + " was updated to " + status);
    }

    public TodoEntity getById(Integer id){
        return repository.findById(id).orElse(null);
    }
}

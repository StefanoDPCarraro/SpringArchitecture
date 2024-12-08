package io.github.stefanodpc.springarch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.github.stefanodpc.springarch.todos.TodoEntity;
import io.github.stefanodpc.springarch.todos.TodoValidator;

@Component
public class GerenciatedBean {
    
    // Injection by property
    // Easier, but not recommended
    // Can not be changed during execution
    @Autowired
    private TodoValidator validator;    

    // Injection by setter - Optional
    // Useful to change depending on if statements
    @Autowired
    public void setValidator(TodoValidator validator){
        this.validator = validator;
    }

    // Injection by constrtuctor (can use autowired but not mandatory)
    // Makes tests easier, because allows injecting mocks
    public GerenciatedBean(TodoValidator validator){
        this.validator = validator;
    }

    public void useValidator(){
        var todo = new TodoEntity();
        validator.validate(todo);
    }
}

package io.github.stefanodpc.springarch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import io.github.stefanodpc.springarch.todos.TodoEntity;
import io.github.stefanodpc.springarch.todos.TodoValidator;

// Every bean has Singleton scope as default
// It can be changed with the @Scope annotation
// Scope types:
// Application = Exists for the application runtime.
// Request = Instanciated on a request and close at its end.
// Session = Exists while the user session exists.
// Singleton = Only one instance, every user uses the same instance.
// Prototype = One instance for each usage

// BeanDefinition - WebApplicationContext

// Application holds state for every user, session holds for one user.
// Request does not holds state.
// Singleton should not hold state since it never ends.

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
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

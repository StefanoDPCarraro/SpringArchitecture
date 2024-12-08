package io.github.stefanodpc.springarch.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Service, repository and others are specific components, that can be abstracted
// to a generic component.
// By using @Component we can add a component to the context.
// @Service is only a semantic matter, as it could be swapped by @Component and still
// work the same way.
// @Repository has to stay the same way for better performance.
@Component
public class TodoValidator {

    @Autowired
    private TodoRepository repository;

    public void validate(TodoEntity todo){
        if (duplicateDescription(todo.getDescription())) {
            throw new IllegalArgumentException("There already a TODO with the same description");
        }
    }

    private boolean duplicateDescription(String description){
        return repository.existsByDescription(description);
    }
}

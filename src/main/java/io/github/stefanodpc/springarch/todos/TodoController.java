package io.github.stefanodpc.springarch.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("todos")
public class TodoController {
    @Autowired
    private TodoService service;
    // Constructor could handle DI aswell

    @PostMapping
    public TodoEntity save(@RequestBody TodoEntity todo){
        return service.save(todo);
    }
}

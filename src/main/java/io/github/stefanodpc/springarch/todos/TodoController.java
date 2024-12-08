package io.github.stefanodpc.springarch.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @PutMapping("{id}")
    public void updateStatus(@PathVariable("id") Integer id, @RequestBody TodoEntity todo){
        todo.setId(id);
        service.updateStatus(todo);
    }

    @GetMapping("{id}")
    public TodoEntity getById(@PathVariable("id") Integer id){
        return service.getById(id);
    }
}

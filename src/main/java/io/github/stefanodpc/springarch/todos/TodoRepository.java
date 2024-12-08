package io.github.stefanodpc.springarch.todos;

import org.springframework.data.jpa.repository.JpaRepository;

// Using Jpa the @Repository annotation is implicit
// For other implementations you might need to declare it.
public interface TodoRepository extends JpaRepository<TodoEntity, Integer>{
    boolean existsByDescription(String description);
}

package com.example.raynerspring.service;

import com.example.raynerspring.entity.ToDoEntity;
import com.example.raynerspring.entity.UserEntity;
import com.example.raynerspring.model.Todo;
import com.example.raynerspring.repository.TodoRepo;
import com.example.raynerspring.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepo todoRepo;

    @Autowired
    private UserRepo userRepo;

    public Todo createTodo(ToDoEntity todo, Long id){
        UserEntity user = userRepo.findById(id).get();
        todo.setUser(user);
        return Todo.toModel(todoRepo.save(todo));
    }

    public Todo completeTogo(Long id) {
        ToDoEntity todo = todoRepo.findById(id).get();
        todo.setCompleted(!todo.getCompleted());
        return Todo.toModel(todoRepo.save(todo));
    }

}

package com.example.raynerspring.repository;

import com.example.raynerspring.entity.ToDoEntity;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<ToDoEntity, Long> {

}

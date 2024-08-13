package io.github.nadodev.apphex.infrastructure.controllers;

import io.github.nadodev.apphex.core.entities.Todo;
import io.github.nadodev.apphex.infrastructure.DTOs.TodoDTO;
import io.github.nadodev.apphex.infrastructure.gatways.PeopleRepositoryGatway;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;


@RestController
@RequestMapping("/v1/api")
@AllArgsConstructor
public class TodoController {
    private final PeopleRepositoryGatway todoRepository;


    private final TodoDTOMapper todoDTOMapper;

    @PostMapping("/todo")
    public List<Todo> create(@RequestBody TodoDTO todoDTO) {
        return Collections.singletonList(todoRepository.create(todoDTOMapper.toEntity(todoDTO)));
    }

    @GetMapping("/todo/{id}")
    public TodoDTO findById(@PathVariable Long id) {
        Todo todo = todoRepository.findById(id);
        return todoDTOMapper.toDto(todo);
    }

    @GetMapping("/todo")
    public List<Todo> listAll() {
        return todoRepository.listAll();
    }


    @PutMapping("/todo/{id}")
    public TodoDTO changeStatus(@PathVariable Long id, @RequestBody TodoDTO todoDTO) {
        Todo todo = todoRepository.changeStatus(todoDTOMapper.toEntity(todoDTO).status(), id);
        return todoDTOMapper.toDto(todo);
    }


}

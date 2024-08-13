package io.github.nadodev.apphex.infrastructure.controllers;

import io.github.nadodev.apphex.core.entities.Todo;
import io.github.nadodev.apphex.infrastructure.DTOs.TodoDTO;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class TodoDTOMapper {
    public TodoDTO toDto(Todo todo) {
        return new TodoDTO(
                todo.title(),
                todo.description(),
                todo.status()
        );
    }

    public Todo toEntity(TodoDTO todo) {
        return new Todo(
                null,
                todo.title(),
                todo.description(),
                todo.status()
        );
    }

}

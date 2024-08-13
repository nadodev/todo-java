package io.github.nadodev.apphex.infrastructure.gatways;

import io.github.nadodev.apphex.core.entities.Todo;
import io.github.nadodev.apphex.infrastructure.persistent.TodoEntity;
import org.springframework.stereotype.Component;

@Component

public class TodoEntityMapper {
    public TodoEntity toEntity(Todo todo) {
        return new TodoEntity(
                todo.id(),
                todo.title(),
                todo.description(),
                todo.status()
        );
    }

    public Todo toPeople(TodoEntity todoEntity) {
        return new Todo(
                todoEntity.getId(),
                todoEntity.getTitle(),
                todoEntity.getDescription(),
                todoEntity.getStatus()
        );
    }
}

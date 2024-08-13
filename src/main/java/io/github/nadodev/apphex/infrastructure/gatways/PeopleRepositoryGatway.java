package io.github.nadodev.apphex.infrastructure.gatways;

import io.github.nadodev.apphex.core.entities.Todo;
import io.github.nadodev.apphex.core.enums.StatusTodoEnum;
import io.github.nadodev.apphex.core.getways.TodoGetway;
import io.github.nadodev.apphex.infrastructure.persistent.TodoEntity;
import io.github.nadodev.apphex.infrastructure.persistent.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@RequiredArgsConstructor
@Component
public class PeopleRepositoryGatway  implements TodoGetway {

    private final TodoRepository todoRepository;

    private final TodoEntityMapper todoEntityMapper;


    @Override
    public Todo create(Todo todo) {

        TodoEntity entity = todoEntityMapper.toEntity(todo);
        TodoEntity newPeople = todoRepository.save(entity);
        return todoEntityMapper.toPeople(newPeople);
    }

    @Override
    public Todo findById(Long id) {
        return  todoRepository.findById(id)
                .map(todoEntityMapper::toPeople)
                .orElse(null);
    }

    @Override
    public List<Todo> listAll() {
        return todoRepository.findAll().stream()
                .map(todoEntityMapper::toPeople)
                .toList();
    }

    @Override
    public Todo changeStatus(StatusTodoEnum status, Long id) {
        TodoEntity todoEntity = todoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found"));

        todoEntity.setStatus(status);
        TodoEntity newTodo = todoRepository.save(todoEntity);

        return todoEntityMapper.toPeople(newTodo);
    }



}

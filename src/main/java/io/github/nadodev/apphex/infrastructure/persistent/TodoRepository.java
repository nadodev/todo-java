package io.github.nadodev.apphex.infrastructure.persistent;

import io.github.nadodev.apphex.core.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity, Long> {
}

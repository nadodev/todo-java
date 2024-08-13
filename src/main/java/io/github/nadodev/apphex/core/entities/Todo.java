package io.github.nadodev.apphex.core.entities;

import io.github.nadodev.apphex.core.enums.StatusTodoEnum;

public record Todo(
         Long id,
         String title,
         String description,
         StatusTodoEnum status
     ) {
}

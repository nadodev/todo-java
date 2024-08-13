package io.github.nadodev.apphex.infrastructure.DTOs;

import io.github.nadodev.apphex.core.enums.StatusTodoEnum;

public record TodoDTO(
                      String title,
                      String description,
                      StatusTodoEnum status) {

}

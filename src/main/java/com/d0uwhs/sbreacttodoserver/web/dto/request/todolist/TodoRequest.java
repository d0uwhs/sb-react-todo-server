package com.d0uwhs.sbreacttodoserver.web.dto.request.todolist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TodoRequest {
    private Long todoId;
    private Long memberId;
    private String todoTitle;
    private String todoBody;
    private LocalDate dueDate;
}

package com.d0uwhs.sbreacttodoserver.web.dto.response.todolist;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoResponse {
    private Long todoId;
    private Long memberId;
    private String todoTitle;
    private String todoBody;
    private LocalDate dueDate;
    private LocalDateTime createdDt;
    private LocalDateTime modifiedDt;
}

package com.d0uwhs.sbreacttodoserver.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Todo {
    private Long todoId;
    private Long memberId;
    private String todoTitle;
    private String todoBody;
    private LocalDate dueDate;
    private LocalDateTime createdDt;
    private LocalDateTime modifiedDt;
}

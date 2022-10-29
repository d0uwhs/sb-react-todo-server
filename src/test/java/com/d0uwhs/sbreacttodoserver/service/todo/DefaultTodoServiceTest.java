package com.d0uwhs.sbreacttodoserver.service.todo;

import com.d0uwhs.sbreacttodoserver.mapper.todo.TodoMapper;
import com.d0uwhs.sbreacttodoserver.web.dto.request.todolist.TodoRequest;
import com.d0uwhs.sbreacttodoserver.web.dto.response.todolist.TodoResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;



@Log4j2
@SpringBootTest
@RequiredArgsConstructor
class DefaultTodoServiceTest {

     /**
     * TODO : 서비스 final로 하면 안되는 이유?
     */
    @Autowired
    private TodoService todoService;

    @Test
    void findByTodoId() {
        Long todoId = 4L;
        Optional<TodoResponse> todoResponse = todoService.findByTodoId(todoId);
        log.info(todoResponse.orElseThrow(() -> new RuntimeException("No Todo")).toString());
    }

    @Test
    void findAll() {
        List<TodoResponse> todoResponseList = todoService.findAll();
        todoResponseList.forEach(log::info);
    }

    @Test
    void insertTodo() {
        TodoRequest todoRequest = TodoRequest.builder()
                .todoTitle("Service Test")
                .todoBody("Service Body Test")
                .dueDate(LocalDate.now())
                .memberId(1L)
                .build();
        todoService.insertTodo(todoRequest);
        log.info(todoRequest.getTodoId());
    }
}

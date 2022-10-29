package com.d0uwhs.sbreacttodoserver.mapper.todo;

import com.d0uwhs.sbreacttodoserver.web.dto.request.todolist.TodoRequest;
import com.d0uwhs.sbreacttodoserver.web.dto.response.todolist.TodoResponse;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Log4j2
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class TodoMapperTest {

    @Autowired
    TodoMapper todoMapper;

    @Test
    void insertTodo() {
        TodoRequest todoRequest = TodoRequest.builder().memberId(1L).todoTitle("Test Title").todoBody("Test Body").dueDate(LocalDate.now()).build();
        Long result = todoMapper.insertTodo(todoRequest);
        log.info(result.toString());
        log.info(todoRequest.toString());
    }

    @Test
    void findByTodo() {
        Long todoId = 4L;
        Optional<TodoResponse> todoResponseOptional = todoMapper.findByTodoId(todoId);
        log.info(todoResponseOptional
                .orElseThrow(() -> new RuntimeException("No Todos"))
                .getTodoBody());
    }

    @Test
    void findAll(){
        List<TodoResponse> todoResponseList = todoMapper.findAll();
        todoResponseList.forEach(log::info);
        assertThat(todoResponseList).isNotNull();
    }

    @Test
    void deleteTodo() {
        Long todoId = 4L;
        Long result = todoMapper.deleteTodo(todoId);
        log.info(result.toString());
    }
}

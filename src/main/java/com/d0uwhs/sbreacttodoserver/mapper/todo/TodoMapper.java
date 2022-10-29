package com.d0uwhs.sbreacttodoserver.mapper.todo;

import com.d0uwhs.sbreacttodoserver.web.dto.request.todolist.TodoRequest;
import com.d0uwhs.sbreacttodoserver.web.dto.response.todolist.TodoResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface TodoMapper {

    Optional<TodoResponse> findByTodoId(Long todoId);

    List<TodoResponse> findAll();

    Long insertTodo(TodoRequest todoRequest);

    Long deleteTodo(Long todoId);

}

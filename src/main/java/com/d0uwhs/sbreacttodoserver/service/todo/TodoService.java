package com.d0uwhs.sbreacttodoserver.service.todo;

import com.d0uwhs.sbreacttodoserver.web.dto.request.todolist.TodoRequest;
import com.d0uwhs.sbreacttodoserver.web.dto.response.todolist.TodoResponse;

import java.util.List;
import java.util.Optional;

public interface TodoService {

    Optional<TodoResponse> findByTodoId(Long todoId);

    List<TodoResponse> findAll();

    Long insertTodo(TodoRequest todoRequest);

    Long deleteTodo(Long todoId);
}

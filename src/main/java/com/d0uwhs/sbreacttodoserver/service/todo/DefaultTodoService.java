package com.d0uwhs.sbreacttodoserver.service.todo;

import com.d0uwhs.sbreacttodoserver.mapper.todo.TodoMapper;
import com.d0uwhs.sbreacttodoserver.web.dto.request.todolist.TodoRequest;
import com.d0uwhs.sbreacttodoserver.web.dto.response.todolist.TodoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DefaultTodoService implements TodoService {

    private final TodoMapper todoMapper;

    @Override
    public Optional<TodoResponse> findByTodoId(Long todoId) {
        return todoMapper.findByTodoId(todoId);

    }

    @Override
    public List<TodoResponse> findAll() {
        return todoMapper.findAll();
    }

    @Override
    public Long insertTodo(TodoRequest todoRequest) {
        return todoMapper.insertTodo(todoRequest);
    }

    @Override
    public Long deleteTodo(Long todoId) {
        return null;
    }
}

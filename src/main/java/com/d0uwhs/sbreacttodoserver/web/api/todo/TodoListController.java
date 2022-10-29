package com.d0uwhs.sbreacttodoserver.web.api.todo;


import com.d0uwhs.sbreacttodoserver.service.todo.TodoService;
import com.d0uwhs.sbreacttodoserver.web.dto.response.todolist.TodoResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todolist")
@RequiredArgsConstructor
public class TodoListController {

    private final TodoService todoService;

    @GetMapping({"/details/{todoId}"})
    @Operation(summary = "단일 TODO 조회",
            description = "단일건에 대한 TODO를 조회합니다.",
            parameters = @Parameter(name = "todoIs", description = "Todo ID입니다.", required = true),
            responses = @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json")))
    public ResponseEntity<TodoResponse> findByTodoId(@PathVariable final Long todoId) {
        Optional<TodoResponse> todoResponse = todoService.findByTodoId(todoId);
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(todoResponse.orElseThrow(RuntimeException::new));
    }

    @GetMapping
    @Operation(summary = "전체 TODO 조회",
            description = "전체 TODO를 조회합니다.",
            responses = @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json")))
    public ResponseEntity<List<TodoResponse>> findAll() {
        List<TodoResponse> todoResponseList = todoService.findAll();
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(todoResponseList);
    }


}

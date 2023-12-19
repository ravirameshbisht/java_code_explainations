package com.example.demo.controller;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.entity.Todo;
import com.example.demo.service.TodoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TodoController {
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	private TodoService todoService;
		
	@GetMapping("list-todos")
	public List<Todo> listAllTodos(@RequestParam String username) {
		List<Todo> todos = todoService.findByUsername(username);
		return todos;
	}
	@PostMapping(value="add-todo")
	public String addNewTodo(@RequestBody Todo todo) {
		todoService.addTodo(todo.getDescription(), todo.getUsername(),
				LocalDate.now().plusYears(1), false);
		return "Successfully added";
	}
	@DeleteMapping("delete-todo")
	public String deleteTodo(@RequestParam int id) {
		todoService.deleteById(id);
		return "Successfully deleted";
	}
	@PostMapping(value="update-todo")
	public String updateTodo(@RequestBody Todo todo) {
		todoService.updateTodo(todo);
		return "Successfully updated";
	}

}
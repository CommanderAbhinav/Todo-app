package com.in28minutes.todo.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.in28minutes.model.Todo;

public class TodoServiceTestMock {

	@Test
	public void testretrieveTodo() {
		TodoService mocktodoservice=mock(TodoService.class);
		
		List<Todo> todos = new ArrayList<Todo>();
		
        Todo req=new Todo(2, "Abhinav", "Learn Hibernate", new Date(),
				false);
		
		when(mocktodoservice.retrieveTodo(2)).thenReturn(req);
		
		assertEquals(todos.get(1),mocktodoservice.retrieveTodo(2));
	}

}

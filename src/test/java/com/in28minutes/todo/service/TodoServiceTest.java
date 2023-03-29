package com.in28minutes.todo.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.in28minutes.model.Todo;

public class TodoServiceTest {
	
	
	private TodoService service=new TodoService();
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCount = 3;

	static {
		todos.add(new Todo(1, "Abhinav", "Learn Spring MVC", new Date(),
				false));
		todos.add(new Todo(2, "Abhinav", "Learn Struts", new Date(), false));
		todos.add(new Todo(3, "Abhinav", "Learn Hibernate", new Date(),
				false));
	}
	@Test
	public void testretrieveTodo() {
		assertEquals(todos.get(1),service.retrieveTodo(2));
		
	}
	
	@Test
	public void testretrieveTodos() {
		assertEquals(todos,service.retrieveTodos("Abhinav"));
	}
	
	@Test
	public void testdeleteTodo() {
            List<Todo> todoscheck = new ArrayList<Todo>();
			todoscheck.add(new Todo(1, "Abhinav", "Learn Spring MVC", new Date(),
					false));
			todoscheck.add(new Todo(2, "Abhinav", "Learn Struts", new Date(), false));
		
	      service.deleteTodo(3);
	      assertEquals(todoscheck,todos);
	}
	
	@Test
	public void testaddTodo() {
		List<Todo> todoscheck = new ArrayList<Todo>();
		todoscheck.add(new Todo(1, "Abhinav", "Learn Spring MVC", new Date(),
				false));
		todoscheck.add(new Todo(2, "Abhinav", "Learn Struts", new Date(), false));
		todoscheck.add(new Todo(3, "Abhinav", "Learn Hibernate", new Date(),
				false));
		todoscheck.add(new Todo(4, "Abhinav", "Learn junit", new Date(),
				false));
		
		service.addTodo("Abhinav", "Learn junit", new Date(),
				false);
		assertEquals(todoscheck,todos);
	}
	

}

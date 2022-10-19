package com.wisinyandel.todoapp;

import com.wisinyandel.todoapp.note.Note;
import com.wisinyandel.todoapp.note.NoteService;
import com.wisinyandel.todoapp.springdatajpa.NoteJpaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TodoAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TodoAppApplication.class, args);
		NoteService noteService = context.getBean(NoteService.class);
		noteService.create(new Note(1, "Test", null, null, "Test", "Test", 1));
	}

}

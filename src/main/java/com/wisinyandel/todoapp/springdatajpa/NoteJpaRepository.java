package com.wisinyandel.todoapp.springdatajpa;

import com.wisinyandel.todoapp.note.Note;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NoteJpaRepository extends JpaRepository<Note, Long> {

}

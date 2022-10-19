package com.wisinyandel.todoapp.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wisinyandel.todoapp.Note;

public interface NoteJpaRepository extends JpaRepository<Note, Long> {

}

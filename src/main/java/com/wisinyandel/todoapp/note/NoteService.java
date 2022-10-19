package com.wisinyandel.todoapp.note;

import com.wisinyandel.todoapp.springdatajpa.NoteJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService {

    @Autowired
    NoteJpaRepository dao;
}

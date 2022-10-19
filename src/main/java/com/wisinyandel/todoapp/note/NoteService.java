package com.wisinyandel.todoapp.note;

import com.wisinyandel.todoapp.springdatajpa.NoteJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class NoteService {

    @Autowired
    private NoteJpaRepository dao;
    
    public Note create(Note note) {
    	return dao.save(note);
    }

}

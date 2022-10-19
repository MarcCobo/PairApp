package com.wisinyandel.todoapp.note;

import com.wisinyandel.todoapp.springdatajpa.NoteJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class NoteService {

    @Autowired
    private NoteJpaRepository dao;
    
    public Note create(Note note) {
    	return dao.save(note);
    }

    public void destroy(long id){
        Note note = findNoteById(id);
        dao.delete(note);
    }

    public void update(){

    }

    public void index(){

    }

    public Note findNoteById(long id){
        Optional<Note> note = dao.findById(id);
        return note.orElse(null);
    }

}

package com.wisinyandel.todoapp.note;

import com.wisinyandel.todoapp.springdatajpa.NoteJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class NoteService {

    @Autowired
    private NoteJpaRepository dao;
    
    public void create(Note note) {
    	dao.save(note);
    }

    public void destroy(long id){
        Note note = findNoteById(id);
        dao.delete(note);
    }

    public void update(long id, Note updateNote){
        Note note = findNoteById(id);
        if (!updateNote.getText().isBlank() && !updateNote.getText().isEmpty()) note.setText(updateNote.getText());
        if (updateNote.getCreatedAt() != null) note.setCreatedAt(updateNote.getCreatedAt());
        if (updateNote.getEstimateCompletionDate() != null) note.setEstimateCompletionDate(updateNote.getEstimateCompletionDate());
        if (updateNote.getLink() != null) note.setLink(updateNote.getLink());
        if (updateNote.getMentions() != null) note.setMentions(updateNote.getMentions());
        if (updateNote.getPriority() != 0) note.setPriority(updateNote.getPriority());
        dao.save(note);
    }

    public List<Note> getAllNotes(){
        return dao.findAll();
    }

    public Note findNoteById(long id){
        Optional<Note> note = dao.findById(id);
        return note.orElse(null);
    }

}

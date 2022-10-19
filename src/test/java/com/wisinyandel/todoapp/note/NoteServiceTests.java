package com.wisinyandel.todoapp.note;

import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class NoteServiceTests {
    @Autowired
    private NoteService _service;

    @Test
    public void create_WhenCalled_ReturnSavedEntity() {
        Note note = new Note(5, "Test",null, null, "link","mentions",1);
        _service.create(note);
        Note result = _service.findNoteById(2);
        Assertions.assertNotNull(result);
    }

    @Test
    public void getAllNotes_WhenCalled_ReturnAllNotes(){
        List<Note> notes = _service.getAllNotes();
        Assertions.assertNotNull(notes);
    }

    @Test
    public void update_WhenCalled_UpdateNote(){
        Note note = new Note(1,"UpdateTest",null,null,null,null,0);
        _service.update(1,note);
        Note updated = _service.findNoteById(1);
        Assertions.assertEquals("UpdateTest",updated.getText());
    }
    
    @Test
    public void destroy_WhenCalled_ReturnNull() {
        int id = 2;
    	_service.destroy(id);
    	Note result = _service.findNoteById(id);
    	Assertions.assertNull(result);
    }

    @Test
    public void findNoteById_WhenCalled_ReturnNote(){
        Note result = _service.findNoteById(1);
        Assertions.assertEquals(1, result.getId());
    }
    
    @Test
    public void findNoteById_NoteDoesntExist_ReturnNull(){
        Note result = _service.findNoteById(66);
        Assertions.assertNull(result);
    }
}
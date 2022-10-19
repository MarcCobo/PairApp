package com.wisinyandel.todoapp.note;

import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class NoteServiceTests {
    @Autowired
    private NoteService _service;

    @Test
    public void createNote_WhenCalled_ReturnSavedEntity() {
        Note note = new Note(2, "Test",null, null, "link","mentions",1);
        _service.create(note);
        Note result = _service.findNoteById(2);
        Assert.notNull(result);
    }
    
    @Test
    public void destroyNote_WhenCalled_IdNotFound() {
        int id = 2;
    	_service.destroy(id);
    	Note result = _service.findNoteById(id);
    	Assert.isNull(result, "Test");
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
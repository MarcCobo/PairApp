package com.wisinyandel.todoapp.note;

import static org.junit.Assert.assertNull;

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
        Note result = _service.create(note);
        Assert.notNull(result, "Test");
    }
    
    @Test
    public void destroyNote_WhenCalled_IdNotFound(int id) {
    	_service.destroy(id);
    	Note result = _service.getById(id);
    	assertNull(result);
    }
}
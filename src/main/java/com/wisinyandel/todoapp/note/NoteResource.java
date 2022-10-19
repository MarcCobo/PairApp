package com.wisinyandel.todoapp.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoteResource {
    @Autowired
    private NoteService service;

    @GetMapping("/notes")
    public List<Note> index() {
        return service.getAllNotes();
    }

    @GetMapping("/note/{id}")
    public Note show(@PathVariable long id) {
        return service.findNoteById(id);
    }

    @DeleteMapping("/note/{id}")
    public String delete(@PathVariable long id) {
        service.destroy(id);
        return "Deleted";
    }

    @PutMapping("/note/{id}")
    public void update(@PathVariable long id, @RequestBody Note note){
        service.update(id, note);
    }
}

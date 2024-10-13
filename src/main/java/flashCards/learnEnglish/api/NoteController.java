/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flashCards.learnEnglish.api;

import flashCards.learnEnglish.bussiness.abstracts.NoteService;
import flashCards.learnEnglish.entities.concretes.Note;
import flashCards.learnEnglish.utilities.DataResult;
import flashCards.learnEnglish.utilities.Result;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yahya
 */
@RestController
@RequestMapping("api/note")
@CrossOrigin
public class NoteController {

    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Note>> getAll() {
        return this.noteService.getAll();
    }

    @GetMapping("/getByNoteId/{id}")
    public DataResult<Note> getByNoteId(@PathVariable int id) {
        return this.noteService.getById(id);
    }

    @GetMapping("/getByUserNote/{userNumber}")
    public DataResult<List<Note>> getByNoteFromUserId(@PathVariable int userNumber) {
        return this.noteService.getByUserNumber(userNumber);
    }

    @PostMapping("/add")
    public Result add(@RequestBody Note note) {
        return this.noteService.add(note);
    }

}

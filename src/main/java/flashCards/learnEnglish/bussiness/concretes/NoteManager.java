/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flashCards.learnEnglish.bussiness.concretes;

import flashCards.learnEnglish.bussiness.abstracts.NoteService;
import flashCards.learnEnglish.dataAccess.NoteDao;
import flashCards.learnEnglish.entities.concretes.Note;
import flashCards.learnEnglish.utilities.DataResult;
import flashCards.learnEnglish.utilities.Result;
import flashCards.learnEnglish.utilities.SuccessDataResult;
import flashCards.learnEnglish.utilities.SuccessResult;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author yahya
 */
@Service
public class NoteManager implements NoteService {
    
    private final NoteDao noteDao;
    
    public NoteManager(NoteDao noteDao) {
        this.noteDao = noteDao;
    }
    
    @Override
    public DataResult<List<Note>> getAll() {
        return new SuccessDataResult<List<Note>>(this.noteDao.findAll());
    }
    
    @Override
    public DataResult<Note> getByTitle(String title) {
        return new SuccessDataResult<Note>(this.noteDao.findByTitle(title));
    }
    
    @Override
    public DataResult<Note> getById(int id) {
        return new SuccessDataResult<Note>(this.noteDao.findById(id).get());
    }
    
    @Override
    public DataResult<List<Note>> getByUserNumber(int userNumber) {
        return new SuccessDataResult<List<Note>>(this.noteDao.findByUserNumber(userNumber));
    }
    
    @Override
    public Result add(Note note) {
        this.noteDao.save(note);
        return new SuccessResult("adding flash Card is success");
    }
    
}

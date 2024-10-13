/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package flashCards.learnEnglish.bussiness.abstracts;

import flashCards.learnEnglish.entities.concretes.Note;
import flashCards.learnEnglish.utilities.DataResult;
import flashCards.learnEnglish.utilities.Result;
import java.util.List;

/**
 *
 * @author yahya
 */
public interface NoteService {

    DataResult<List<Note>> getAll();

    DataResult<Note> getByTitle(String title);

    DataResult<Note> getById(int id);

    DataResult<List<Note>> getByUserNumber(int userNumber);

    Result add(Note note);

}

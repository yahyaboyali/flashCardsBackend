/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flashCards.learnEnglish.bussiness.abstracts;

import flashCards.learnEnglish.entities.concretes.FlashCard;
import flashCards.learnEnglish.utilities.DataResult;
import flashCards.learnEnglish.utilities.Result;
import java.util.List;

/**
 *
 * @author yahya
 */
public interface FlashCardService {

    DataResult<List<FlashCard>> getAll();

    DataResult<FlashCard> getByWord(String word);

    DataResult<FlashCard> getById(int id);

    Result add(FlashCard flashCard);

    DataResult<List<FlashCard>> getByUserNumber(int userNumber);
}

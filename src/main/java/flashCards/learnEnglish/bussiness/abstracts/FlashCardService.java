/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flashCards.learnEnglish.bussiness.abstracts;

import flashCards.learnEnglish.entities.concretes.FlashCard;
import java.util.List;

/**
 *
 * @author yahya
 */
public interface FlashCardService {
    
    List<FlashCard> getAll();
    
    FlashCard getByWord(String word);
    
    FlashCard getById(int id);
    
    FlashCard add(FlashCard flashCard);
}

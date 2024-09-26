/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flashCards.learnEnglish.bussiness.concretes;

import flashCards.learnEnglish.bussiness.abstracts.FlashCardService;
import flashCards.learnEnglish.dataAccess.FlashCardDao;
import flashCards.learnEnglish.entities.concretes.FlashCard;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author yahya
 */
@Service
public class FlashCardManager implements FlashCardService{

    private final FlashCardDao flashCardDao;
    
    public FlashCardManager(FlashCardDao flashCardDao) {
        this.flashCardDao = flashCardDao;
    }
    @Override
    public List<FlashCard> getAll() {
        List<FlashCard> list= this.flashCardDao.findAll();
        return list;
    }

    @Override
    public FlashCard getByWord(String word) {
        FlashCard flashCard = this.flashCardDao.getByWord(word);        
        return flashCard;
    }

    @Override
    public FlashCard getById(int id) {
        FlashCard flashCard = this.flashCardDao.findById(id).get();
        
        return flashCard;
    }

    @Override
    public FlashCard add(FlashCard flashCard) {
        return this.flashCardDao.save(flashCard);
    }
    
}

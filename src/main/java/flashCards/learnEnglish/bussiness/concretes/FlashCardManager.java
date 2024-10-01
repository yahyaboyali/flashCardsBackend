/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flashCards.learnEnglish.bussiness.concretes;

import flashCards.learnEnglish.bussiness.abstracts.FlashCardService;
import flashCards.learnEnglish.dataAccess.FlashCardDao;
import flashCards.learnEnglish.entities.concretes.FlashCard;
import flashCards.learnEnglish.utilities.DataResult;
import flashCards.learnEnglish.utilities.Result;
import flashCards.learnEnglish.utilities.SuccessDataResult;
import flashCards.learnEnglish.utilities.SuccessResult;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author yahya
 */
@Service
public class FlashCardManager implements FlashCardService {

    private final FlashCardDao flashCardDao;

    public FlashCardManager(FlashCardDao flashCardDao) {
        this.flashCardDao = flashCardDao;
    }

    @Override
    public DataResult<List<FlashCard>> getAll() {
        return new SuccessDataResult<List<FlashCard>>(this.flashCardDao.findAll());
    }

    @Override
    public DataResult<FlashCard> getByWord(String word) {
        return new SuccessDataResult<FlashCard>(this.flashCardDao.getByWord(word));
    }

    @Override
    public DataResult<FlashCard> getById(int id) {
        return new SuccessDataResult<FlashCard>(this.flashCardDao.findById(id).get());
    }

    @Override
    public Result add(FlashCard flashCard) {
        this.flashCardDao.save(flashCard);
        return new SuccessResult("adding flash Card is success");
    }

    @Override
    public DataResult<List<FlashCard>> getByUserNumber(int userNumber) {
        return new SuccessDataResult<List<FlashCard>>(this.flashCardDao.getByUserNumber(userNumber));
    }

}

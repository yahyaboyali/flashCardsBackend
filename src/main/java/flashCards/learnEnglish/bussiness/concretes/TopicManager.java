/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flashCards.learnEnglish.bussiness.concretes;

import flashCards.learnEnglish.bussiness.abstracts.TopicService;
import flashCards.learnEnglish.dataAccess.TopicDao;
import flashCards.learnEnglish.entities.concretes.Topic;
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
public class TopicManager implements TopicService {

    private final TopicDao topicDao;

    public TopicManager(TopicDao topicDao) {
        this.topicDao = topicDao;
    }

    @Override
    public DataResult<List<Topic>> getAll() {
        return new SuccessDataResult<List<Topic>>(this.topicDao.findAll());
    }

    @Override
    public DataResult<Topic> getById(int id) {
        return new SuccessDataResult<Topic>(this.topicDao.findById(id).get());
    }

    @Override
    public DataResult<Topic> getByName(String name) {
        return new SuccessDataResult<Topic>(this.topicDao.findByName(name));
    }

    @Override
    public Result add(Topic topic) {
        this.topicDao.save(topic);
        return new SuccessResult("Success");
    }

    @Override
    public DataResult<List<Topic>> getByUserNumber(int userNumber) {
        return new SuccessDataResult<List<Topic>>(this.topicDao.findByUserNumber(userNumber));
    }

}

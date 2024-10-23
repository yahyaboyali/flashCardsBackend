/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package flashCards.learnEnglish.bussiness.abstracts;

import flashCards.learnEnglish.entities.concretes.Topic;
import flashCards.learnEnglish.utilities.DataResult;
import flashCards.learnEnglish.utilities.Result;
import java.util.List;

/**
 *
 * @author yahya
 */
public interface TopicService {

    DataResult<List<Topic>> getAll();

    DataResult<Topic> getById(int id);

    DataResult<Topic> getByName(String name);

    DataResult<List<Topic>> getByUserNumber(int userNumber);

    Result add(Topic topic);
}

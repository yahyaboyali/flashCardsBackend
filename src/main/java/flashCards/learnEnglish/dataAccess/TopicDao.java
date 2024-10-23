/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package flashCards.learnEnglish.dataAccess;

import flashCards.learnEnglish.entities.concretes.Topic;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author yahya
 */
public interface TopicDao extends JpaRepository<Topic, Integer> {

    public Topic findByName(String name);

    public List<Topic> findByUserNumber(int userNumber);

}

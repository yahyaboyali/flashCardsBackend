/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flashCards.learnEnglish.dataAccess;

import flashCards.learnEnglish.entities.concretes.FlashCard;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author yahya
 */
public interface FlashCardDao extends JpaRepository<FlashCard,Integer> {
    FlashCard getByWord(String word);
}

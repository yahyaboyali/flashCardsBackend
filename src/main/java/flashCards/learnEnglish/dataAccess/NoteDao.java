/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package flashCards.learnEnglish.dataAccess;

import flashCards.learnEnglish.entities.concretes.Note;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author yahya
 */
public interface NoteDao extends JpaRepository<Note, Integer> {

    List<Note> findByUserNumber(int userNumber);

    Note findByTitle(String title);

}

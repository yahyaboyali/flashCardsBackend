/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package flashCards.learnEnglish.dataAccess;

import flashCards.learnEnglish.entities.concretes.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author yahya
 */
public interface UsersDao extends JpaRepository<Users, Integer> {

    Users getByUserName(String userName);

}

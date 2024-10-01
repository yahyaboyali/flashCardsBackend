/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package flashCards.learnEnglish.bussiness.abstracts;

import flashCards.learnEnglish.entities.concretes.Users;
import flashCards.learnEnglish.utilities.DataResult;
import java.util.List;

/**
 *
 * @author yahya
 */
public interface UsersService {

    DataResult<List<Users>> getAll();

    DataResult<Users> getByUserName(String userName);

    DataResult<Users> getById(int id);
}

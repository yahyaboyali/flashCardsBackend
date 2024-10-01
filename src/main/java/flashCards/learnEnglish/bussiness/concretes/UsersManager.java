/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flashCards.learnEnglish.bussiness.concretes;

import flashCards.learnEnglish.bussiness.abstracts.UsersService;
import flashCards.learnEnglish.dataAccess.UsersDao;
import flashCards.learnEnglish.entities.concretes.Users;
import flashCards.learnEnglish.utilities.DataResult;
import flashCards.learnEnglish.utilities.SuccessDataResult;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author yahya
 */
@Service
public class UsersManager implements UsersService {

    private final UsersDao usersDao;

    public UsersManager(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    @Override
    public DataResult<List<Users>> getAll() {
        return new SuccessDataResult<List<Users>>(this.usersDao.findAll());
    }

    @Override
    public DataResult<Users> getByUserName(String userName) {
        return new SuccessDataResult<Users>(this.usersDao.getByUserName(userName));
    }

    @Override
    public DataResult<Users> getById(int id) {
        return new SuccessDataResult<Users>(this.usersDao.findById(id).get());
    }

}

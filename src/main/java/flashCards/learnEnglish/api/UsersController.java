/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flashCards.learnEnglish.api;

import flashCards.learnEnglish.bussiness.abstracts.UsersService;
import flashCards.learnEnglish.entities.concretes.Users;
import flashCards.learnEnglish.utilities.DataResult;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yahya
 */
@RestController
@RequestMapping("api/users")
@CrossOrigin
public class UsersController {

    private final UsersService userService;

    @Autowired
    public UsersController(UsersService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Users>> getAll() {
        return this.userService.getAll();
    }

    @GetMapping("/getByUserName/{userName}")
    public DataResult<Users> getByUserName(@PathVariable String userName) {
        return this.userService.getByUserName(userName);
    }

    @GetMapping("/getByUserId/{id}")
    public DataResult<Users> getByUserId(@PathVariable int id) {
        return this.userService.getById(id);
    }

}

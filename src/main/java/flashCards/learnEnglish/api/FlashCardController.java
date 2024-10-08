/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flashCards.learnEnglish.api;

import flashCards.learnEnglish.bussiness.abstracts.FlashCardService;
import flashCards.learnEnglish.entities.concretes.FlashCard;
import flashCards.learnEnglish.utilities.DataResult;
import flashCards.learnEnglish.utilities.Result;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yahya
 */
@RestController
@RequestMapping("api/words")
@CrossOrigin
public class FlashCardController {

    private final FlashCardService flashCardService;

    @Autowired
    public FlashCardController(FlashCardService flashCardService) {
        this.flashCardService = flashCardService;
    }

    @GetMapping("/getAll")
    public DataResult<List<FlashCard>> getAll() {
        return this.flashCardService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody FlashCard flashCard) {
        return this.flashCardService.add(flashCard);
    }

    @GetMapping("/getUserFlashCards/{userNumber}")
    public DataResult<List<FlashCard>> getByUserId(@PathVariable int userNumber) {
        return this.flashCardService.getByUserNumber(userNumber);
    }

}

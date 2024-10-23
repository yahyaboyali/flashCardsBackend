/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flashCards.learnEnglish.api;

import flashCards.learnEnglish.bussiness.abstracts.TopicService;
import flashCards.learnEnglish.entities.concretes.Topic;
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
@RequestMapping("api/topic")
@CrossOrigin
public class TopicController {

    private final TopicService topicService;

    @Autowired
    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Topic>> getAll() {
        return this.topicService.getAll();
    }

    @GetMapping("/getByTopicId/{id}")
    public DataResult<Topic> getByTopicId(@PathVariable int id) {
        return this.topicService.getById(id);
    }

    @GetMapping("/getByName/{userNumber}")
    public DataResult<Topic> getByName(@PathVariable String name) {
        return this.topicService.getByName(name);
    }

    @GetMapping("/getByUserNumber/{userNumber}")
    public DataResult<List<Topic>> getByUserNumber(@PathVariable int userNumber) {
        return this.topicService.getByUserNumber(userNumber);
    }

    @PostMapping("/add")
    public Result add(@RequestBody Topic topic) {
        return this.topicService.add(topic);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flashCards.learnEnglish.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author yahya
 */
@Table(name = "flash_card")
@Entity
public class FlashCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "word",columnDefinition = "TEXT")
    private String word;

    @Column(name = "sentence",columnDefinition = "TEXT")
    private String sentence;

    @Column(name = "translate",columnDefinition = "TEXT")
    private String translate;

    @Column(name = "user_number")
    private int userNumber;

    public FlashCard(int id, String word, String sentence, String translate, int userNumber) {
        this.id = id;
        this.word = word;
        this.sentence = sentence;
        this.translate = translate;
        this.userNumber = userNumber;
    }

    public FlashCard() {
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserId(int userNumber) {
        this.userNumber = userNumber;
    }

}

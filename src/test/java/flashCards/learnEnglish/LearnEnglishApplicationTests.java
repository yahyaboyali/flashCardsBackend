package flashCards.learnEnglish;

import flashCards.learnEnglish.dataAccess.FlashCardDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest(classes = LearnEnglishApplication.class)
class LearnEnglishApplicationTests {

    @MockBean
    private FlashCardDao flashCardDao;  // Veri tabanı erişimini mock'lama

    @Test
    void contextLoads() {
    }

}

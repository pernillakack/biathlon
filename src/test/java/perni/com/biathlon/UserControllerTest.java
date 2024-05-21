package perni.com.biathlon;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import perni.com.biathlon.controllers.UserController;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserControllerTest {
    @Autowired
    private UserController userController;

    @Test
    void contextLoads() throws Exception {
        assertThat(userController).isNotNull();
    }
}

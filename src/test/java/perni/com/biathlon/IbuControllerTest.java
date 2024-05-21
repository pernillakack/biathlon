package perni.com.biathlon;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import perni.com.biathlon.controllers.IbuController;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class IbuControllerTest {

    @Autowired
    private IbuController ibuController;

    @Test
    void contextLoads() throws Exception {
        assertThat(ibuController).isNotNull();
    }
}

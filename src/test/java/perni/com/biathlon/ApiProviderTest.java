package perni.com.biathlon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ApiProviderTest {

    WebDriver driver;
    String IBUid = "IBUId=BTSWE20211199501";

    @BeforeEach
    void driverSetUp() {
        driver = new FirefoxDriver();
    }


    @Test
    public void checkFirstElement() {
        driver.get("https://biathlonresults.com/modules/sportapi/api/CISBios?" + IBUid);
        WebElement element = driver.findElement(By.tagName("CISBiosResponse"));
        assertNotNull(element);
        driver.quit();
    }
}

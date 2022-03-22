package UI;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UiTest {
    private WebDriverWait wait;
    private WebDriver driver;

    public void setup() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1600x1200";
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;
        wait = new WebDriverWait(driver, 5);
    }

    @BeforeClass
    public void init() {
        setup();
    }

    @AfterClass
    public void tearDown() {
        // Selenide.closeWebDriver();
    }


}

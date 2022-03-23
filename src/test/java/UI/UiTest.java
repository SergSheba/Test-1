package UI;
import javax.xml.bind.Element;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

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
        Configuration.pageLoadTimeout = 300000;


    }

    @BeforeClass
    public void init() {
        setup();
    }

    @AfterClass
    public void tearDown() {
        Selenide.closeWebDriver();
    }


}

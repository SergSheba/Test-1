package Pages;/*
Главная страницца Гугл

 */

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.$x;

public class GooglePage {
    private final SelenideElement textBox = $x("//input[@type='text']");

    public GooglePage(String url) {
        Selenide.open(url);
    }

    /**
     * Выполняется поиск на сайте Гугл "Открытие" и нажимается Enter
     *
     * @param searchString
     */
    public void search(String searchString) {
        textBox.setValue(searchString);
        textBox.sendKeys(Keys.ENTER);
    }
}

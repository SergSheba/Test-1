package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    private final SelenideElement articleTitle = $x("//h3[contains(.,\"Банк Открытие: Частным клиентам\")]");

    public SearchPage() {

    }

    public void clickOpen() {

        articleTitle.click();
    }

}

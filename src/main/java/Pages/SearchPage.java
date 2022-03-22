package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import static com.codeborne.selenide.Selenide.$$x;

public class SearchPage {
    private final ElementsCollection articleTitle = $$x("//cite[@class='iUh30 tjvcx']");

    public SearchPage() {
        Selenide.open();
    }

    public void checkOpen() {
        Assert.assertEquals(articleTitle.get(0).getText(), "https://www.open.ru");
    }

    public void clickOpen() {

        articleTitle.first().click();
    }

    /**
     * Возвращает класс из первой ссылки.
     *
     * @return
     */
    public String searchOpen() {

        return articleTitle.first().getAttribute("cite class");
    }

}

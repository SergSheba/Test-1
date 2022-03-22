package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.bind.Element;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.element;

public class OpenPage {
    private final ElementsCollection articleTitleExchange = $$x("//div[@class='main-page-exchange main-page-info__card']");
    private final Element exchangeBuyUsd = (Element) $$x("//div[@class='main-page-exchange__indicator main-page-exchange__indicator--down']");
    private final Element exchangeSellUsd = (Element) $$x("//div[@class='main-page-exchange__indicator']");
    private final Element exchangeBuyEur = (Element) $$x("//*[@id=\"main\"]/div/div/div[9]/section/div/div/div[1]/div/div/div/div/div[2]/table/tbody/tr[3]/td[2]/div");
    private final Element exchangeSellEur = (Element) $$x("//*[@id=\"main\"]/div/div/div[9]/section/div/div/div[1]/div/div/div/div/div[2]/table/tbody/tr[3]/td[4]/div/span");


    public OpenPage() {

        Selenide.open();
    }
    public void scrollExchange() {
        SelenideElement element = null;
        element.scrollIntoView(String.valueOf(articleTitleExchange));

    }

    public void parseExchange() {
        double a = Double.parseDouble(String.valueOf(exchangeBuyUsd));
        double b = Double.parseDouble(String.valueOf(exchangeSellUsd));
        double c = Double.parseDouble(String.valueOf(exchangeBuyEur));
        double d = Double.parseDouble(String.valueOf(exchangeSellEur));



    }

    public void checkExchange() {
        
    }
}

package IntermediateElementClass;

import BasePackage.FactoryClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ElementsPOM extends FactoryClass {

    public ElementsPOM(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "card")
    List<WebElement> listHome;
    public void clickOnElements() {
        listHome.get(0).click();
    }
    @FindBy(className = "btn")
    List<WebElement> listElements;
    public List<WebElement> getListElements() {
        return listElements;
    }
    public void selectAPageFromElements(int page) {
        this.clickOnElements();
        this.getListElements().get(page).click();
    }
}

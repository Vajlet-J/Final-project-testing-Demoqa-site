package POM.Elements;

import BasePackage.ActionsClass;
import BasePackage.FactoryClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Buttons extends FactoryClass{

     public Buttons(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "doubleClickBtn")
    WebElement doubleclick;
     public void doubleClick(){
         ac.clickDoubleClick(doubleclick);
     }
     public void clickDouble(){
       doubleclick.click();
     }
    @FindBy(id = "rightClickBtn")
    WebElement rightclick;
     public void rightClick(){
         ac.clickRightClick(rightclick);
     }
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/button")
    WebElement clickMe;
    public void clickClickMe(){
        clickMe.click();
    }
    @FindBy(id = "doubleClickMessage")
    WebElement msgDoubleClick;
    public WebElement getMsgDoubleClick() {
        return msgDoubleClick;
    }
    @FindBy(id = "rightClickMessage")
    WebElement msgRightClick;
    public WebElement getMsgRightClick() {
        return msgRightClick;
    }
    @FindBy(id = "dynamicClickMessage")
    WebElement msgClickMe;
    public WebElement getMsgClickMe() {
        return msgClickMe;
    }
    @FindBy(className = "mt-40")
    WebElement buttonsPage;
    public WebElement getButtonsPage() {
        return buttonsPage;
    }
}

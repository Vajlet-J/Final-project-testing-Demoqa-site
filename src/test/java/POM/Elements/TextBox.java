package POM.Elements;

import BasePackage.FactoryClass;
import IntermediateElementClass.ElementsPOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TextBox extends FactoryClass {

    public TextBox(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='userName']")
    WebElement fullName;
    public void nameInput(String ime){
        fullName.sendKeys(ime);
    }
    @FindBy(xpath = "//input[@id='userEmail']")
    WebElement email;
    public void emailInput(String mail){
        email.sendKeys(mail);
    }
    public WebElement getEmail() {
        return email;
    }
    @FindBy(xpath = "//textarea[@id='currentAddress']")
    WebElement cAddress;
    public void currentAddInput(String adresa){
        cAddress.sendKeys(adresa);
    }
    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    WebElement pAddress;
    public void pAdrInsert(String padres){
        pAddress.sendKeys(padres);
    }
    @FindBy(xpath = "//button[@id='submit']")
    WebElement button;
    public void clickButton(){
        button.click();
    }
    public String hexColor(){
        String boja = getEmail().getCssValue("color");
        String hex = Color.fromString(boja).asHex();
        return hex;
    }
    @FindBy(className = "mb-1")
    List<WebElement> rowList;
    public List<WebElement> getRowList() {
        return rowList;
    }
}



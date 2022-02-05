package POM.Elements;

import BasePackage.FactoryClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebTables extends FactoryClass {

    public WebTables(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "addNewRecordButton")
    WebElement addButton;
    @FindBy(id = "firstName")
    WebElement firstName;
    @FindBy(id = "lastName")
    WebElement lastName;
    @FindBy(id = "userEmail")
    WebElement email;
    @FindBy(id = "age")
    WebElement age;
    @FindBy(id = "salary")
    WebElement salary;
    @FindBy(id = "department")
    WebElement department;
    @FindBy(id = "submit")
    WebElement submitButton;

    public void registrationForm(String fname,String lname,String mail,String age,String salary,String dep) {
        addButton.click();
        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        email.sendKeys(mail);
        this.age.sendKeys(age);
        this.salary.sendKeys(salary);
        department.sendKeys(dep);
        submitButton.click();
    }
    @FindBy(className = "mr-2")
    List<WebElement> listaElemenata;
    public List<WebElement> getListaElemenata() {
        return listaElemenata;
    }
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/span[2]/select[1]")
    WebElement duzaLista;
    public void duza(){
        Select s = new Select(duzaLista);
        s.selectByValue("100");
    }

}

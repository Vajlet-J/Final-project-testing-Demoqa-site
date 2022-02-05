package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FactoryClass extends ActionsClass {

    protected WebDriver driver;
    protected ActionsClass ac;

    public FactoryClass(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
        ac = new ActionsClass(driver);
    }
}

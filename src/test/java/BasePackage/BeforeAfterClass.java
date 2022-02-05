package BasePackage;

import IntermediateElementClass.ElementsPOM;
import POM.Elements.Buttons;
import POM.Elements.TextBox;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BeforeAfterClass {

    protected WebDriver driver;
    protected ElementsPOM epom;
    protected TextBox tb;
    protected Buttons b;

    @BeforeClass
    public void init(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //Objects:
        epom = new ElementsPOM(driver);
        tb = new TextBox(driver);
        b = new Buttons(driver);

    }
    @AfterTest
    public void close(){
        driver.close();
    }



}

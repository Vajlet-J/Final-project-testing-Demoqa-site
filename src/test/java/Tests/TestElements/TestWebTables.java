package Tests.TestElements;

import BasePackage.BeforeAfterClass;
import com.github.javafaker.Faker;
import org.testng.annotations.BeforeMethod;

public class TestWebTables extends BeforeAfterClass {
    Faker faker;
    @BeforeMethod
    public void before(){
        driver.get("https://demoqa.com/");
        epom.selectAPageFromElements(3);
    }


}

package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

  protected WebDriver driver;

  public ActionsClass(WebDriver driver) {
    this.driver = driver;
  }

  public void clickRightClick(WebElement element){
    Actions ac = new Actions(driver);
    ac.contextClick(element).perform();
  }
  public void clickDoubleClick(WebElement element){
    Actions ac = new Actions(driver);
    ac.doubleClick(element).perform();
  }

}

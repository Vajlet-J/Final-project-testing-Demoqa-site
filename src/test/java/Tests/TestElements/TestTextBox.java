package Tests.TestElements;

import BasePackage.BeforeAfterClass;
import POM.Elements.TextBox;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestTextBox extends BeforeAfterClass {

    @DataProvider(name = "podaci")
    public Object[][] nizPodataka(){
        return new Object[][]{
                {"Marko", "marko@email.com", "Danila Kisa", "Maxima"},
                {"Janko", "jan@hotmail.com", "Bulevar", "Narodnog"},
                {"Srdjan", "srki@yahoo.com", "Laza", "Kostic"}
        };
    }

    /**Test case
     * 1. Go to https://demoqa.com/text-box
     * 2. Insert valid name
     * 3. Insert valid email
     * 4. Insert valid address
     * 5. Insert valid permanent address
     * 6. Click on a Submit button
     * 7. Assert that pop up is there
     */

    @Test(dataProvider = "podaci")
    public void happyPath(String ime,String mail,String adr, String adr2) throws InterruptedException {
        driver.get("https://demoqa.com/text-box");
        tb.nameInput(ime);
        tb.emailInput(mail);
        tb.currentAddInput(adr);
        tb.pAdrInsert(adr2);
        tb.clickButton();
        Thread.sleep(2000);

        Assert.assertTrue(driver.findElement(By.xpath(
                "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]")).isDisplayed(),
                "Pop up ne postoji.");
    }

    /**Test case
     * 1. Go to https://demoqa.com/text-box
     * 2. Input valid name
     * 3. Input wrong email
     * 4. Input valid address
     * 5. Input valid permanent address
     * 6. Click on a Submit button
     * 7. Assert that field is red framed
     */

    @Test
    public void unHappyPathWrongEmail(){
        driver.get("https://demoqa.com/text-box");
        tb.nameInput("Gojko");
        tb.getEmail().sendKeys("mail@");
        tb.currentAddInput("Jevrejska");
        tb.pAdrInsert("Safarikova");
        tb.clickButton();

        Assert.assertEquals(tb.hexColor(),"#495057");
    }

    /**Test case
     * 1. Go to https://demoqa.com/text-box
     * 2. Skip entering name
     * 3. Input valid email
     * 4. Input valid address
     * 5. Input valid permanent address
     * 6. Click on a Submit button
     * 7. Assert that appeared 3 elements
     */

    @Test
    public void unHappyPathWrongName(){
        driver.get("https://demoqa.com/text-box");
        tb.getEmail().sendKeys("mail@bhrfswe.com");
        tb.currentAddInput("Jevrejska");
        tb.pAdrInsert("Safarikova");
        tb.clickButton();

        Assert.assertEquals( String.valueOf(tb.getRowList().size()),"3");
    }
}

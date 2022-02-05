package Tests.TestElements;

import BasePackage.BeforeAfterClass;
import POM.Elements.Buttons;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestButtons extends BeforeAfterClass {
    @BeforeMethod
    public void before(){
        driver.get("https://demoqa.com/");
        epom.selectAPageFromElements(4);
    }

    /** Test case
     * 1. Go to https://demoqa.com/
     * 2. Click on the Elements
     * 3. Click on the Buttons
     * 4. Double-click on first element
     * 5. Assert that the confirmation message is present
     */

    @Test(priority = 1)
    public void doubleClickHappyPath(){
        b.doubleClick();
        Assert.assertTrue(b.getMsgDoubleClick().getText().contains("double click"),"Double click is not performed");
    }

    /** Test case
     * 1. Go to https://demoqa.com/
     * 2. Click on the Elements
     * 3. Click on the Buttons
     * 4. Right click on second element
     * 5. Assert that the confirmation message is present
     */

    @Test(priority = 2)
    public void rightClickHappyPath(){
        b.rightClick();
        Assert.assertTrue(b.getMsgRightClick().getText().contains("right click"),"Right click is not performed");
    }

    /** Test case
     * 1. Go to https://demoqa.com/
     * 2. Click on the Elements
     * 3. Click on the Buttons
     * 4. Click on third element
     * 5. Assert that the confirmation message is present
     */

    @Test(priority = 3)
    public void clickMeHappyPath(){;
        b.clickClickMe();
        Assert.assertTrue(b.getMsgClickMe().getText().contains("dynamic click"),"Dynamic click is not performed");
    }

    /**Test case
     * 1. Go to https://demoqa.com/
     * 2. Click on the Elements
     * 3. Click on the Buttons
     * 4. Do one left click on first element
     * 5. Assert that the confirmation message is not present
     */

    @Test(priority = 4)
    public void doubleClickUnHappyPath(){
        b.clickDouble();
        Assert.assertFalse(b.getButtonsPage().getText().contains("have done a double click"));
    }

    /**Test case
     * 1. Go to https://demoqa.com/
     * 2. Click on the Elements
     * 3. Click on the Buttons
     * 4. Do one left click on second element
     * 5. Assert that the confirmation message is not present
     */

    @Test(priority = 5)
    public void rightClickUnHappyPath(){
        b.clickDouble();
        Assert.assertFalse(b.getButtonsPage().getText().contains("have done a right click"));
    }
}

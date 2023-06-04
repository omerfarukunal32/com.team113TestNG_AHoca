package tests.UiProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Set;

public class US_34 {

    @Test
    public void tc01(){
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        String firstWHD = Driver.getDriver().getWindowHandle();

        String expectedIcerik = "Login";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedIcerik,actualTitle);

        WebElement adminLoginEmailElement= Driver.getDriver().findElement(By.id("email"));
        adminLoginEmailElement.sendKeys(ConfigReader.getProperty("admin01Email"));

        WebElement adminPasswordElement= Driver.getDriver().findElement(By.id("password"));
        adminPasswordElement.sendKeys(ConfigReader.getProperty("adminPassword"));

        WebElement adminLoginButtonElement = Driver.getDriver().findElement(By.xpath("//*[@type='submit']"));
        adminLoginButtonElement.click();

        WebElement adminOrderButtonElement = Driver.getDriver().findElement(By.xpath("//*[@class='nav-item '][10]"));
        adminOrderButtonElement.click();

        WebElement invoiceFirstElement = Driver.getDriver().findElement(By.xpath("//*[text()='Invoice']"));
        invoiceFirstElement.click();

        String secondWHD = "";
        Set<String> whdSeti = Driver.getDriver().getWindowHandles();

        for (String eachWHD: whdSeti
             ) {
            if (!eachWHD.equals(firstWHD)){
                secondWHD=eachWHD;
            }
        }
        Driver.getDriver().switchTo().window(secondWHD);

        WebElement printInvoiceElement = Driver.getDriver().findElement(By.xpath("//*[text()='Print Invoice']"));
        Assert.assertTrue(printInvoiceElement.isDisplayed());

        Driver.quitDriver();
    }
}

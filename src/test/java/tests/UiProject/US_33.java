package tests.UiProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Set;

public class US_33 {
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

        WebElement firstOrderDetailElement = Driver.getDriver().findElement(By.xpath("//*[text()='Detail']"));
        firstOrderDetailElement.click();
        // artik iki tab acildi

        String secondWHD = "";
        Set<String> whdSet = Driver.getDriver().getWindowHandles();

        for (String eachWHD: whdSet
             ) {
            if (!eachWHD.equals(firstWHD)){
                secondWHD=eachWHD;
            }
        }
        Driver.getDriver().switchTo().window(secondWHD);

        expectedIcerik = "Order Detail";
        String actualTextElement = Driver.getDriver().findElement(By.xpath("//h1[text()='Order Detail']")).getText();
        Assert.assertEquals(expectedIcerik,actualTextElement);

        Driver.quitDriver();

    }
}

package tests.UiProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_US_032 {
    @Test
    public void TestUi() throws InterruptedException {
        Driver.getDriver().get("https://qa.tripandway.com/admin/login");

        String expectedIcerik = "Login";
        String actualLoginTitle= Driver.getDriver().getTitle();
        Assert.assertEquals(expectedIcerik,actualLoginTitle);

        WebElement emailElementi = Driver.getDriver().findElement(By.id("email"));
        emailElementi.sendKeys("admin03@tripandway.com");

        WebElement passwordElementi = Driver.getDriver().findElement(By.id("password"));
        passwordElementi.sendKeys("123123123");

        Driver.getDriver().findElement(By.xpath("//*[@type='submit']")).click();
        Thread.sleep(1000);

        Driver.getDriver().findElement(By.xpath("//*[@class='nav-item '][10]")).click();

        expectedIcerik="View Orders";
        String actualWiewOrdersElementi= Driver.getDriver().findElement(By.xpath("//*[text()='View Orders']")).getText();

        Assert.assertEquals(expectedIcerik,actualWiewOrdersElementi);




    }
}

package tests.UiProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class US_18 {

    @Test(priority = 1)
    public void TC_01()  {
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));

        Driver.getDriver().findElement(By.xpath("//*[@type='button']")).click();  // cookies

        Driver.getDriver().findElement(By.xpath("//*[text()='Registration']")).click();  // registration buttonu

        WebElement nameRegistrationElementi= Driver.getDriver().findElement(By.xpath("//*[@type='text'][1]"));
        nameRegistrationElementi.sendKeys("svd");

        WebElement emailRegistrationElementi= Driver.getDriver().findElement(By.xpath("//*[@type='email']"));
        emailRegistrationElementi.sendKeys("svdbsk3232@gmail.com");

        WebElement passwordRegElementi= Driver.getDriver().findElement(By.xpath("//*[@type='password']"));
        passwordRegElementi.sendKeys("svdbsk3232@");

        WebElement makeRegistrationElementi =Driver.getDriver().findElement(By.xpath("//*[@type='submit']"));
        makeRegistrationElementi.click();

        WebElement toastAlertElement = Driver.getDriver().findElement(By.xpath("//div[@class='toast-message']"));
        Assert.assertTrue(toastAlertElement.isDisplayed());

        Driver.getDriver().switchTo().newWindow(WindowType.TAB);

        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));

        WebElement ilkLoginElement = Driver.getDriver().findElement(By.xpath("//*[text()='Login']"));
        ilkLoginElement.click();

        WebElement emailLogginElementi = Driver.getDriver().findElement(By.xpath("//*[@type='text'][1]"));
        emailLogginElementi.sendKeys("svdbsk3232@gmail.com");

        WebElement passwordLoginElement = Driver.getDriver().findElement(By.xpath("//*[@type='password']"));
        passwordLoginElement.sendKeys("svdbsk3232@");

        WebElement ikinciLoginElementi = Driver.getDriver().findElement(By.xpath("//*[@type='submit'][1]"));
        ikinciLoginElementi.click();

        WebElement updatePasswordElement = Driver.getDriver().findElement(By.xpath("//*[text()='Update Profile']"));
        Assert.assertTrue(updatePasswordElement.isDisplayed());

        Driver.quitDriver();

        // already exists   ( //div[@class='toast-message'] )

    }

}

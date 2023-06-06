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
        //Go to https://qa.tripandway.com/
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));

        // Acilan sayfada cookies kabul edilir
        Driver.getDriver().findElement(By.xpath("//*[@type='button']")).click();  // cookies

        // "Registration" butonuna tiklanir
        Driver.getDriver().findElement(By.xpath("//*[text()='Registration']")).click();  // registration buttonu

        //"Name" kutusuna isim yazilir
        WebElement nameRegistrationElementi= Driver.getDriver().findElement(By.xpath("//*[@type='text'][1]"));
        nameRegistrationElementi.sendKeys("svd");

        //"Email Address" kutusuna Email adresi girilir
        WebElement emailRegistrationElementi= Driver.getDriver().findElement(By.xpath("//*[@type='email']"));
        emailRegistrationElementi.sendKeys("svdbsk3232@gmail.com");

        //"Password" kutusuna Pasword girilir
        WebElement passwordRegElementi= Driver.getDriver().findElement(By.xpath("//*[@type='password']"));
        passwordRegElementi.sendKeys("svdbsk3232@");

        //"Make Registration" kutusuna tiklanir
        WebElement makeRegistrationElementi =Driver.getDriver().findElement(By.xpath("//*[@type='submit']"));
        makeRegistrationElementi.click();

        // Already Exists yazisinin gorulebildigi kontrol edilmeli
        WebElement toastAlertElement = Driver.getDriver().findElement(By.xpath("//div[@class='toast-message']"));
        Assert.assertTrue(toastAlertElement.isDisplayed());

        // Yeni sekme acilir
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);


        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));

        //"Login" butonuna tiklanir
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

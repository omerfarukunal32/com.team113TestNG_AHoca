package tests.UiProject;

public class Yedek_US18 {
    /*
    package tests.test.US_18_32_33_34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_18 {

    UserHomepage userHomepage = new UserHomepage();
    @Test
    public void TC_01() {
        //Go to https://qa.tripandway.com/
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));

        // Acilan sayfada cookies kabul edilir
        userHomepage.cookiesAcceptButton.click();

        // "Registration" butonuna tiklanir
        userHomepage.registrationLink.click();

        //"Name" kutusuna isim yazilir
        userHomepage.registrationNameBox.sendKeys(ConfigReader.getProperty("loginName"));

        //"Email Address" kutusuna Email adresi girilir
        userHomepage.registrationEmailBox.sendKeys(ConfigReader.getProperty("loginEmail"));

        //"Password" kutusuna Pasword girilir
        userHomepage.registrationPasswordBox.sendKeys(ConfigReader.getProperty("loginPassword"));

        //"Make Registration" kutusuna tiklanir
        userHomepage.registrationSubmitButton.click();

        // Already Exists yazisinin gorulebildigi kontrol edilmeli
        Assert.assertTrue(userHomepage.regAlreadyExistsMassage.isDisplayed());

        // Yeni sekme acilir
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);

        //Go to https://qa.tripandway.com/
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));

        //"Login" butonuna tiklanir
        userHomepage.loginLink.click();

        // "Email Adress" kutusuna Email girilir
        userHomepage.loginEmailBox.sendKeys(ConfigReader.getProperty("loginEmail"));

        // "Password" kutusuna password girilir
        userHomepage.loginPasswordBox.sendKeys(ConfigReader.getProperty("loginPassword"));

        //"Login" butonuna tiklanir
        userHomepage.loginSubmitButton.click();

        // Title' in "Traveller Panel" oldugu kontrol edilir
        String expectedTitle = "Traveller Panel";
        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());

        // Quit to Browser
        Driver.quitDriver();


    }



}

     */
}

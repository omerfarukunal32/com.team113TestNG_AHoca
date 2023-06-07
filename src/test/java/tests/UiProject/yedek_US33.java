package tests.UiProject;

public class yedek_US33 {
    /*
    package tests.test.US_18_32_33_34;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Set;

public class Us_33 {

    AdminDashboard adminDashboard = new AdminDashboard();

    @Test
    public void tc52(){
        // Go to "https://qa.tripandway.com/admin/login"

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        String firstWH= Driver.getDriver().getWindowHandle();

        // sayfanin basliginin "Login" oldugu dogrulanir
        String expectedTitle= "Login";
        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());

        // EmailBox'a email girilir
        adminDashboard.adminEmailBox.sendKeys(ConfigReader.getProperty("admin03Email"));

        // PasswordBox'a password girilir
        adminDashboard.adminPasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));

        // "Login" butonuna tiklanir
        adminDashboard.adminLoginButton.click();

        // "Order" butonuna tiklanir
        adminDashboard.adminPanelOrderButton.click();

        // ilk siparisteki "Detail" butonuna tiklanir
        adminDashboard.ordersFirstOrderDetailButton.click();

        // Acilan yeni sekmede "Order Detail" yazisinin gurunur oldugu dogrulanir
        String secondWH="";
        Set<String> WhSet = Driver.getDriver().getWindowHandles();
        for (String eachWH: WhSet
             ) {
            if (!eachWH.equals(firstWH)){
                secondWH=eachWH;
            }
        }
        Driver.getDriver().switchTo().window(secondWH);
        Assert.assertTrue(adminDashboard.ordersFirstOrderDetailTitle.isDisplayed());

        // Close to Browser
        Driver.quitDriver();
    }
}

     */
}

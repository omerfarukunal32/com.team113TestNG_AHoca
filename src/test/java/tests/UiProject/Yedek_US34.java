package tests.UiProject;

public class Yedek_US34 {
    /*
    package tests.test.US_18_32_33_34;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Set;

public class Us_34 {
    AdminDashboard adminDashboard = new AdminDashboard();

    @Test
    public void tc53(){
        // Go to "https://qa.tripandway.com/admin/login"
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        String firstWH = Driver.getDriver().getWindowHandle();

        // Acilan sayfanin basliginin "Login" oldugu dogrulanmali
        String expectedTitle = "Login";
        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());

        // EmailBox'a email girilir
        adminDashboard.adminEmailBox.sendKeys(ConfigReader.getProperty("admin03Email"));

        // PasswordBox'a password girilir
        adminDashboard.adminPasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));

        // "Login" butonuna tiklanir
        adminDashboard.adminLoginButton.click();

        // "Order" butonuna tiklanir
        adminDashboard.adminPanelOrderButton.click();

        // ilk siparisteki "Invoice" butonuna tiklanir
        adminDashboard.ordersFirstOrderInvoiceButton.click();

        // Acilan yeni sekmede "Print Invoice" butonunun gorunur oldugu dogrulanir
        String secondWH = "";
        Set<String> WhSet = Driver.getDriver().getWindowHandles();
        for (String eachWh: WhSet
             ) {
            if (!eachWh.equals(firstWH)){
                secondWH=eachWh;
            }
        }
        Driver.getDriver().switchTo().window(secondWH);
        Assert.assertTrue(adminDashboard.ordersFirstOrderPrintInvoiceButton.isDisplayed());

        // Quit to Browser
        Driver.quitDriver();

    }
}

     */
}

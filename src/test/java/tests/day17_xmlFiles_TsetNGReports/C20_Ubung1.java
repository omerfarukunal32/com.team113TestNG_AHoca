package tests.day17_xmlFiles_TsetNGReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.ReusableMethods;

public class C20_Ubung1 {

    @Test
    public void test01() throws InterruptedException {
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        SoftAssert softAssert=new SoftAssert();
        WebElement ilkSayfaText = Driver.getDriver().findElement(By.tagName("h3"));
        String actualText= ilkSayfaText.getText();
        String expectedText="Opening a new window";

        softAssert.assertEquals(actualText,expectedText,"Ilk sayfa text'i beklenen text degil");
        String ersteWHD= Driver.getDriver().getWindowHandle();

        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String actualTitle= Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        String expectedTitle="The Internet";
        softAssert.assertEquals(actualTitle,expectedTitle,"title beklenen degil");

        //● Click Here butonuna basın.
        Driver.getDriver().findElement(By.xpath("//*[text()='Click Here']")).click();
        String zweiteWHD = Driver.getDriver().getWindowHandle();
        //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
        ReusableMethods.switchToWindow("New Window"); // Yeni sayfaya gectik
        String actualIkinciSayfaTitle=Driver.getDriver().getTitle();
        String expectedIkinciSayfaTitle= "New Window";
        softAssert.assertEquals(actualIkinciSayfaTitle,expectedIkinciSayfaTitle);

        //● Sayfadaki textin “New Window” olduğunu doğrulayın.
        WebElement ikinciSayfaText= Driver.getDriver().findElement(By.tagName("h3"));
        String actualIkinciSayfaText = ikinciSayfaText.getText();
        String expectedIkinciSayfaText = "New Window";
        softAssert.assertEquals(actualIkinciSayfaText,expectedIkinciSayfaText);

        //● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.
        Driver.getDriver().switchTo().window(ersteWHD);
        expectedTitle="The Internet";
        actualTitle= Driver.getDriver().getTitle();
        softAssert.assertEquals(actualTitle,expectedTitle);

        Thread.sleep(3000);
        softAssert.assertAll();  // bunu yazmayinca testler hep Passed oluyor
        Driver.quitDriver();

    }

}

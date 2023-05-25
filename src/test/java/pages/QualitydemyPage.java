package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitydemyPage {

    public QualitydemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[@class='btn btn-sign-in-simple']")
    public WebElement ilkLogInLinki;

    @FindBy(xpath = "//*[@type='email']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement ikinciLogin;

    @FindBy(xpath = "//*[text()='Instructor']")
    public WebElement basariliGirisElementi;
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    // Page class'lari surekli kullandigimiz locate islemleri
    // ve varsa login gibi kucuk islevleri iceren methodlar barindirir
    // Selenium ile lcate islemi veya herhangi bir islev gerceklestirmek istedigimizde
    // WevDriver objesine ihtiyac vardir

    // POM'de Driver class'inda olusturdugumuz
    // WebDriver driver   objesini page class'larina tanimlamak icin
    // PageFactory class'indan initElements()  kullanilir

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
        // bu ayari constructor icine koyma sebebimiz :
        // page sayfalarina obje olusturularak ulasildigi icin
        // kim page sayfasini kullanmak isterse
        // page sayfasindan obje olusturmak icin, constructor calisacak
        // ve bu constructor icinde bulunan initElements()  gerekli ayari yapmis olacak
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//*[@class='a-color-state a-text-bold']")
    public WebElement aramaSonucuElementi;


}

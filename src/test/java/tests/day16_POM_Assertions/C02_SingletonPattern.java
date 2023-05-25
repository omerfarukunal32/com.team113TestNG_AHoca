package tests.day16_POM_Assertions;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_SingletonPattern {

    @Test
    public void test01(){
        /*
            biz otomasyon icin elimiz ve kolumuz olarak
            Driver class'indaki WebDriver driver objesini kullaniyoruz
            Ancak driver'in bizim istedigimiz islemleri yapabilmesi icin
            oncelikle getDriver() icinde yaptigimiz atama islemlerine ihtiyaci var

            Bir framework'de calisan kisilerin
            getDriver() kullanmadan direkt driver objesine erisimini engellemek icin
            Singleton Pattern kullanumu TERCIH EDILMISTIR

            Singleton Pattern bir class'dan
            obje olusturulmasini ve o obje ile class'daki uyelerine erisimi engellemek icin kullanilir

            OOP konsept cercevesinde
            Driver class'ini farkli farkli yontemlerle kullanabilirsini
            Ekip calismasinin tek duzen uzerinden gitmesi onemli oldugundan

            farkli yontemlerle WebDriver driver  'in kullanimini engellemek istiyoruz
            onun icin Driver constructor'ini private yapiyoruz
            */

        // Driver.driver.get(ConfigReader.getProperty("amazonUrl"));
        // getDriver() calismadigindan driver null olarak isaretlendiginden
        // NullPointerExeption verir

        // bu isleme baslamadan once Driver class'indaki default olan driver objesini public yaptik
        // yapmasa idik bu class'dan gorunmuyordu

        //Driver driver = new Driver();
        // driver.get("amazonUrl");
        // Driver class'da  public olarak gorunur Constructor olusturup obje uzerinden asagida methodlara ulastik
        // driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        // driver.closeDriver();
        // ancak bunlar tercih edilmez

        // Driver class'indaki constructor'i private yapinca
        // kimse Driver class'indan obje olusturamaz

        // Singleton pattern kullanilarak istenmeyen yontemlerle
        // driver objesine ersimini engelledik
        // Consructor'i private yaparak bu class'dan obje olusturarak
        // class uyelerinin kullanilmasinin onune gectik

    }
}

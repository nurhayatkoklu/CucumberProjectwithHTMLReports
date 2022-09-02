package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.slf4j.impl.SimpleLogger;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {
    // Bana neler lazım: 1 browser tipi lazım burada ona göre oluşturucam
    // bir bir paralel çalışan süreç için sadece o sürece özel static bir değişken lazım
    // çünkü rnner classdaki işaret edilen tüm senaryolarda aynısını çalıştırması lazım
    // demek ki  her pipeline i.in (Local) ve de ona özel static bir drivera ihtiyacım var
    // donanımdaki adı pipeline, yazılımdaki adı Thread, paralel çalışan her bir süreç
    public static WebDriver driver;

    private static ThreadLocal<WebDriver> threadDriver=new ThreadLocal<>(); //WebDriver 1 WebDriver 2
    public static ThreadLocal<String> threadBrowserName=new ThreadLocal<>(); // chrome firefox etc...

    // threadDriver.get() - ilgili thread'deki driver'ı verecek
    //threadDriver.set(driver) ilgili threade driver set ediliyor

    public static WebDriver getDriver() {


        Locale.setDefault( new Locale("EN"));
        System.setProperty("user.language","EN");

        Logger.getLogger("").setLevel(Level.SEVERE);
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");

        if (threadBrowserName.get() == null)
            threadBrowserName.set("chrome");


        if (threadDriver.get() == null) {

            String browserName=threadBrowserName.get();

            switch (browserName) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    threadDriver.set(new ChromeDriver());
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    threadDriver.set(new FirefoxDriver());
                    break;

                case "safari":
                    WebDriverManager.safaridriver().setup();
                    threadDriver.set(new SafariDriver());
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    threadDriver.set(new EdgeDriver());
                    break;
            }
        }
        return threadDriver.get();
    }

    public static void quitDriver() {

       Bekle(5);
        if (threadDriver.get() != null) {
            threadDriver.get().quit();

            WebDriver driver = threadDriver.get();
            driver=null;
            threadDriver.set(driver); //tekrar geirse içi boş oluş olsun
        }
    }

    public static void Bekle(int saniye)
    {
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

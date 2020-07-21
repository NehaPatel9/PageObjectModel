import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util1 {

    public  void SetBrowser() {

        System.setProperty("webdriver.chrome.driver", "src\\test\\BrowserDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        }
        public  void CloseBrowser(){
            driver.close();
        }
    }
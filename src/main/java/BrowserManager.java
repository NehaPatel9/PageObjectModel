import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util1 {

    public  void SetBrowser() {

        System.setProperty("webdriver.chrome.driver", "src\\test\\BrowserDriver\\chromedriver.exe");// path to chrome driver
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);// allows to avoid chrome pop ups while running programme
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});//Chrome is being controlled by automated test software notification that
        driver = new ChromeDriver(options);//open chrome driver
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //implicitlyWait
        driver.get("https://demo.nopcommerce.com/");// opens demo nop commerce URL
        driver.manage().window().maximize();// Maximize the screen
    }
        public  void CloseBrowser(){
            driver.close();
        }
    }
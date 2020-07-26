import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util1 {

    public  void SetBrowser() {

//        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\BrowserDriver\\chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("useAutomationExtension", false);
//        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
//        driver = new ChromeDriver(options);
 //       System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\BrowserDriver\\geckodriver.exe");

 //       driver = new FirefoxDriver();

        System.setProperty("webdriver.ie.driver", "src\\test\\resources\\BrowserDriver\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        }
        public  void CloseBrowser(){
            driver.close();
        }
    }
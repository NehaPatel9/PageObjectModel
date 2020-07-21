import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Util1 {
    BrowserManager browserManager = new BrowserManager();//Object created for BrowserManager

    @BeforeMethod
    public void SetBrowser() { //Method to open browser
        browserManager.SetBrowser();
    }

    @AfterMethod
    public void CloseBrowser(ITestResult result) { //Method to close browser
        if (ITestResult.FAILURE == result.getStatus()) {
            ScreenShotCapture(result.getName()+timestamp());

        }
        browserManager.CloseBrowser();
    }

}
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Util1 {
    BrowserManager browserManager= new BrowserManager();//Object created for BrowserManager

    @BeforeMethod
    public void SetBrowser(){ //Method to open browser
        browserManager.SetBrowser();
    }
  // @AfterMethod
   // public  void CloseBrowser(){ //Method to close browser
     //  browserManager.CloseBrowser();
   }
//}


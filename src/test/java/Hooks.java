import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Util1{
    BrowserManager browserManager = new BrowserManager();
    @Before
    public  void SetBrowser(){
        browserManager.SetBrowser();
    }
    @After
    public void CloseBrowser(){

    }

}

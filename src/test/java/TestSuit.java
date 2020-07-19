import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestSuit extends BaseTest {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSubmit registrationSubmit = new RegistrationSubmit();
    Computer computer = new Computer();
    DeskTop deskTop = new DeskTop();
    ProducteMailaFriend producteMailaFriend = new ProducteMailaFriend();
    EmailaFreindmessageSent emailaFreindmessageSent = new EmailaFreindmessageSent();
    DigitalStormVANQUISH digitalStormVANQUISH = new DigitalStormVANQUISH();
    Electronics electronics = new Electronics();
    ShoppingCart shoppingCart = new ShoppingCart();
    FaceBook faceBook =new FaceBook();
    Chercher chercher = new Chercher();
    NewOnlineStore newOnlineStore = new NewOnlineStore();




    @Test
    public void RegistrationSucessfully() {
        homePage.clickregistration();
        registrationPage.RegistrtionDetailFill();
        registrationPage.ClickonRegistrationButton();
        registrationSubmit.VerifyRegistrationButtonPage();
    }

    @Test
    public void EmailaFriendProductInfo() {

        homePage.clickregistration();
        registrationPage.RegistrtionDetailFill();
        registrationPage.ClickonRegistrationButton();
        homePage.ClickonComputer();
        computer.ClickonDeskTops();
        deskTop.ClickonProductDigitalStorm();
        digitalStormVANQUISH.ClickonEmailAFriend();
        producteMailaFriend.emailafriend();
        emailaFreindmessageSent.VerifyEmailaFreindmessageSent();
    }

    @Test
    public void AddtoCart() {

        homePage.ClickonComputer();
        computer.ClickonDeskTops();
        deskTop.ClickonProductDigitalStorm();
        digitalStormVANQUISH.ClickonAddtocartDigital();
        homePage.ClickonElectronics();
        electronics.AddtoCartHTCOne();
        electronics.ClickonShoppingCart();
        shoppingCart.userVerifyShoppingCartMassage();
    }

    @Test
    public void verifyEachProductHaveName() {

        List<WebElement> ProductName = driver.findElements(By.xpath("//div[contains(@class,'product')]/div[2]/div/div[1]/div[2]/h2/a"));
        for (WebElement Product : ProductName)
            System.out.println(Product.getText());
    }

    @Test
    public void demoalert() {
           homePage.clickonSearchButton();
           homePage.alertMessage();
           homePage.verifyTextofAlert();
           homePage.acceptAlert();
        }
   @Test
  public void faceBook(){
           homePage.clickOnFaceBook();
           faceBook.faceBookWindow();
           faceBook.assertURL();
           faceBook.assrtText();
           faceBook.assertByColour();
           faceBook.closingChildWindow();
  }
  @Test
   public void ChercherFilldetails(){

            chercher.notAfriendlyTopic();
          //  chercher.verifyText();

  }
   @Test
   public void newOnlineStore(){
        homePage.clickOnNewonlineStore();
        newOnlineStore.assertURL();
        newOnlineStore.Enterdetails();
        newOnlineStore.AssertCommentSucessfully();
        newOnlineStore.AssertTitle();

   }
}






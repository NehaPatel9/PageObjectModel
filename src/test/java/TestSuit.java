import org.testng.annotations.Test;

public class TestSuit extends BaseTest {//Created object from all other classes
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

    @Test
    public void RegistrationSucessfully() { //Call methods to run registration sucessfully
        //homePage.VerifyTextofHomePage();
        homePage.clickregistration();
        registrationPage.RegistrtionDetailFill();
        registrationPage.ClickonRegistrationButton();
        registrationSubmit.VerifyRegistrationButtonPage();
    }
        @Test
        public void EmailaFriendProductInfo () { //Method to send a email to friend a product information
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
        public void AddtoCart(){ //Method to add to cart two products
            homePage.ClickonComputer();
            computer.ClickonDeskTops();
            deskTop.ClickonProductDigitalStorm();
            digitalStormVANQUISH.ClickonAddtocartDigital();
            homePage.ClickonElectronics();
            electronics.AddtoCartHTCOne();
            electronics.ClickonShoppingCart();
            shoppingCart.userVerifyShoppingCartMassage();

        }
}
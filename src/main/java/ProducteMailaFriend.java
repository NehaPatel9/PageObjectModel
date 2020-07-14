import org.openqa.selenium.By;

public class ProducteMailaFriend extends RegistrationPage {

    private By _InputFriendEmailAddress = By.xpath("//input[@id=\"FriendEmail\"]"); // Locators for input freid email box
    private By _BodyTextofEmail = By.xpath("//textarea[@id=\"PersonalMessage\"]");//Locator for body (text) of message
    private By ClickSendEmail = By.xpath("//input[@name=\"send-email\"]");//Locator for Send Email
    private By _YourEmail = By.name("Email"); //Locator for your email address

    public void emailafriend() {

        TypeText(_InputFriendEmailAddress, "kirebak309@go4mail.net", 40); //Method to type text
        //TypeText(_YourEmail, "nehajp999@gmail.com", 20);
        TypeText(_BodyTextofEmail, "You are being invited ", 20);
        clickElement(ClickSendEmail, 20);

    }
}
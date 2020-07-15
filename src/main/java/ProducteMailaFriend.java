import org.openqa.selenium.By;

public class ProducteMailaFriend extends RegistrationPage {

    private By _InputFriendEmailAddress = By.xpath("//input[@id=\"FriendEmail\"]");
    private By _BodyTextofEmail = By.xpath("//textarea[@id=\"PersonalMessage\"]");
    private By ClickSendEmail = By.xpath("//input[@name=\"send-email\"]");
    private By _YourEmail = By.name("Email");

    public void emailafriend() {

        TypeText(_InputFriendEmailAddress, "kirebak309@go4mail.net", 40);
        TypeText(_BodyTextofEmail, "You are being invited ", 20);
        clickElement(ClickSendEmail, 20);
    }
}
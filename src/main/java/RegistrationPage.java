import org.openqa.selenium.By;

public class RegistrationPage extends Util1 {

    private By _EnterName = By.id("FirstName");
    private By _EnterLastName = By.xpath("//input[@id=\"LastName\"]");
    private By _selectFromDropDownByValue = By.xpath("//select[@name=\"DateOfBirthDay\"]");
    private By _selectFromDropDownByindex = By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    private By _selectFrmDropDownByVisibleText = By.xpath("//select[@name=\"DateOfBirthYear\"]");
    private By _Email = By.name("Email");
    private By _Company = By.id("Company");
    private By _Newsletter = By.xpath("//input[@id=\"Newsletter\"]");
    private By _Password = By.xpath("//input[@name=\"Password\"]");
    private By _ConfirmPassword = By.xpath("//input[@name=\"ConfirmPassword\"]");
    private By _registerButton = By.name("register-button");

public void RegistrtionDetailFill (){

        TypeText(_EnterName, "Neha", 20);
        TypeText(_EnterLastName, "Patel", 20);
        selectFromDropDownByValue(_selectFromDropDownByValue, "3", 20);
        selectFromDropDownByindex(_selectFromDropDownByindex, "January", 20);
        selectFromDropDownByVisibleText(_selectFrmDropDownByVisibleText, "1912", 20);
        TypeText(_Email, "neha+" + timestamp() + "@gmail.com", 20);
        TypeText(_Company, "ABC LTD", 20);
        clickElement(_Newsletter, 20);
        TypeText(_Password, "My@password", 20);
        TypeText(_ConfirmPassword, "My@password", 20);
    }
    public void ClickonRegistrationButton(){
        clickElement(_registerButton, 20);
    }
}

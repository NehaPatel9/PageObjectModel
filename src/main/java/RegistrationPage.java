import org.openqa.selenium.By;

public class RegistrationPage extends Util1 { // class to fill registration details

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

public void RegistrtionDetailFill (){ // Method to fill registration details

        TypeText(_EnterName, "Neha", 20);// type text to enter name
        TypeText(_EnterLastName, "Patel", 20); //Type text to enter last name
        selectFromDropDownByValue(_selectFromDropDownByValue, "3", 20); // select date from dropdown menu
        selectFromDropDownByindex(_selectFromDropDownByindex, "January", 20); // select month from dropdown menu
        selectFromDropDownByVisibleText(_selectFrmDropDownByVisibleText, "1912", 20); // select year from drop down menu
        TypeText(_Email, "neha+" + timestamp() + "@gmail.com", 20);//type text of emil address
        TypeText(_Company, "ABC LTD", 20);//Type company name
        clickElement(_Newsletter, 20); // Click on NewsLetter
        TypeText(_Password, "My@password", 20);//Type text of password
        TypeText(_ConfirmPassword, "My@password", 20);//Type text of Confirm password
    }
    public void ClickonRegistrationButton(){
        clickElement(_registerButton, 20); // click on register button
    }
}

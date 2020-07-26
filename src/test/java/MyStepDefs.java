import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSubmit registrationSubmit = new RegistrationSubmit();

    @Given("^user is on homepage$")
    public void user_is_on_homepage() {
    homePage.clickregistration();
    }

    @When("^User clicks on register button$")
    public void user_clicks_on_register_button()  {
    registrationPage.RegistrtionDetailFill();
    registrationPage.ClickonRegistrationButton();
    }

    @When("^user enters all required registration details$")
    public void user_enters_all_required_registration_details()  {
    registrationSubmit.VerifyRegistrationButtonPage();
    }

    @When("^user enters all required -submit button$")
    public void user_enters_all_required_submit_button(){
    }

    @Then("^user should able to register sucessfuly$")
    public void user_should_able_to_register_sucessfuly() {
    }
}

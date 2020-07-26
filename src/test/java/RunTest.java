import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(features = ".",tags ="@Registration", format = {"pretty","html:target/Destination"} )

    public class RunTest {
}

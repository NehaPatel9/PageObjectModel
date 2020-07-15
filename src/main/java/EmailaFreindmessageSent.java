import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailaFreindmessageSent extends Util1{

    public void VerifyEmailaFreindmessageSent() {

        String expectedText1 = "Your message has been sent.";
        String actualText1 = getTextfromElement(By.xpath("//div[@class=\"result\"]"));

        Assert.assertEquals(actualText1, expectedText1);
    }

}


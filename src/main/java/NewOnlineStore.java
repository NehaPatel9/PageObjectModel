import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class NewOnlineStore extends Util1 {
    private By _EnterTitel = By.xpath("//input[@id=\"AddNewComment_CommentTitle\"]");
    private By _EnterinComment = By.xpath("//textarea[@id=\"AddNewComment_CommentText\"]");
    private By _NewComment = By.xpath("//input[@value=\"New comment\"]");

    public void assertURL() {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://demo.nopcommerce.com/new-online-store-is-open");
    }
    public void Enterdetails () {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        TypeText(_EnterTitel, "Great Services", 30);
        TypeText(_EnterinComment, "Truly Helpful Services", 30);
        clickElement(_NewComment, 20);
    }
    public void AssertCommentSucessfully() {

        String expectedText = "News comment is successfully added.";
        String actualText = getTextfromElement(By.xpath("//div[@class=\"result\"]"));
        Assert.assertEquals(actualText, expectedText);
    }
    public void AssertTitle(){

            String expectedText1 = "Great Services";
            String actualText1 = getTextfromElement(By.xpath("//div[@class=\"comments\"]/div[5]/div[2]/div[2]"));
            Assert.assertEquals(actualText1, expectedText1);
    }
}

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class NewOnlineStore extends Util1 {

    private By _EnterTitel = By.xpath("//input[@id=\"AddNewComment_CommentTitle\"]");
    private By _EnterinComment = By.xpath("//textarea[@id=\"AddNewComment_CommentText\"]");
    private By _NewComment = By.xpath("//input[@value=\"New comment\"]");

    public void assertURL() { //Method to assert URL of New online store page
            String URL = driver.getCurrentUrl();
            Assert.assertEquals(URL, "https://demo.nopcommerce.com/new-online-store-is-open");
    }
    public void Enterdetails () { //Method to fill details in comment box of new online store page

            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);//wait for 40 seceonds
            TypeText(_EnterTitel, "Great Services", 30); //Type text in enter title input box
            TypeText(_EnterinComment, "Truly Helpful Services", 30);//Type text in commeent input box
            clickElement(_NewComment, 20);//click on new comment
    }
    public void AssertCommentSucessfully() { //Assert Message of comment is successfully added

            String expectedCommentMessage = "News comment is successfully added.";
            String actualCommentMessage = getTextfromElement(By.xpath("//div[@class=\"result\"]"));
            Assert.assertEquals(actualCommentMessage, expectedCommentMessage);
    }
    public void AssertTitle(){ //Assert Title of comment

            String expectedText1 = "Great Services";
            String actualText1 = getTextfromElement(By.xpath("//Strong[text()='Great Services']"));
            Assert.assertEquals(actualText1, expectedText1);
    }
}

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    public HomePage()
    {
        @FindBy(id = "hplogo")
        WebElement logo;
    }


    public void recherche(String text)
    {

    }
}

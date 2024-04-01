import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class homePageScreen {
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnAccept")
    WebElement btnAcceptAgreement;

    @FindBy(className = "android.widget.ImageView")
    List<WebElement> btnProductIcon;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/ivProductThumb")
    List<WebElement> btnProductSubItem;


    public homePageScreen(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void selectProduct() throws InterruptedException {
        btnAcceptAgreement.click();
        Thread.sleep(5000);
        btnProductIcon.get(1).click();

        btnProductSubItem.click();

        Thread.sleep(3000);



    }

}

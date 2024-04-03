package pages;

import Utils.Utils;
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

    @FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Placeholder\"])[6]")
    WebElement btnProductSubItem;
    public AndroidDriver driver;

    public homePageScreen(AndroidDriver driver) {
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void selectProduct() throws InterruptedException {
        btnAcceptAgreement.click();
        Thread.sleep(5000);
        Utils.scroll(driver,482,1306,490,709);
        btnProductSubItem.click();

//        btnProductSubItem.click();

        Thread.sleep(3000);



    }

}

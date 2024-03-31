import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class homePageScreen {
    @FindBy(id="com.nopstation.nopcommerce.nopstationcart:id/btnAccept")
    WebElement btnAcceptAgreement;

    @FindBy(className = "android.widget.ImageView")
    List<WebElement> btnProductIcon;

    @FindBy(id="com.nopstation.nopcommerce.nopstationcart:id/ivProductThumb")
    WebElement btnProductSubItem;


    public homePageScreen(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
public void selectProduct(){
    btnAcceptAgreement.click();
    btnProductIcon.get(1).click();
    }

}

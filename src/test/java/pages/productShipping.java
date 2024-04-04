package pages;

import Utils.Utils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class productShipping {
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnAddToCart")
    WebElement btnAddToCart;

    @FindBy(id="com.nopstation.nopcommerce.nopstationcart:id/counterIcon")
    WebElement btnProductChoose;
    @FindBy(id="com.nopstation.nopcommerce.nopstationcart:id/btnCheckOut")
    WebElement btnCheekout;
    @FindBy(id="com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout")
    WebElement btnGuestCheckOut;
    @FindBy(id="com.nopstation.nopcommerce.nopstationcart:id/etFirstName")
    WebElement txtFirstName;

    @FindBy(id="com.nopstation.nopcommerce.nopstationcart:id/etLastName")
    WebElement txtLastName;

    @FindBy(id="com.nopstation.nopcommerce.nopstationcart:id/etEmail")
    WebElement txtEmail;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/countrySpinnerLayout")
    WebElement selectCountry;

    @FindBy(className = "android.widget.TextView")
    List<WebElement> chooseCountry;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/stateSpinner")
    WebElement selectState;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etCompanyName")
    WebElement txtCompanyName;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etCity")
    WebElement txtCityName;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress")
    WebElement txtStreetAddress;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etZipCode")
    WebElement txtZipPostalAddress;

    @FindBy(id="com.nopstation.nopcommerce.nopstationcart:id/btnContinue")
    WebElement btnContinue;

    @FindBy(className = "android.widget.RelativeLayout")
    List<WebElement> ShipmentPoliciesSelection;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnContinue")
    WebElement btnShipmentContinue;


    @FindBy(className = "android.widget.RelativeLayout")
    List<WebElement> paymentTypeSelection;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnContinue")
    WebElement btnPaymentTypeSelection;

    @FindBy(className = "android.widget.Button")
    List<WebElement> btnNextButton;

    @FindBy(id="com.nopstation.nopcommerce.nopstationcart:id/btnContinue")
    WebElement btnConfirmButton;
    public AndroidDriver driver;

    public productShipping(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void prodcutSelection() throws InterruptedException {
        btnAddToCart.click();
        Thread.sleep(2000);
        btnProductChoose.click();
        Thread.sleep(2000);
        Utils.scroll(driver,455,1485,455,354);
        Thread.sleep(3000);
        btnCheekout.click();
        Thread.sleep(1000);
        btnGuestCheckOut.click();

        txtFirstName.sendKeys("Md");
        txtLastName.sendKeys("Faisal");
        txtEmail.sendKeys("test1@testt.com");
        Thread.sleep(1000);
        selectCountry.click();
        Thread.sleep(1000);
        chooseCountry.get(3).click();
        Thread.sleep(1000);
        selectState.click();
        chooseCountry.get(1).click();
        Thread.sleep(1000);
        Utils.scroll(driver,245,1536,245,647);

        txtCompanyName.sendKeys("ABC Test");
        txtCityName.sendKeys("Dhaka");
        txtStreetAddress.sendKeys("Dhaka");
        txtZipPostalAddress.sendKeys("1205");
        Thread.sleep(1000);
        Utils.scroll(driver,422,1487,422,1111);
        Thread.sleep(3000);
        btnContinue.click();
        Thread.sleep(1000);

        ShipmentPoliciesSelection.get(9).click();

        Utils.scroll(driver,720,1412,720,634);
        Thread.sleep(3000);

        btnShipmentContinue.click();
        Thread.sleep(3000);

        paymentTypeSelection.get(5).click();
        Thread.sleep(3000);
        Utils.scroll(driver,482,1548,508,488);
        Thread.sleep(3000);
        Utils.scroll(driver,473,1613,511,435);
        Thread.sleep(3000);
        Utils.scroll(driver,529,1569,564,502);
        Thread.sleep(3000);
        Utils.scroll(driver,529,1569,564,502);
        Thread.sleep(3000);
        btnPaymentTypeSelection.click();
        Thread.sleep(3000);
        btnNextButton.get(0).click();
        Thread.sleep(4000);
        Utils.scroll(driver,447,1483,470,441);
        Thread.sleep(3000);
        btnConfirmButton.click();

    }
}

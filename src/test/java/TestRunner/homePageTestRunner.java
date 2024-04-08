package TestRunner;

import config.setup;
import org.testng.annotations.Test;
import pages.homePageScreen;
import pages.productShipping;

public class homePageTestRunner extends setup {
    @Test(priority = 1,description = "Select Product")
    public void searchProduct() throws InterruptedException {
        homePageScreen homePageScreen=new homePageScreen(driver);
        homePageScreen.selectProduct();
    }

    @Test(priority = 2,description = "Final product selection")
    public void finalProductChoose() throws InterruptedException {
        productShipping productShipping=new productShipping(driver);
        productShipping.productSelection();
        System.out.println("Product Shipment successfully");
    }
}

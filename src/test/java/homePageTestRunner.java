import org.testng.annotations.Test;

public class homePageTestRunner extends setup{
    @Test(priority = 1,description = "Select Product")
    public void searchProduct(){
        homePageScreen homePageScreen=new homePageScreen(driver);
        homePageScreen.selectProduct();
    }
}

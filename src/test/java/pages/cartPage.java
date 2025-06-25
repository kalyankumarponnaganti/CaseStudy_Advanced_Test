package pages;

import org.openqa.selenium.By;
import utility.browserDriver;

public class cartPage extends browserDriver {

    public static String checkOutBt = "//button[@id='checkout']";

    public static void click_checkout_btn()
    {
        driver.findElement(By.xpath(checkOutBt)).click();
    }

}

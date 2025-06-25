package pages;

import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static utility.browserDriver.driver;

public class checkOutCompletePage {

    public static String finishTxt = "//h2[normalize-space()='Thank you for your order!']";
    public static String visibility_finish_msg(){
        String actualFinishMsg = driver.findElement(By.xpath(finishTxt)).getText();
        return actualFinishMsg;
    }

    public static void order_confirmation_validation(){
        String actualFinishMsg = visibility_finish_msg();
        assertEquals(actualFinishMsg, "Thank you for your order!");
    }
}

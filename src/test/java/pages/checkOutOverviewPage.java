package pages;

import org.openqa.selenium.By;
import utility.browserDriver;

public class checkOutOverviewPage extends browserDriver {
    public static String finishBt = "//button[@id='finish']";

    public static void click_finish_btn()
    {
        driver.findElement(By.xpath(finishBt)).click();
    }
}

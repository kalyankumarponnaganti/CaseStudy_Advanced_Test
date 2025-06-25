package pages;

import org.openqa.selenium.By;
import utility.browserDriver;

public class checkOutInfoPage extends browserDriver {

    public static String firstNameField = "//input[@id='first-name']";
    public static String lastNameField = "//input[@id='last-name']";
    //input[@id='last-name']
    public static String postalCodeField = "//input[@id='postal-code']";
    //input[@id='postal-code']
    public static String continueBt ="//input[@id='continue']";

    public static void sendkeys_firstName(String firstname)
    {
        driver.findElement(By.xpath(firstNameField)).sendKeys(firstname);
    }
    public static void sendkeys_lastName(String lastname)
    {
        driver.findElement(By.xpath(lastNameField)).sendKeys(lastname);
    }
    public static void sendkeys_postalCode(String postalcode)
    {
        driver.findElement(By.xpath(postalCodeField)).sendKeys(postalcode);
    }
    public static void click_continue_btn()
    {
        driver.findElement(By.xpath(continueBt)).click();
    }
}

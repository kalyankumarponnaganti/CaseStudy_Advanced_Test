package pages;

import org.openqa.selenium.By;
import utility.browserDriver;

public class productsPage extends browserDriver {

    public static String bagAddItemBt = "//button[@id='add-to-cart-sauce-labs-backpack']";
    public static String lightAddItemBt = "//button[@id='add-to-cart-sauce-labs-bike-light']";
    public static String shirtAddItemBt = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']";
    public static String cartBt = "//a[@class='shopping_cart_link']";

    public static void click_add_items_btn()
    {
        driver.findElement(By.xpath(bagAddItemBt)).click();
        driver.findElement(By.xpath(lightAddItemBt)).click();
        driver.findElement(By.xpath(shirtAddItemBt)).click();
    }

    public static void click_cart_btn()
    {
        driver.findElement(By.xpath(cartBt)).click();
    }

}

package pages;

import utility.browserDriver;

public class signInPage extends browserDriver {

    public static String signIn_link_xpath= "https://www.saucedemo.com/";

    public static void loginPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://www.saucedemo.com/");
    }
}

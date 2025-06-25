package pages;

import org.openqa.selenium.By;
import utility.browserDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class loginCredentialsPage extends browserDriver{

    public static String usernameField = "//input[@name='user-name']";
    public static String passwordField = "//input[@id='password']";
    public static String loginButton = "//input[@id='login-button']";



    public static void dismissPasswordPopup() {
        try {
            Robot robot = new Robot();
            Thread.sleep(2000); // Wait for the popup to appear
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sendkeys_username(String username) {
        driver.findElement(By.xpath(usernameField)).sendKeys(username);
    }

    public static void sendkeys_password(String password) {
        driver.findElement(By.xpath(passwordField)).sendKeys(password);
    }

    public static void click_login_btn() {
        driver.findElement(By.xpath(loginButton)).click();
    }
}

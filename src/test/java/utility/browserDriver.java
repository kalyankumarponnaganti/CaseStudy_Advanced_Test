package utility;

import java.io.File;
import java.lang.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import com.aventstack.extentreports.ExtentReports;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class browserDriver {

    public static WebDriver driver;

    public static ChromeOptions options;

    public static ExtentReports extentReports;

    public static File file;

    public browserDriver() {
        extentReports = new ExtentReports();

//        LocalDateTime now = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
//        String formattedNow = now.format(formatter);
//        String fname = "report"+formattedNow+".html";
        file = new File("report.html");
//        file = new File(fname);
        options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);

        options.setExperimentalOption("prefs", prefs);


        options.addArguments("user-data-dir=C:/temp/freshProfile"); // create a new empty folder manually first


        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");

    }

    public static WebDriver getDriver(){
        if (driver == null) {
            options = new ChromeOptions();

            Map<String, Object> prefs = new HashMap<>();
            prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);

            options.setExperimentalOption("prefs", prefs);


            options.addArguments("user-data-dir=C:/temp/freshProfile"); // create a new empty folder manually first


            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();

            System.setProperty("webdriver.http.factory", "jdk-http-client");
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
        }
        return driver;
    }

    public void  close(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

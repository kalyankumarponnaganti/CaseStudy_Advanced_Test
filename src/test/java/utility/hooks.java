package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class hooks {

    public static browserDriver driver;

    public static ChromeOptions options;

    @Before
    public static void setUP() throws InterruptedException, Exception{
        driver = new browserDriver();

    }

    @After
    public void tearDown() throws Exception{
//        LocalDateTime now = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
//        String formattedNow = now.format(formatter);
//        String fname = "report"+formattedNow+".html";
        Desktop.getDesktop().browse(new File("report.html").toURI());
//        Desktop.getDesktop().browse(new File(fname).toURI());
        driver.close();
    }

}
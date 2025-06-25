package Reports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utility.browserDriver;

import java.io.File;
import java.io.IOException;


public class seleniumTest extends browserDriver {

    public static void main(String[] args) {}

        public static void extent_reports (String image, String title) throws Exception {

            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
            extentReports.attachReporter(sparkReporter);
            WebDriverManager.chromedriver().setup();

            driver.manage().window().maximize();
            String path = capture_screenshot(image);

            if (path != null) {
                extentReports
                        .createTest("Sauce Demo Website Page", "Attaching screenshots at test level")
                        .info("This is info message")
                        .addScreenCaptureFromPath(path, title);
            } else {
                System.err.println("Screenshot not found, skipping attachment.");
            }

            extentReports.flush();

        }

        public static String capture_screenshot (String filename){
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

            File screenshotsDir = new File("./Screenshots");
            if (!screenshotsDir.exists()) {
                screenshotsDir.mkdir();
            }
            File destFile = new File(screenshotsDir, filename);

            try {
                FileUtils.copyFile(sourceFile, destFile);
                System.out.println("Screenshot saved at: " + destFile.getAbsolutePath());
                return destFile.getAbsolutePath();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

    }

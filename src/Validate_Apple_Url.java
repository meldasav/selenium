import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class Validate_Apple_Url {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver ", "/Users/meldasav/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://www.apple.com/");

        String expectedURL = "https://www.apple.com/";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.equals(expectedURL)) System.out.println("The URL validation PASSED");
        else System.out.println("The URL validation FAILED");
        driver.quit();

    }
    }


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ComfyTestValidateUrl {
    public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver","/Users/meldasav/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://comfyelite.com/");
        String expectedURL="https://comfyelite.com/";
        String actualURL=driver.getCurrentUrl();
        if(actualURL.equals(expectedURL)) System.out.println("The URL validation PASSED");
        else System.out.println("The URL validation FAILED");
        Thread.sleep(3000);
        driver.quit();



    }
}

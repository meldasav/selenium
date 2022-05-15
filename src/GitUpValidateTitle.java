import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GitUpValidateTitle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/meldasav/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://github.com/");
        String expectedTitle="github";
        String actualTitle=driver.getTitle();
        if(actualTitle.equals(expectedTitle)) System.out.println("Passed");
        else System.out.println("failed");
        Thread.sleep(3000);
        driver.quit();

    }
}

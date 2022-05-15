import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Practice_Locator {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/meldasav/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://www.techglobalschool.com/");
        WebElement techglobalLogo=driver.findElement(By.xpath("//*[@id=\"comp-kuiqjiul0label\"]"));

        if(techglobalLogo.isDisplayed()) System.out.println("tech logo is there");
        else System.out.println("tech logo not display");




        driver.quit();
    }
}

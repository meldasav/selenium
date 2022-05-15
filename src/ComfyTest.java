import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ComfyTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/meldasav/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.get(" https://comfyelite.com/");
        System.out.println("The Title of the page is = " + driver.getTitle());

        if (driver.getTitle().equals("COMFY ELITE - Pillow, Neck Pillow, Travel, Pillow")) System.out.println("comfyelite title validation passed");
        else System.out.println("comfyelite title validation failed");
        System.out.println("end of the program");
        Thread.sleep(3000);
        driver.quit();
    }
}

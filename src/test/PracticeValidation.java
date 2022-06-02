package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PracticeValidation {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/meldasav/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.techglobalschool.com/");
        WebElement firstNameBox = driver.findElement(By.cssSelector("#input_comp-khwayxk9"));
        WebElement lastNameBox = driver.findElement(By.cssSelector("#input_comp-khwaz4h2"));
        WebElement emailBox = driver.findElement(By.cssSelector("#input_comp-khwb0zsz"));

        firstNameBox.sendKeys("Melda");
        lastNameBox.sendKeys("Sav");
        emailBox.sendKeys("Meldesav@gmail.com");

        System.out.println(firstNameBox.getAttribute("value").equals("Melda"));
        System.out.println(lastNameBox.getAttribute("value").equals("Sav"));
        System.out.println(emailBox.getAttribute("value").equals("Meldesav@gmail.com"));

        Thread.sleep(3000);
        driver.quit();




    }


}

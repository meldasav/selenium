package home_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Facebook_Login_Validation {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.facebook.com");
        String title = driver.getTitle();
        String actualTitle = "Facebook - log in or sign up";
        if (title.equals(actualTitle)) System.out.println("title validation passed");
        else System.out.println("title validation failed");

        String URL = driver.getCurrentUrl();
        String actualUrl = "https://www.facebook.com/";
        if (URL.equals(actualUrl)) System.out.println("Url validation passed");
        else System.out.println("Url validation failed");

        WebElement facebookLogo = driver.findElement(By.id("globalContainer"));
        if (facebookLogo.isDisplayed()) System.out.println("logo validation passed");
        else System.out.println("logo validation failed");

        WebElement facebookHeading2 = driver.findElement(By.xpath("//h2"));
        if (facebookHeading2.isDisplayed()) System.out.println("validation of heading2 passed");
        else System.out.println("validation heading 2 failed");

        WebElement emailBox = driver.findElement(By.id("email"));
        if (emailBox.isDisplayed()) System.out.println("email validation passed");
        else System.out.println("email validation failed");

        WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
        if (password.isDisplayed()) System.out.println("password validation passed");
        else System.out.println("password validation failed");

        WebElement login = driver.findElement(By.name("login"));
        if (login.isDisplayed()) System.out.println("login validation passed");
        else System.out.println("login validation failed");

        System.out.println(login.isEnabled());
        WebElement forgetPassword = driver.findElement(By.linkText("Forgot password?"));
        if (forgetPassword.isDisplayed()) System.out.println("Validation of forgot password passed");
        else System.out.println("Validation of forgot password failed");

        WebElement createNewAccount=driver.findElement(By.xpath("//*[text()='Create new account']"));
        if(createNewAccount.isDisplayed()) System.out.println("validation create of account passed");
        else System.out.println("creating account failed");

        Driver.quitDriver();

    }
}

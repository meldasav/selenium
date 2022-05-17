package test;

import org.openqa.selenium.WebDriver;

public class ValidationUtils {

    public static void validateTitle(WebDriver driver, String expectedTitle) {
        if (driver.getTitle().equals(expectedTitle)) System.out.println("Title is VALIDATED");
        else throw new RuntimeException("Title is NOT VALIDATED\n" +
                "Expected title: \"" + expectedTitle + "\" | Actual Title: \"" + driver.getTitle() + "\"");
    }

    public static void validateTitle1(WebDriver driver,String expectedTitle){
        if (driver.getTitle().equals(expectedTitle)) System.out.println("Title is VALIDATED");
        else System.out.println("Title is not VALIDATED");
    }
}

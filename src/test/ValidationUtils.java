package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import test.ValidationUtils.*;
public class ValidationUtils {

    public static void validateTitle(WebDriver driver, String expectedTitle) {
        if (driver.getTitle().equals(expectedTitle)) System.out.println("Title is VALIDATED");
        else throw new RuntimeException("Title is NOT VALIDATED\n" +
                "Expected title: \"" + expectedTitle + "\" | Actual Title: \"" + driver.getTitle() + "\"");
    }

    public static void validateTitle1(WebDriver driver, String expectedTitle) {
        if (driver.getTitle().equals(expectedTitle)) System.out.println("Title is VALIDATED");
        else System.out.println("Title is not VALIDATED");
    }

    public static void validateURL(WebDriver driver, String expectedURL) {
        if (driver.getCurrentUrl().equals(expectedURL)) System.out.println("URL is validated");
        else throw new RuntimeException("URL is validated\n" +
                "Expected URL: \"" + expectedURL + "\" | Actual URL: \"" + driver.getCurrentUrl() + "\"");
    }

    public static void validateElementIsDisplayed(WebElement element) {
        if (element.isDisplayed()) System.out.println("Element is Displayed");
        else throw new RuntimeException("Element is not Displayed");
    }

    public static void validateElementIsDisplayed(WebElement element, String elementName) {
        if (element.isDisplayed()) System.out.println(elementName + "Displayed");
        else throw new RuntimeException(elementName + "is not Displayed");
    }
    public static void validateElementIsEnabled(WebElement element) {
        if (element.isEnabled()) System.out.println("Element is ENABLED");
        else throw new RuntimeException("Element is NOT ENABLED");
    }

    public static void validateElementIsEnabled(WebElement element, String elementName) {
        if (element.isEnabled()) System.out.println(elementName + " is ENABLED");
        else throw new RuntimeException(elementName + " is NOT ENABLED");
    }

    public static void validateElementIsDisplayedAndEnabled(WebElement element) {
        validateElementIsDisplayed(element);
        validateElementIsEnabled(element);
    }

    public static void validateElementIsDisplayedAndEnabled(WebElement element, String elementName) {
        validateElementIsDisplayed(element, elementName);
        validateElementIsEnabled(element, elementName);
    }


}
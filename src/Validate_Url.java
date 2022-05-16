import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class Validate_Url {
    public static void main(String[] args) {
        /*
    TEST CASE
    1. Go to "https://www.apple.com/"
    2. Validate the URL of the page is displayed as "https://www.apple.com/"
    NOTE:
    driver.getCurrentUrl(); // this line returns the URL of the current page as a String
     */
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.apple.com/");
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "https://www.apple.com/";
        if (actualResult.equals(expectedResult)) System.out.println("Url validation passed");
        else System.out.println("Url validation failed");


        WebDriver driver1=Driver.getDriver();
        driver1.get("https://www.techglobalschool.com/");
        String actualResult1=driver1.getCurrentUrl();
        String expectedResult1="https://www.techglobalschool.com/";
        if(actualResult1.equals(expectedResult1)) System.out.println("Url validation passed");
        else System.out.println("Url validation failed");

        Driver.quitDriver();
    }
}

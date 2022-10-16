package seleniumassingment2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {
    public static WebDriver GetDriver(){

        {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://parabank.parasoft.com/parabank/register.htm");
            return driver;



        }


    }

}

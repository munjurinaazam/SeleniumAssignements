package seleniumassingment2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindingLocator {
    public static void main(String[] args) throws InterruptedException {
        {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://parabank.parasoft.com/parabank/register.htm");
            Thread.sleep(10000);

// RegisterLink
            driver.findElement(By.linkText("Register")).click();
            Thread.sleep(10000);
//            FromTitle
            driver.findElement(By.className("title")).getText();
            Thread.sleep(10000);
//  form
//         firstname
            WebElement FirstName= driver.findElement(By.id("customer.firstName"));
            FirstName.sendKeys("John");
            Thread.sleep(10000);
//          lastname
            WebElement LastName= driver.findElement(By.id("customer.lastName"));
            LastName.sendKeys("Doe");
            Thread.sleep(10000);
//            address
            WebElement address= driver.findElement(By.id("customer.address.street"));
            address.sendKeys("34/7 Dhaka");
            Thread.sleep(10000);
//            city
            WebElement city= driver.findElement(By.id("customer.address.city"));
            city.sendKeys("Dhaka");
            Thread.sleep(10000);
//            state
            WebElement state= driver.findElement(By.id("customer.address.state"));
            state.sendKeys("Dhaka,Bangladesh");
            Thread.sleep(10000);
//            ZipCode
            WebElement zipcode= driver.findElement(By.id("customer.address.zipCode"));
            zipcode.sendKeys("1212");
            Thread.sleep(10000);
//            phone
            WebElement phonenumber= driver.findElement(By.id("customer.phoneNumber"));
            phonenumber.sendKeys("019XXXXX");
            Thread.sleep(10000);
//            SSN
            WebElement ssn= driver.findElement(By.id("customer.ssn"));
            ssn.sendKeys("12345678");
            Thread.sleep(10000);
//            UserProfile
            WebElement username= driver.findElement(By.id("customer.username"));
            username.sendKeys("John123");
            Thread.sleep(10000);
            WebElement Password= driver.findElement(By.cssSelector("input[id='customer.password']"));
            Password.sendKeys("12345678");
            Thread.sleep(10000);
            WebElement RepeatPassword= driver.findElement(By.name("repeatedPassword"));
            RepeatPassword.sendKeys("12345678");
            Thread.sleep(10000);
            WebElement  submitbutton = driver.findElement(By.className("button"));
            submitbutton.click();
            Thread.sleep(10000);
//      CustomerLogin
            WebElement LoginUserName=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/h2"));
            WebElement loginusername1= driver.findElement(By.name("username"));
            loginusername1.sendKeys("John123");
            Thread.sleep(10000);
            WebElement loginPassword= driver.findElement(By.name("password"));
            loginPassword.sendKeys("12345678");
            Thread.sleep(10000);
            WebElement LoginButton= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[3]/input"));
            LoginButton.click();
            driver.findElement(By.partialLinkText("login info?")).click();
            Thread.sleep(30000);













            driver.quit();

        }
    }
}

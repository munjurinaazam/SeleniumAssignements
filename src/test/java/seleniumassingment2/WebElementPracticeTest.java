package seleniumassingment2;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebElementPracticeTest extends BaseClass {
    public static void main(String[] args) {
        WebDriver driver= BaseClass.GetDriver();
        WebElement webElement= driver.findElement(By.tagName("a"));
        System.out.println(webElement.getText());

        List<WebElement>webElements=driver.findElements(By.tagName("a"));
        System.out.println("Hyperlink Total Has:"+" "+ webElements.size());
        for(WebElement webElement1 : webElements){
            System.out.println(webElement1.getText());

        }
        List<WebElement>webElementsbyname=driver.findElements(By.name("customer.address.state"));
        System.out.println(" Total Name Has:"+" "+ webElementsbyname.size());
        for(WebElement webElement1 : webElementsbyname){
            System.out.println(webElement1.getText());

        }
        List<WebElement>webElementsbyclassname=driver.findElements(By.className("leftmenu"));
        System.out.println(" Total ClassName Has:"+" "+ webElementsbyclassname.size());
        for(WebElement webElement1 : webElementsbyclassname){
            System.out.println(webElement1.getText().trim());


        }
        List<WebElement>webElementsbyid=driver.findElements(By.id("loginPanel"));
        System.out.println(" Total ID Has:"+" "+ webElementsbyclassname.size());
        for(WebElement webElement1 : webElementsbyclassname){
            System.out.println(webElement1.getText().trim());


        }



        driver.quit();





    }
}

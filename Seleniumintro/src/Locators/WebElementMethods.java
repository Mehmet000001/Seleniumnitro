package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/suphi/Downloads/Techtorial.html");

        WebElement submit=driver.findElement(By.id("submitbutton"));
        System.out.println(submit.getText());

        System.out.println(submit.getAttribute("value"));
         ///getAttribute method is coming from the WebElement
        //it will return the value of given attribute
        //return type of getAttribute method is string

        System.out.println(submit.isDisplayed());


        driver.navigate().to("https://www.w3.org/TR/wai-aria-practices-1.1/examples/checkbox/checkbox-2/checkbox-2.html");

        WebElement tomato=driver.findElement(By.id("cond2"));
        System.out.println(tomato.isSelected());//true
        tomato.click();//it is unselected
        System.out.println(tomato.isSelected());//false






    }
}

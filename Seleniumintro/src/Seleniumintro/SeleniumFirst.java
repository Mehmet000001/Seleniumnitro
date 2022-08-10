package Seleniumintro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumFirst {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //webdriver is an interface.
        //new ChromeDriver() is an object.

        driver.get("https://www.google.com/");
        String actual = driver.getTitle(); // it will return the title from webpage as a string
        String expected="Google";
        if(actual.equals(expected)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.google.com/";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
            System.out.println(driver.getCurrentUrl());//will return all html of google page.
        }
    }
}

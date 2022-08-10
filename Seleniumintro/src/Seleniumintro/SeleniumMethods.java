package Seleniumintro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");//it navigates to the page and wait webelement to be loaded

        driver.navigate().to("https://www.techtorialacademy.com/");//it navigates to the page but it dosen't webelement to be loaded. interview qc

        driver.navigate().back();///it will navigate previous page.

        driver.navigate().forward();//it will navigate to the next page.

        driver.navigate().refresh();//it will navigate to current page.


    }
}

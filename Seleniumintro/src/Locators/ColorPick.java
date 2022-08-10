package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorPick {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/challenging_dom");
        WebElement firstButton=driver.findElement(By.className("button"));
        String color=firstButton.getCssValue("background-color");
        //getCssValue will return the value of the background-color
        System.out.println(color);

    }
}

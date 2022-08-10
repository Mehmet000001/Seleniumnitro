package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com/");

        WebElement searchBox =driver.findElement(By.xpath("//input[@title='Search']"));
        searchBox.sendKeys("Selenium HQ"+ Keys.ENTER);
//        WebElement searchButton=driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@value='Google Search']"));
//        searchButton.click();
        WebElement result=driver.findElement(By.id("result-stats"));
        System.out.println(result.getText());


    }
}

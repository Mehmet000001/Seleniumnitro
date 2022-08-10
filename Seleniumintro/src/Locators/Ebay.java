package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        WebElement ebay=driver.findElement(By.xpath("//input[@title='Search']"));
        ebay.sendKeys("Ebay"+ Keys.ENTER);
       WebElement openEbay=driver.findElement(By.xpath("//a[@href='https://www.ebay.com/']"));
       openEbay.click();
       WebElement openEbay1=driver.findElement(By.name("_nkw"));
       openEbay1.click();
       openEbay1.sendKeys("OCA Java Book"+Keys.ENTER);
       WebElement click=driver.findElement(By.xpath("//h3[contains(., 'Study Guide by Edward Finegan')]"));
       click.click();

    }
}

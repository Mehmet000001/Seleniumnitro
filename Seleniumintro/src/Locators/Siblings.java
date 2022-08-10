package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Siblings {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/");
        WebElement following=driver.findElement(By.xpath("//h1/following-sibling::h2"));
        System.out.println(following.getText());
        WebElement preceding=driver.findElement(By.xpath("//h2/preceding-sibling::h1"));
        System.out.println(preceding.getText());

    }
}

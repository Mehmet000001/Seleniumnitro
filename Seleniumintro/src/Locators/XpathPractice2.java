package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice2 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/");
        WebElement horizaltalLink=driver.findElement(By.xpath("//a[@href=\"/horizontal_slider\"]"));
        System.out.println(horizaltalLink.getText());
    }
}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/ref=ap_frn_logo");

        WebElement hello=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        hello.click();

        WebElement create=driver.findElement(By.id("createAccountSubmit"));
        create.click();
        WebElement userId=driver.findElement(By.name("customerName"));
        WebElement email=driver.findElement(By.id("ap_email"));
        WebElement password=driver.findElement(By.id("ap_password"));
        WebElement passwordCheck=driver.findElement(By.id("ap_password_check"));
        userId.sendKeys("Mehmet");
        email.sendKeys("mehmet@gmail.com");
        password.sendKeys("hayatim");
        passwordCheck.sendKeys("hayatim");
        WebElement create1=driver.findElement(By.id("continue"));
        create1.click();




    }
}

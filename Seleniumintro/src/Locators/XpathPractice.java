package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");
        ///html/body/div[2]/div/div/h3
        WebElement sliderHeader=driver.findElement(By.xpath("/html/body/div[2]/div/div/h3"));
        System.out.println(sliderHeader.getText());
        WebElement elemental=driver.findElement(By.xpath("/html/body/div[3]/div/div/a"));
        elemental.click();
        String actualTitle=driver.getTitle();
        String expectedTitle="Elemental Selenium";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        driver.navigate().back();
    }
}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) {
        //https://the-internet.herokuapp.com/
        //if first checbox is not seleceted clict the checkbox ,otherwise do notting
       // if second checbox is not seleceted clict the checkbox ,otherwise do notting

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/");
        WebElement checkBox=driver.findElement(By.linkText("Checkboxes"));
        checkBox.click();
        WebElement checkBox1=driver.findElement(By.xpath("//br/preceding-sibling::input"));
        WebElement checkBox2=driver.findElement(By.xpath("//br/following-sibling::input"));
        if (!checkBox1.isSelected()){
            checkBox1.click();
        }
        if (checkBox2.isSelected()){
            checkBox2.click();
        }

    }
}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/suphi/Downloads/Techtorial.html");
        //find element method find the webelement
        //and it returns the weblement object
        //this method is taking one By object as a parameter.

        //Note;if there is more than one matching element ,the findelement method will return the first one
        WebElement header= driver.findElement(By.id("techtorial1"));//if the findelement method can not locate the element with given locatotors will throw  nosuchelementeception
       String headerText=header.getText();
        System.out.println(headerText);

        WebElement header1=driver.findElement(By.name("text1"));//text1 only unique means only one how check copy and control F and paste.
        String headerText1=header1.getText();
        System.out.println(headerText1);

        WebElement checkBoxHeader=driver.findElement(By.className("group_checkbox"));
        System.out.println(checkBoxHeader.getText());

        WebElement firstName=driver.findElement(By.name("firstName"));
        WebElement lastName=driver.findElement(By.name("lastName"));
        WebElement phone=driver.findElement(By.name("phone"));
        WebElement email=driver.findElement(By.name("userName"));

        firstName.sendKeys("Mehmet");
        lastName.sendKeys("Doganer");
        phone.sendKeys("2243304545");
        email.sendKeys("david@gmail.com");

        firstName.clear();//clear method will delete the inserted values from the input box.
        lastName.clear();

        //find the element for address city state postal code and send the keys for those elements.

        WebElement Address=driver.findElement(By.name("address1"));
        WebElement city=driver.findElement(By.name("city"));
        WebElement state=driver.findElement(By.name("state"));
        WebElement postalCode=driver.findElement(By.name("postalCode"));

        Address.sendKeys("khdjhjhjhjhjhj");
        city.sendKeys("chicago");
        state.sendKeys("IL");
        postalCode.sendKeys("60056");



        WebElement sqllink=driver.findElement(By.linkText("SQL"));

        sqllink.click();
         driver.navigate().back();///interview qc? how to navigate back.
        WebElement restApi=driver.findElement(By.partialLinkText("Rest"));
        restApi.click();
        driver.navigate().back();
        WebElement submitButton=driver.findElement(By.name("submitbutton"));
        submitButton.submit();

        Address=driver.findElement(By.name("address1"));/// a sing elements again you have wright before sendKeys
        //To overcome the staleElementException we need to instantiate the element again.
        Address.sendKeys("Test");

        WebElement tool=driver.findElement(By.tagName("legend"));
        System.out.println(tool.getText());


    }
}

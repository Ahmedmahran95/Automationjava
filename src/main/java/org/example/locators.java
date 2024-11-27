package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {
    public static void main(String[] args) throws InterruptedException {
        // إعداد WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");

//        get element BY CLASS NAME
        driver.findElement(By.className("ico-register")).click();
//      get element by id
        driver.findElement(By.id("gender-male")).click();

//        get element by name
       driver.findElement(By.name("FirstName")).sendKeys("Ahmed");

//
        Thread.sleep(3000);

       driver.findElement(By.name("LastName")).sendKeys("mahran");
    //        sleep
        Thread.sleep(5000);


//      get by CSS Seleectors tagname[attribute=value]
        driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]")).click();

        //        sleep
        Thread.sleep(5000);

//        get by X-PATH //tagname[@attribute="value]
        driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("Ahmed@gmail.com");
//        sleep
        Thread.sleep(5000);

        driver.findElement(By.linkText("Log in")).click();
        Thread.sleep(5000);
//        quit

        driver.quit();

    }
}

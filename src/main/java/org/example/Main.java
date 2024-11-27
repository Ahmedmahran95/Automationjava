import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        try {
            // إعداد WebDriverManager
            WebDriverManager.chromedriver().setup();

            // بدء ChromeDriver
            WebDriver driver = new ChromeDriver();

            // فتح موقع للتأكد
            driver.manage().window().maximize();
            Thread.sleep(2000);
//            driver.manage().window().fullscreen();
//            Thread.sleep(2000);
            //set size
//            Dimension Iphone_12_pro = new Dimension(390,844);
//            driver.manage().window().setSize(Iphone_12_pro);

            driver.get("https://google.com/");

////          Get current URL
//            driver.getCurrentUrl();
//            System.out.println(driver.getCurrentUrl());
//
////          get title
//            driver.getTitle();
//            System.out.println(driver.getTitle());

            driver.get("https://www.selenium.dev/");
//            navigate back
            driver.navigate().back();

            Thread.sleep(3000);
//            navigate forword
            driver.navigate().forward();
//            navigate refresh
            driver.navigate().refresh();

            Thread.sleep(4000);

            driver.quit();


//            WebElement usernameField = driver.findElement(By.id("UserNameId"));
//            usernameField.sendKeys("Ahmedsabry");
//
//            WebElement passwordField = driver.findElement(By.id("PasswordId"));
//            passwordField.sendKeys("123456");
//
//            WebElement Submitbutton = driver.findElement(By.id("saveBtn"));
//            Submitbutton.click();
//
//            System.out.println("تم إدخال اسم المستخدم بنجاح!");
//            System.out.println("تم إدخال الرقم السري بنجاح!");
//            // انتظار
//            Thread.sleep(5000);
//
//            // إغلاق المتصفح
//            driver.quit();
////
//            System.out.println("WebDriverManager يعمل بنجاح!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

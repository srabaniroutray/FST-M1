package Liveproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class Activity_3 {

    public static void main(String[] args) {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //And now use this to visit the website
        driver.get("http://alchemy.hguy.co/orangehrm");


        //Enter the Login
        driver.findElement(By.xpath("//input[@id = 'txtUsername']")).sendKeys("orange");

        //Enter password
        driver.findElement(By.xpath("//input[@id = 'txtPassword']")).sendKeys("orangepassword123");

        //Click Login
        driver.findElement(By.xpath("//input[@id = 'btnLogin']")).click();


        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        //driver.close();

    }
}

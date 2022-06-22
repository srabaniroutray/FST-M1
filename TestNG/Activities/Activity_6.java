package Liveproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity_6 {
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

        //Explicit wait for  element to be visible and clickable
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id = 'menu_directory_viewDirectory']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id = 'menu_directory_viewDirectory']")));


        //Click Directory
        driver.findElement(By.xpath("//*[@id = 'menu_directory_viewDirectory']")).click();
        driver.findElement(By.xpath("//*[@id = 'menu_directory_viewDirectory']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class = 'toggle tiptip']")));

        driver.close();

    }
}

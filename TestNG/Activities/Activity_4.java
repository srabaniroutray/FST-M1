package Liveproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Activity_4 {
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

        //Click PIM
        driver.findElement(By.xpath("//*[@id = 'menu_pim_viewPimModule']")).click();

        //Click Add
        driver.findElement(By.xpath("//*[@id = 'btnAdd']")).click();

        //Enter the FirstName
        driver.findElement(By.xpath("//*[@id = 'firstName']")).sendKeys("testFN");

        //Enter LastName
        driver.findElement(By.xpath("//*[@id = 'lastName']")).sendKeys("testLN");

        //Click Save
        driver.findElement(By.xpath("//input[@id = 'btnSave']")).click();

        //Click PIM
        driver.findElement(By.xpath("//*[@id = 'menu_pim_viewPimModule']")).click();

        //Enter the EmployeeName
        driver.findElement(By.xpath("//*[@id = 'empsearch_employee_name_empName']")).sendKeys("testFN testLN");

        //Click Search
        driver.findElement(By.xpath("//input[@id = 'searchBtn']")).click();


        driver.findElement(By.xpath("//a[contains(text(), 'testFN')]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));

        driver.close();

    }
}
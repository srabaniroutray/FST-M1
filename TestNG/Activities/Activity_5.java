package Liveproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity_5 {
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

        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Explicit wait for  element to be clickable
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id = 'menu_pim_viewMyDetails']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id = 'menu_pim_viewMyDetails']")));

        //Click MyInfo
        driver.findElement(By.xpath("//*[@id = 'menu_pim_viewMyDetails']")).click();

        driver.findElement(By.xpath("//*[@id = 'menu_pim_viewMyDetails']")).click();

        //Explicit wait for visibility of element
        //WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id = 'btnSave']")));

        //Click Edit
        driver.findElement(By.xpath("//*[@id = 'btnSave']")).click();

        //Enter the FirstName
        driver.findElement(By.xpath("//*[@id = 'personal_txtEmpFirstName']")).sendKeys("testFN");

        //Enter LastName
        driver.findElement(By.xpath("//*[@id = 'personal_txtEmpLastName']")).sendKeys("testLN");

        //Click Gender
        driver.findElement(By.xpath("//input[@id = 'personal_optGender_1']")).click();

        //select  Nationality Indian

        Select drop = new Select(driver.findElement(By.xpath("//*[@id = 'personal_cmbNation']")));
        drop.selectByValue("82");


        driver.findElement(By.xpath("//*[@id = 'btnSave']")).click();


        driver.close();

    }
}

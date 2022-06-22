package Liveproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class Activity_2 {
    public static void main(String[] args) {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //And now use this to visit the website
        driver.get("http://alchemy.hguy.co/orangehrm");

        //WebElement image1 = driver.findElement(By.id("divLogo"));

        WebElement image1= driver.findElement(By.xpath("//*[@id='divLogo']/img"));
        String url = image1.getAttribute("src");
        System.out.println(url);

        driver.close();

    }
}

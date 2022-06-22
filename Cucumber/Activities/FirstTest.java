package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class FirstTest extends BaseClass{
    @Given("^user is on the TS site$")
    public void openBrowser(){
        //open Browser
        driver.get("https://training-support.net");
        String pagetitle= driver.getTitle();
        Assert.assertEquals(pagetitle,"Training Support");
    }
    @When("^the user clicks on About Us button$")
    public void clickAboutUs(){
        driver.findElement(By.id("about-link")).click();
    }

    @Then("^the About Us page opens$")
    public void verifyAboutusPage(){
        String pagetitle= driver.getTitle();
        Assert.assertEquals(pagetitle,"About Training Support");
    }
}








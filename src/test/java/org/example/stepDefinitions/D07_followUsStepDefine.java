package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.ArrayList;


public class D07_followUsStepDefine {

    @When("user clicks on facebook tab")
    public void selectFacebook() throws InterruptedException {
        Hooks.driver.findElement(By.cssSelector("<a href=\"http://www.facebook.com/nopCommerce")).click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));

    }

    @Then("user is taken to facebook page")
    public void userIsTakenToFacebookPage() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");

    }

    @When("user clicks on twitter tab")
    public void userClicksOnTwitterTab() {

        Hooks.driver.findElement(By.cssSelector("<a href=\"http://www.facebook.com/nopCommerce")).click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(2));

    }

    @Then("user is taken to twitter page")
    public void userIsTakenToTwitterPage() {

        Assert.assertEquals(driver.getCurrentUrl(),"https://twitter.com/nopCommerce");

    }

    @When("user clicks on rss tab")
    public void userClicksOnRssTab() {

        Hooks.driver.findElement(By.cssSelector("<a href=\"http://www.facebook.com/nopCommerce")).click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(3));


    }

    @Then("user is taken to rss page")
    public void userIsTakenToRssPage() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
    }

    @When("user clicks on youtube tab")
    public void userClicksOnYoutubeTab() {

        Hooks.driver.findElement(By.cssSelector("<a href=\"http://www.facebook.com/nopCommerce")).click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(4));


    }

    @Then("user is taken to youtube page")
    public void userIsTakenToYoutubePage() {

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
    }
}

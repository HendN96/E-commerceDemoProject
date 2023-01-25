package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class D02_loginStepDefine {

    P02_login login=new P02_login();

    @When("user login with \"test@example.com\" and \"P@ssw0rd\"")
    public void LoginSteps (String username, String password)
    {
        login.usernamePOM().clear();
        login.usernamePOM().sendKeys(username);
        login.passwordPOM().sendKeys(password);
        login.passwordPOM().sendKeys(Keys.ENTER);
    }

    @And("user navigates to login page")
    public void user_navigate()
    { Hooks.driver.navigate().to("https://the-internet.herokuapp.com/login");

    }
    @When("user enter valid username and password")
    public void valid_data()
    {
        login.LoginSteps("tomsmith", "SuperSecretPassword");
    }
    @And("user click on login button")
    public void login_button()
    {
        login.passwordPOM().sendKeys(Keys.ENTER);
    }
    @Then("user could login successfully")
    public void success_login()
    {
        String expectedResult = "You logged into a secure area!";
        String actualResult= Hooks.driver.findElement(login.flashPOM()).getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @And("go to home page")
    public void home_page()
    {

    }

}

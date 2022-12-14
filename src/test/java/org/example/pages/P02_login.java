package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_login {

    public P02_login()
    {

        PageFactory.initElements(Hooks.driver, this);
    }
    @FindBy(id = "username")
    WebElement usernamePF;

    public WebElement usernamePOM ()
    {
        By username = By.id("username");
        WebElement usernameEle = Hooks.driver.findElement(username);
        return usernameEle;
    }
    public WebElement passwordPOM ()

    {
        return  Hooks.driver.findElement(By.name("password"));
    }
    public By flashPOM ()
    {
        return  (By.id("flash"));
    }

    public By logoutPOM ()

    {
        return  By.cssSelector("a[href=\"/logout\"]");
    }
    public void LoginSteps ( String username, String password)
    {
        usernamePF.clear();
        usernamePOM().sendKeys(username);
        passwordPOM().sendKeys(password);
    }

}

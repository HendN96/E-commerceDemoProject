package org.example.stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

import java.util.List;


public class D03_currenciesStepDefine {

    P03_homepage home = new P03_homepage();

    @When("user select euro option")
    public void select_euro()
    {
        WebElement currency_list = Hooks.driver.findElement(By.id("customerCurrency"));

        Select select = new Select(currency_list);
        select.selectByVisibleText("Euro");


    }


    @Then("euro symbol is displayed on all products")
    public void euroSymbolIsDisplayedOnAllProducts() {

        for(int x= 0; x < home.prices().size(); x++)
        {
            List<WebElement> prices = Hooks.driver.findElements(By.cssSelector("<span class=\"price actual-price\">€1032.00</span>"));

            String value = home.prices().get(x).getText();
            System.out.println(value);



        }



    }

    @Given("test this value <{string}>")
    public void testThisValue(String arg0) {
        System.out.println(arg0);
    }
}

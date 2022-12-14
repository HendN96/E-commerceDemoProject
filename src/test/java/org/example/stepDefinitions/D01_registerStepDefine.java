package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class D01_registerStepDefine {

    P01_register register=new P01_register();
    @Given("user go to register page")

    public void go_to_register(){

        WebElement registerButton=
                Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));

        registerButton.click();

        register.registerlink().click();

    }

    @When("user select gender type")
      public void select_gender_type(){




    }

    @And("user enter first name")

    public void enter_first_name(){


    }

    @And("user enter date of birth")

    public void enter_date_of_birth(){


    }

    @And("user enter email field")

    public void enter_email_field(){


    }

    @And("user fills password fields")

    public void user_fills_password(){


    }
    @And("user clicks on register button")

    public void click_register_button(){


    }

    @Then("success message is displayed")

    public void message_is_displayed(){



    }




}

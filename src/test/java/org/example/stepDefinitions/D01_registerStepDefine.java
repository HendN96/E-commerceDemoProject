package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Scanner;

import static org.example.stepDefinitions.Hooks.driver;

public class D01_registerStepDefine {

    P01_register register=new P01_register();
    @Given("user go to register page")

    public void go_to_register(){

        WebElement registerButton=
                driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));

        registerButton.click();

        register.registerlink().click();

    }

    @When("user select gender type")
      public void select_gender_type(){


    }

    @And("user enter first name")

    public void enter_first_name(){

        Scanner sc= new Scanner(System.in);


    }

    @And("user enter date of birth")

    public void enter_date_of_birth() throws InterruptedException {
        WebElement list = driver.findElement(By.id("dropdown"));


        Select droplist = new Select(list);

        //3- Select options using 3 methods
        //3.1- SelectByIndex
        Thread.sleep(2000);
        droplist.selectByIndex(1);

        Thread.sleep(2000);
        droplist.selectByIndex(2);

        //3.2- SelectByValue
        //Note SelectByValue input value is String but SelectByIndex is Integer
        Thread.sleep(2000);
        droplist.selectByValue("1");

        Thread.sleep(2000);
        droplist.selectByValue("2");

        //3.3- SelectByVisibleText
        Thread.sleep(2000);
        droplist.selectByVisibleText("Option 1");

        Thread.sleep(2000);
        droplist.selectByVisibleText("Option 2");



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

        System.out.println("Registration Successful");



    }




}

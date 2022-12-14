package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;

public class D02_loginStepDefine {

    P02_login login=new P02_login();
    @Given("user go to login page")
    public void go_to_login(){


    }
    @When("user login with \"valid\" \"test@example.com\" and \"P@ssw0rd\"")
    public void valid_email_pass(){


    }

    @When("user login with \"invalid\" \"wrong@example.com\" and \"P@ssw0rd\"")
    public void invalid_email_pass(){


    }

    @And("user press on login button")
    public void press_login_button(){


    }

    @Then("user login to the system successfully")
    public void login_success(){


    }
    @Then("user could not login to the system")
    public void login_unsuccessful(){


    }



}

package org.example.stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

import static org.example.stepDefinitions.Hooks.driver;

public class D05_hoverCatStepDefine {
    @When("user hovers")
    public void hovers(){
        List<WebElement> categories = Hooks.driver.findElements(By.cssSelector("img[src=\"/img/avatar-blank.jpg\"]"));;
        int randomNumber = new Random().nextInt(3);
        Actions hover = new Actions(Hooks.driver);
        hover.moveToElement(categories.get(randomNumber)).perform();
        String mainCategory = categories.get(randomNumber).getText();



    }


}

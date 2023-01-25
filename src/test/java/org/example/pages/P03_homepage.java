package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homepage {
    public List<WebElement> prices(){

        List<WebElement> prices = Hooks.driver.findElements(By.cssSelector("<span class=\"price actual-price\">€1032.00</span>"));
        return prices;

    }

    public WebElement sliders(String num){
        return Hooks.driver.findElement(By.cssSelector("button[aria-label=\"newsletter_popup_close-cta\"]"));

    }

    public WebElement facebookLink(){ return Hooks.driver.findElement(By.className("facebook")); }

    public WebElement twitterLink(){ return Hooks.driver.findElement(By.className("twitter")); }
}

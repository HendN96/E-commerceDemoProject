package org.example.stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

import static org.example.stepDefinitions.Hooks.driver;

public class D05_hoverCatStepDefine {
    @When("user hovers on main category")
    public void hovers(){
        Actions actions=new Actions(driver);
        List<WebElement> mainLinks = driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[2]"));

        int count = mainLinks.size();
        System.out.println("count is "+count);
        int min = 0;
        int max = count-1;
        int selectedCategory = (int)Math.floor(Math.random()*(max-min+1)+min);
        actions.moveToElement(mainLinks.get(selectedCategory)).perform();


    }

    @And("users clicks on sub-category")
    public void clicks on sub-cateogry(){
        String locator = "(//ul[@class='top-menu notmobile']//ul)["+selectedCategory+"]/li";
        List<WebElement> subCategoryLinks = driver.findElements(By.xpath(locator));


        String selectedSubCategoryText;

            int subCategoryCount = subCategoryLinks.size();
            System.out.println("profile links " + subCategoryCount);
            System.out.println(subCategoryLinks.get(0).getText());
            System.out.println(subCategoryLinks.get(1).getText());
            System.out.println(subCategoryLinks.get(2).getText());
            int selectedSubCategory = (int) Math.floor(Math.random() * (max - min + 1) + min);
            selectedSubCategoryText = subCategoryLinks.get(selectedSubCategory).getText();
            subCategoryLinks.get(selectedSubCategory).click();



        }






    @Then("verify page title")
    public void verify page(){
        String pageTitle= driver.findelement(By.cssSelector("div[class=\"page-title\"] h1")).getText();

        Assert.assertTrue(text.toLowerCase().equals(arg0.toLowerCase()));


    }


}

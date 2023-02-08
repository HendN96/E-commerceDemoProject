package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class D04_searchStepDefine {
    
    @When(" user search with \"<productName>\"")
    public void userSearchWith(String arg0){
        WebElement searchButton= driver.findElement(By.name("q")).sendKeys(arg0);

        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);



    }




    @Then("user could find {string} related results")
    public void userCouldFindRelatieReults(String arg0) {

        int size = driver.findElements(By.cssSelector("div[class=\"g Ww4FFb tF2Cxc\"] h3[class=\"LC20lb MBeuO DKV0Md\"]")).size();
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            String text = driver.findElements(By.cssSelector("div[class=\"g Ww4FFb tF2Cxc\"] h3[class=\"LC20lb MBeuO DKV0Md\"]")).get(i).getText();
            System.out.println(i);
            System.out.println(text);


            Assert.assertTrue(text.toLowerCase().contains(arg0));


        }

    @Then("user could find {string} inside product detail page")
    public void userCouldFindInsideProductDetailPage(String arg0) {
    }
}

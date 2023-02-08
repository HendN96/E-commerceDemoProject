package org.example.stepDefinitions;



public class D08_wishlistStepDefine {

    P03_homepage home = new P03_homepage();


    @When("user clicks on product")
    public void click_on_product(){
       driver.findElement(By.cssSelector("#body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div > div.product-grid.home-page-product-grid > div.item-grid > div:nth-child(2) > div > div.details > div.add-info > div.buttons > button.button-2.add-to-wishlist-button")).click();
        WebElement bar =driver.findElement(By.cssSelector("#bar-notification > div > p"));

        String s= bar.getCssValue("color");
        String c= Color.fromString(s).asHex();

    }
    @Then("success message appears")
    public void success_message(){

        System.out.println("The product has been added to your wishlist");
        Assert.assertTrue(text.equals("28a745"));
    }

}
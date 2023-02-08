package org.example.stepDefinitions;

public class D06_homeSlidersStepDefine {

    P03_homepage home = new P03_homepage();

    @When("user clicks on first slider")
    public void clicks_slider(){

        Hooks.driver.findElement(By.cssSelector("#nivo-slider > a:nth-child(1)")).click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<String>(Hooks.driver.getWindowHandles());




    }
    @Then("user is directed to page")
    public void go_to_page(){

        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");
    }


    When("user clicks on second slider")
    public void clicks_slider(){

        Hooks.driver.findElement(By.cssSelector("#nivo-slider > a:nth-child(1)")).click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<String>(Hooks.driver.getWindowHandles());




    }
    @Then("user is directed to page")
    public void go_to_page(){

        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/htc-one-m8-android-l-50-lollipop");
    }


}

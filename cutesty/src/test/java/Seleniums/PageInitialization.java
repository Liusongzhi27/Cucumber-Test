package Seleniums;

import io.cucumber.java.en.Given;

/**
 * Used to initialize the page
 */
public class PageInitialization extends AbstractDefinition
{

    //Open login page
    @Given("the Login page is opened")
    public void theLoginPageIsOpened() throws InterruptedException
    {
        driver.get("https://www.saucedemo.com/");

    }

    //Open product page
    @Given("the home page is opened")
    public void theHomePageIsOpened() throws InterruptedException
    {
        driver.get("https://www.saucedemo.com/inventory.html");

    }

    //Open shopping cart page
    @Given("the Cart page is opened")
    public void theCartPageIsOpened() {
        driver.get("https://www.saucedemo.com/cart.html");
    }
}
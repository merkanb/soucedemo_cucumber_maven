package com.sauce.stepDefs;

import com.sauce.pages.CheckoutPage;
import com.sauce.pages.LoginPage;
import com.sauce.pages.ProductPage;
import com.sauce.utilities.ConfigurationReader;
import com.sauce.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.*;           // static entire class import


public class LoginStepDefs {

    LoginPage loginPage=new LoginPage();
    ProductPage productPage=new ProductPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {

        Driver.get().get(ConfigurationReader.get("url"));

    }
    @When("The user enters {string} and {string}")
    public void the_user_enters_and(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("The user should be able to login")
    public void theUserShouldBeAbleToLogin() {
        assertTrue(productPage.header.isDisplayed());

    }


    @And("The user sorts the products {string}")
    public void theUserSortsTheProducts(String sortingType) {
        productPage.sortProduct(sortingType);
    }


    @And("The user adds cheapest {string} and second costliest {string} products")
    public void theUserAddsCheapestAndSecondCostliestProducts(String cheapest, String secondProduct) {

        productPage.addProduct(cheapest);
        productPage.addProduct(secondProduct);
    }

    @And("The user opens basket")
    public void theUserOpensBasket() {

        productPage.basket.click();
    }

    @And("The user clicks checkout")
    public void theUserClicksCheckout() {
        checkoutPage.checkoutBtn.click();
    }

    @And("The user enters details {string} {string} {string} and finish the purchase")
    public void theUserEntersDetailsAndFinishThePurchase(String firstname, String lastName, String postcode) {

        checkoutPage.enterDetails(firstname, lastName, postcode);
        checkoutPage.continueBtn.click();

    }

    @Then("The user verify that price is {string}")
    public void theUserVerifyThatPriceIs(String expectedTotalPrice) {

        assertEquals(expectedTotalPrice,checkoutPage.totalPrice.getText());
    }

    @And("The user finishes the purchase")
    public void theUserFinishesThePurchase() {
        checkoutPage.finishBtn.click();
    }


    @Then("The user verify that checkout complete header is {string}")
    public void theUserVerifyThatCheckoutCompleteHeaderIs(String expectedHeader) {
        assertEquals(expectedHeader,checkoutPage.checkoutCompleteHeader.getText());
    }


    @Then("The user write a new step")
    public void the_user_write_a_new_step() {
    }

    @Then("The user write another")
    public void the_user_write_another() {
    }


}


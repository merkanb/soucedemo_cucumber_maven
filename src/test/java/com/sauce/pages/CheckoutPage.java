package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{

    @FindBy(css = "#checkout")
    public WebElement checkoutBtn;

    @FindBy(id = "first-name")
    public WebElement firstNameInput;

    @FindBy(id = "last-name")
    public WebElement lastNameInput;

    @FindBy(id = "postal-code")
    public WebElement postcodeInput;

    @FindBy(name = "continue")
    public WebElement continueBtn;

    @FindBy(css = ".summary_info_label.summary_total_label")
    public WebElement totalPrice;

    @FindBy(css = "#finish")
    public WebElement finishBtn;


    @FindBy(xpath = "//*[text()='Thank you for your order!']")
    public WebElement checkoutCompleteHeader;



    public void enterDetails(String firstname,String lastName,String postcode){
        firstNameInput.sendKeys(firstname);
        lastNameInput.sendKeys(lastName);
        postcodeInput.sendKeys(postcode);
    }


}
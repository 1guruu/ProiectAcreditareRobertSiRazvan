package org.fasttrrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

public class CheckoutPage extends PageObject {
    @FindBy(css = ".woocommerce-info  ")
    private WebElementFacade checkoutMessage;
    @FindBy (css = ".checkout-button")
    private WebElementFacade checkoutButton;
    @FindBy (css = ".input-text#billing_first_name")
    private WebElementFacade completeFirstName;
    @FindBy (css = ".input-text#billing_last_name")
    private WebElementFacade completeLastName;
    @FindBy (css = ".input-text#billing_address_1")
    private WebElementFacade completeAddress;
    @FindBy (css = ".input-text#billing_city")
    private WebElementFacade completeCity;
    @FindBy (css = ".input-text#billing_postcode")
    private WebElementFacade completePostCode;
    @FindBy (css = ".input-text#billing_phone")
    private WebElementFacade completePhone;
    @FindBy (css = ".input-text#billing_email")
    private WebElementFacade completeEmail;
    @FindBy (css = ".button.alt")
    private WebElementFacade placeOrder;
    @FindBy (css = ".post-title")
    private WebElementFacade checkoutMessageOrder;





    public void checkoutMessageOrder(){
        checkoutMessageOrder.containsOnlyText("ORDER RECEIVED");
    }
    public void clickPlaceOrder(){
        clickOn(placeOrder);
    }
    public void completeOnEmail(String email){
        typeInto(completeEmail,email);
    }
    public void completeOnPhone(String phone){
        typeInto(completePhone,phone);
    }
    public void completeOnPostCode(String postcode){
        typeInto(completePostCode,postcode);
    }
    public void completeOnCity(String city){
        typeInto(completeCity,city);
    }
    public void completeOnAddress(String address){
        typeInto(completeAddress,address);
    }
    public void completeOnLastName(String lastName){
        typeInto(completeLastName,lastName);
    }
    public void completeOnFirstName(String firstName){
        typeInto(completeFirstName,firstName);
    }

    public void clickCheckoutButton(){
        clickOn(checkoutButton);
    }
    public void verifyCheckoutMessage(){
        checkoutMessage.shouldContainOnlyText("Checkout is not available whilst your cart is empty.");
    }
}


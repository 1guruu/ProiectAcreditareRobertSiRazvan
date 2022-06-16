package org.fasttrrack.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.List;


public class ProductPage extends BasePage {
    String quantity= RandomStringUtils.randomNumeric(1);

    @FindBy (css = ".single_add_to_cart_button")
    private WebElementFacade addToCartFromProduct;
    @FindBy (css = "h1.product_title")
    private WebElementFacade productTitle;
    @FindBy (css = ".woocommerce-message")
    private WebElementFacade productMessage;
    @FindBy (css = ".qty")
    private WebElementFacade quantityProduct;
    @FindBy (css = "#pa_color")
    private WebElementFacade hoodieColorDropdown;
    @FindBy (css = "#logo")
    private WebElementFacade hoodieLogoDropdown;



    public void selectHoodieColor(){
        selectFromDropdown(hoodieColorDropdown,"Green");
    }
    public void selectLogo(){
        selectFromDropdown(hoodieLogoDropdown,"No");

    }
    public void verifyChangeQuantity(){
        String product =productTitle.getTextContent();
        productMessage.shouldContainText(quantity+" × “"+product+"” have been added to your cart.");
    }

    public void changeQuantity(){
        typeInto(quantityProduct,quantity);
    }
    public void productAddedToCartMessage(){
        String product =productTitle.getTextContent();
        productMessage.shouldContainText("“"+product+"” has been added to your cart.");
    }

    public void clickOnAddToCartFromProduct(){
        clickOn(addToCartFromProduct);
    }
}

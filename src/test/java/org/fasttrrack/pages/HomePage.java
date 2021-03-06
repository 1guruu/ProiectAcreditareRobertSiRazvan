package org.fasttrrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://qa5.fasttrackit.org:8008/")
public class HomePage extends BasePage {

    @FindBy (css = ".search-form .search-field")
    private WebElementFacade searchTop;

    @FindBy (css = ".search-form .fa-search")
    private WebElementFacade clickSearchTop;

    @FindBy (id = "menu-item-70")
    private WebElementFacade myAccount;

    @FindBy (id = "menu-item-71")
    private WebElementFacade checkOut;

    @FindBy (id = "menu-item-72")
    private WebElementFacade cart;

    @FindBy (id =  "menu-item-73")
    private WebElementFacade shop;

    @FindBy (css = ".account")
    private WebElementFacade loggIn;

    @FindBy (css = ".bttn")
    private WebElementFacade readMoreButton;

    @FindBy (css = ".bttn")
    private WebElementFacade hitreadMoreButton;

    @FindBy (css = ".entry-title")
    private WebElementFacade readMorePageTitle;

    @FindBy (css = ".cat-item a")
    private WebElementFacade uncategorizedButton;

    @FindBy (css = ".page-header h2")
    private WebElementFacade uncategorizedPageTitle;

    @FindBy (css = "#archives-2  ul  li  a")
    private WebElementFacade archiveButton;

    @FindBy (css = ".page-header h2")
    private WebElementFacade archivePageTitle;

    @FindBy (css = ".widget .search-field")
    private WebElementFacade searchOnTheRight;

    @FindBy (css = ".widget  .fa-search")
    private WebElementFacade clickOnSearchFromRight;

    @FindBy (css = ".entry-title.ak-container")
    private WebElementFacade verifySearchMessage;

    @FindBy (css = "#menu-item-69 > a")
    private WebElementFacade pressHomeButton;


    public void verifyTheSearchPage(){
        verifySearchMessage.shouldContainText("SEARCH RESULTS: “”");
    }

    public void clickOnSearchFromRight(){
        clickOn(clickOnSearchFromRight);
    }

    public void completeSearchFromTheRight(String search){
        open();
        typeInto(searchOnTheRight,search);
    }

    public void openLoggIn(){
        open();
        clickOnLoggIN();
    }

    public void openCheckout(){
        open();
        clickOnCheckout();
    }

    public void openCart(){
        open();
        clickOnCart();
    }

    public void openShop(){
        open();
        clickOnShop();
    }

    public void openMyAccount(){
        open();
        clickOnMyAccount();
    }

    public void openSearch(){
        open();
        clickOnSearchFromTop();
    }

    public void clickOnLoggIN(){
        clickOn(loggIn);
    }

    public void clickOnCheckout(){
        clickOn(checkOut);
    }

    public void clickOnCart(){
        clickOn(cart);
        waitABit(500);
    }

    public void clickOnShop(){
        clickOn(shop);
    }

    public void clickOnMyAccount(){
        clickOn(myAccount);
    }

    public void clickOnSearchFromTop(){
        clickOn(clickSearchTop);
    }

    public void searchFromTop(String keyword){
        typeInto(searchTop,keyword);
    }

    public void homePageVerification(){
        readMoreButton.getText().equals("Read More");
    }

    public void clickReadMoreButton(){
        hitreadMoreButton.click();
    }

    public void verifyReadMore(){
        readMorePageTitle.getText().equals("Hello world!");
    }

    public void pressUncategorizedButton(){
        uncategorizedButton.click();
    }

    public void verifyUncategorizedPage(){
        uncategorizedPageTitle.getText().equals("Category: Uncategorized");
    }

    public void verifyArchives(){
        archiveButton.click();
    }

    public void verifyArchivesPage(){
        archivePageTitle.getText().equals("Month: April 2018");
    }
}

package org.fasttrrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://qa5.fasttrackit.org:8008/wp-admin/")
public class AdminPage extends PageObject {
    @FindBy (css = "#user_login")
    private WebElementFacade userAdmin;
    @FindBy (css = "#user_pass")
    private WebElementFacade passwordAdmin;
    @FindBy (id = "wp-submit")
    private WebElementFacade loginAdmin;

    public void completeUserAdmin(){
        typeInto(userAdmin,"admin");
    }
    public void completePasswordAdmin(){
        typeInto(passwordAdmin,"parola11");
    }
    public void clickLoginAdmin(){
        clickOn(loginAdmin);
    }

}

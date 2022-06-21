package org.fasttrrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrrack.pages.AdminPage;
import org.fasttrrack.pages.HomePage;
import org.fasttrrack.pages.MyAccountPage;
import org.fasttrrack.pages.ShopPage;
import org.fasttrrack.utils.Constants;

public class AdminSteps extends ScenarioSteps {
    private AdminPage adminPage;
    private HomePage homePage;
    private MyAccountPage myAccountPage;
    private ShopPage shopPage;
    @Step
    public void loginAdmin(){
        adminPage.open();
        adminPage.completeUserAdmin();
        adminPage.completePasswordAdmin();
        adminPage.clickLoginAdmin();
    }
    @Step
    public void verifyAdminPage(){
        adminPage.verifyAdmin();
    }

    @Step
//    Aici mai e nevoie de lucru...
    public void acceptAndVerifyCommentAsAdmin(){
       homePage.open();
       homePage.openLoggIn();
       myAccountPage.doLogin(Constants.USER_EMAIL,Constants.USER_PASSWORD);
       homePage.clickOnShop();
       shopPage.selectFirstProduct();
       shopPage.clickReviewButton();
       shopPage.pressOneStarReview();
       shopPage.writeComment();
       shopPage.submitComment();
       myAccountPage.pressAccountLink();
       myAccountPage.pressLogOut();
       adminPage.open();
       adminPage.completePasswordAdmin();
       adminPage.completeUserAdmin();
       adminPage.clickLoginAdmin();
       adminPage.verifyUserComment();
       adminPage.clickAproveCommentButton();
       homePage.open();
       homePage.clickOnShop();
       shopPage.selectFirstProduct();
       shopPage.clickReviewButton();
       shopPage.verifyProductComment();




    }
}

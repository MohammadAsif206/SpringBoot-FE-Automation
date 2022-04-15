package com.ea.SpringBasic.steps;

import com.ea.SpringBasic.models.TestUserDetails;
import com.ea.SpringBasic.models.UserDetails;
import com.ea.SpringBasic.pages.HomePage;
import com.ea.SpringBasic.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

public class LoginSteps {

    @Autowired
    public HomePage homePage;

    @Autowired
    public  LoginPage loginPage;

    @Autowired
    private TestUserDetails testUserDetails;


    @Given("I click login in the home page")
    public void iClickLoginInTheHomePage() {
        homePage.clickLogin();

        //Scenario Scope
        testUserDetails.setUserDetails(new UserDetails("admin","password"));

    }

    @And("I click login button")
    public void iClickLoginButton() throws InterruptedException {
       // Thread.sleep(2000);
        loginPage.clickLogin();

    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
        Assert.assertEquals(homePage.isEmployeeDetailsExists(),true);
    }
}

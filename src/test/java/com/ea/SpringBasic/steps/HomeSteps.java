package com.ea.SpringBasic.steps;

import com.ea.SpringBasic.models.TestUserDetails;
import com.ea.SpringBasic.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.springframework.beans.factory.annotation.Autowired;

public class HomeSteps {

    @Autowired
    LoginPage loginPage;

    @Autowired
    private TestUserDetails testUserDetails;
    @And("I enter the following for Login")
    public void iEnterTheFollowingForLogin(DataTable table) throws InterruptedException {
        //var data = table.asList();

        loginPage.Login(testUserDetails.getUserDetails().getUserName(),testUserDetails.getUserDetails().getPassword());

    }
}

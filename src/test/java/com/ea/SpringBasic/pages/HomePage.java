package com.ea.SpringBasic.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

@Component
public class HomePage extends BasePage{

    @FindBy(how = How.LINK_TEXT, using = "Login")
    public WebElement lnkLogin;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public WebElement lnkEmployeeList;

    @FindBy(how = How.LINK_TEXT, using = "Employee Details")
    public WebElement lnkEmployeeDetails;

    public LoginPage clickLogin(){
        lnkLogin.click();
        return new LoginPage();
    }
    public LoginPage clickEmployeeList(){
        lnkEmployeeList.click();
        return new LoginPage();
    }
    public boolean isEmployeeDetailsExists(){
        return lnkEmployeeDetails.isDisplayed();
    }

}

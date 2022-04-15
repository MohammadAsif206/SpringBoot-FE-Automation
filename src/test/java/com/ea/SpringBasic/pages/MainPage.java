package com.ea.SpringBasic.pages;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class MainPage extends BasePage{
    @Autowired
    private HomePage homePage;
    @Autowired
    private LoginPage loginPage;

    @Autowired
    private WebDriver webDriver;

    @Value("${app.url}")
    private String appUrl;

    public void performance(){
        webDriver.navigate().to(appUrl);
        homePage.clickLogin();
        loginPage.Login("admin","password");
        loginPage.clickLogin();
    }
}

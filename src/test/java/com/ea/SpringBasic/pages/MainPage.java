package com.ea.SpringBasic.pages;

import com.ea.SpringBasic.annotation.PageScope;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;

@Lazy
@PageScope
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
    public void PerformLogoff() {
        homePage.clickLogOff();
    }
}

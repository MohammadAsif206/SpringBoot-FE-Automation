package com.ea.SpringBasic;

import com.ea.SpringBasic.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.*;


@SpringBootTest
public class SpringTestNGTest extends AbstractTestNGSpringContextTests {

    @Lazy
    @Autowired
    private WebDriver webDriver;


    @Value("${app.url}")
    private String appUrl;


    @Autowired
    private MainPage mainPage;


    @BeforeTest
    protected void setUpWebDriver(){
        webDriver.navigate().to(appUrl);
    }

    @Test
    public void testLogin(){
        mainPage.performance();
        mainPage.PerformLogoff();
    }
//
//    @AfterTest
//    public void tearDown(){
//        webDriver.close();
//    }

    @BeforeClass(alwaysRun = true)
    @BeforeSuite(alwaysRun = true)
    @Override
    protected void springTestContextPrepareTestInstance() throws Exception {
        super.springTestContextPrepareTestInstance();
    }

}

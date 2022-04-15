package com.ea.SpringBasic.libraries;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class WebDriverLibrary {

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "chrome")
    public WebDriver getChromeDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    @Bean
      @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public WebDriver getFirefoxDriver(){
        WebDriverManager.firefoxdriver() ;
        return new FirefoxDriver();
    }
    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "edge")
    public WebDriver getEdgeDriver(){
        WebDriverManager.edgedriver() ;
        return new EdgeDriver();
    }
}

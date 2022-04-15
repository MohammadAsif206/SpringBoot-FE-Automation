package com.ea.SpringBasic;

import com.ea.SpringBasic.pages.MainPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

import java.util.List;


@SpringBootTest
@Profile(("qa"))
class SpringBasicApplicationTests {

	@Autowired
	private MainPage mainPage;

	@Value("${app.url}")
	private String appUrl;

	@Value("chrome,firefox, edges")
	private List<String> browsers;

	@Test
	void performLoginTest() {
		mainPage.performance();


	}

}

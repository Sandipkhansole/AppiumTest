package com.rc.runners;

import java.sql.Driver;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features",
		glue= {"stepDefinitions"},
		plugin= {"pretty","html:target/cucumber-reports"},
		monochrome=true
		)
public class TestRunner {

}

//Alert handling and iframe handling
Alerts al=driver.switchTo().alert();
al.accept();
al.dismiss();
al.getText();
driver.SwitchTo().frame(0);
driver.SwitchTo().defaultContent();
driver.switchTo().parentFrame();
hgfdsa

//this is for 
DesiredCapabilities cp=new DesiredCapabilities();
cp.setCapability("platformname","Android/IOS");
cp.setCapability("deviceName","emulator-5534");
cp.setCapability("app","path");
cp.setCapabilty("automationName","UiAutomator2/XCUITest");

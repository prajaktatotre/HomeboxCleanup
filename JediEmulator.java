import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class JediEmulator extends Jedi2base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		Set<String> s=driver.getContextHandles();
		System.out.println(s);
		Thread.sleep(20000);
		driver.findElementByXPath("//android.widget.Button[@content-desc='Agree']").click();
		driver.findElementByXPath("//android.widget.RadioButton[@content-desc='Consumer']").click();
		driver.findElementByXPath("//android.widget.Button[@content-desc='OK']").click();
		driver.findElementByXPath("//android.view.View[@content-desc='options outlineOptions']").click();
		driver.findElementByXPath("//android.widget.Button[@content-desc='Controllers']").click();
		System.out.println(driver.getContext());	
		driver.findElementByAndroidUIAutomator(":uiautomator, new UiSelector().className(\"android.widget.Button\").description(\"closeadd\");");
		
		/*System.out.println(driver.findElementByXPath("//android.widget.Button[@content-desc='closeadd']").getLocation());
		TouchAction t=new TouchAction(driver);
		t.tap(1530,1431).perform();
		//driver.findElementByXPath("//android.widget.Button[@content-desc='closeadd']").click();
		//System.out.println(driver.findElementByClassName("android.widget.Button").getText());
		//driver.findElementByAndroidUIAutomator("UiSelector().description(\"closeadd\")").click();
		//driver.findElementByXPath("//android.widget.Button[@content-desc='closeadd']").click();	
		//driver.findElementsByClassName("android.widget.Button").get(0).click();
		//driver.findElementsByClassName("android.widget.Button").get(1).click();
		//driver.findElementByAccessibilityId("closeadd").click();*/
	
		
	}

}


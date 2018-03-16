import java.net.MalformedURLException;
import java.util.Set;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Jedi extends Jedibase{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=Capabilities();
		//Thread.sleep(30000);
		/*driver.findElementByXPath("//android.view.View[@content-desc='settings']").click();
		driver.findElementByXPath("//android.widget.Button[@content-desc='Controllers']").click();
		driver.findElementByXPath("//android.widget.Button[@content-desc='add']").click();
		/*driver.findElementByXPath("//android.widget.Button[@text='Floating Button']").click();
		Thread.sleep(5000);
	    driver.findElementsByClassName("android.widget.ImageButton").get(0).click();
	    
	    //Set<String> s=driver.getContextHandles();
	  	//System.out.println(s);
	  	//driver.findElementByAccessibilityId("refresh").click();
		//driver.findElementByAccessibilityId("refresh");
		//driver.findElementByAccessibilityId("microphone ");
		//driver.findElementById("tab-0-0").click();
		//Thread.sleep(30000);
		//driver.context(" WEBVIEW_com.smartalyse.iot.app.jedi2");
		/*driver.findElementByXPath("//android.widget.Button[@content-desc='Agree']").click();
		driver.findElementByXPath("//android.widget.RadioButton[@content-desc='Consumer']").click();
		driver.findElementByXPath("//android.widget.Button[@content-desc='OK']").click();
		driver.findElementByXPath("//android.view.View[@content-desc='options outline Options']").click();*/
		
	}

}



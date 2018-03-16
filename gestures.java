import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class gestures extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
  
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//or driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		 
		//Tap
		TouchAction t=new TouchAction(driver);
		t.tap(driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")")).perform();
		//or t.tap(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
		
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		
		//press or longPress	
		t.longPress(driver.findElementByXPath("//android.widget.TextView[@text='People Names']")).waitAction().release().perform();
		System.out.println(driver.findElementById("android:id/alertTitle").getText());
		
	}

}

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Uiautomatortest extends base {

	public static void main(String[] args)throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	  //driver.findElementByAndroidUIAutomator("attribute("value")")
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

       		
	}

}



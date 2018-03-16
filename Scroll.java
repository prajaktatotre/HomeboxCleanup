import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Scroll extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub


		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*Dimension size= driver.manage().window().getSize();
		int x=size.getWidth();
		int starty=(int)(size.getHeight()*0.60);
		int endy=(int)(size.getHeight()*0.10);
	    driver.swipe(x,starty,endy,2000);
	    */
		driver.findElementByAndroidUIAutomator("text(\"Graphics\")").click();
	    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Vertices\"));").click();

	}

}

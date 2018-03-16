import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class dragDrop extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub


		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		TouchAction t=new TouchAction(driver);
		System.out.println(driver.findElementsByClassName("android.view.View").size());
		t.longPress(driver.findElementsByClassName("android.view.View").get(2)).moveTo(driver.findElementsByClassName("android.view.View").get(3)).release().perform();
		
	}

}

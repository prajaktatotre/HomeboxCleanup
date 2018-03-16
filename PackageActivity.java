import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class PackageActivity extends PackageActivityBase{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=Capabilities();
		Thread.sleep(20000);
		//driver.findElementByXPath("//android.widget.Button[@content-desc='0Conference Room']").click();
		//driver.findElementsByClassName("android.widget.Button").get(1).click();
		//driver.findElementByXPath("//android.widget.Button[@content-desc='0Dev room']").click();
		//driver.findElementByXPath("//android.widget.Button[@content-desc='legrandswitch - 0078B0D8.1']").click();
        //driver.findElementByXPath("//android.widget.Button[@content-desc='All ON']").click();
		//driver.findElementByXPath("//android.view.View[@content-desc='headset outlineMedia']").click();
		//driver.findElementByXPath("//android.view.View[@content-desc='lock outlineSecurity']").click();
		//driver.findElementsByClassName("android.widget.Button").get(1).click();
        //driver.findElementByXpath("//[@='']").click();
	    System.out.println(driver.getContext());
				
		
	}

}




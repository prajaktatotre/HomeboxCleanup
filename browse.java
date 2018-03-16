import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class browse extends chromebase{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.get("http://facebook.com");
		driver.findElementByXPath("//*[@id='m_login_email']").sendKeys("pqrst");
		driver.findElementByXPath("//*[@id='m_login_password']").sendKeys("12345");
		driver.findElementByXPath("//*[@id='u_0_5']").click();
	}

}



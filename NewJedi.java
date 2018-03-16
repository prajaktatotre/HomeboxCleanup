import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class NewJedi extends NewJediBase{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		Thread.sleep(30000);
		
	}

}


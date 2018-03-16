import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Raagabase {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
        
		
		File f=new File("src");
		File fs=new File(f,"APK Info_v1.2.11_apkpure.com.apk");
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android emulator");
		//or cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy");
		cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
		//cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Android");
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
	}

}

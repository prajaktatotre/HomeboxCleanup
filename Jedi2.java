import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Jedi2 extends Jedi2base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		Thread.sleep(30000);
		Set<String> s=driver.getContextHandles();
		System.out.println(s);
		/*driver.findElementByXPath("//android.widget.Button[@content-desc='Agree']").click();
		driver.findElementByXPath("//android.widget.RadioButton[@content-desc='Consumer']").click();
		driver.findElementByXPath("//android.widget.Button[@content-desc='OK']").click();
		driver.findElementByXPath("//android.view.View[@content-desc='options outlineOptions']").click();
		driver.findElementByXPath("//android.widget.Button[@content-desc='Controllers']").click();
		//Thread.sleep(10000);
	    TouchAction touchAction = new TouchAction(driver);
	    Dimension size= driver.manage().window().getSize();
		int x=(int)(size.getWidth()*0.50);
		int y=(int)(size.getHeight()*0.85);
		Thread.sleep(3000);
		touchAction.tap(x,y).perform();
		Thread.sleep(3000);
		//touchAction.tap(100, 390).perform();
		driver.context("WEBVIEW_com.smartalyse.iot.app.jedi2");*/
		
		driver.findElementByXPath("//android.widget.Button[@content-desc='0Conference Room']").click();
		Thread.sleep(3000);
		TouchAction touchAction = new TouchAction(driver);
		//touchAction.tap(250, 500).perform();
		//touchAction.press(250,500).perform();// ALL ON conference
		//Thread.sleep(2000);
		//touchAction.tap(820, 500).perform(); // ALL OFF conference		
		touchAction.tap(250, 750).perform();
		//touchAction.press(driver.findElementByXPath("//android.widget.SeekBar[@=content-desc='0']")).moveTo("//android.widget.SeekBar[@=content-desc='40']").release();
	}

}


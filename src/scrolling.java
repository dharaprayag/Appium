import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class scrolling extends base
{

	public static void main(String[] args) throws MalformedURLException
	{
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		TouchActions t = new TouchActions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.Textview[@text='Views']");
		driver.findElementByAndroidUIAutomator("new UiSelector().scrollIntoView(text(\"Radio Group\"));");
		

	}

}

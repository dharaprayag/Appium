import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Swipe extends base
{

	public static void main(String[] args) throws MalformedURLException
	{
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		TouchActions t = new TouchActions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.Textview[@text='Views']");
		driver.findElementByXPath("//android.widget.Textview[@text='Date Widgets']").click();
		driver.findElementByAndroidUIAutomator("text(\"2.Inline\")").click();
		driver.findElementByXPath("//*[@content-desc='9']").click();
		
		WebElement first = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement second = driver.findElementByXPath("//*[@content-desc='15']");
		t.longPress((WebElement) longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveToElement(second).release().perform();
		

	}

}

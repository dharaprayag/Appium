import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

public class dragAndDrop extends base
{

	public static void main(String[] args) throws MalformedURLException
	{
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		TouchActions t = new TouchActions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.Textview[@text='Views']").click();
		driver.findElementByXPath("//android.widget.Textview[@text='Drag and Drop']").click();
		
		WebElement source = driver.findElementsByClassName("android.view.View").get(0);		
		WebElement destination = driver.findElementsByClassName("android.view.View").get(1);
		
		t.longPress((WebElement) longPressOptions().withElement(element(source))).moveTo(element(destination)).release;
		

	}

	private static ElementOption element(WebElement source) {
		// TODO Auto-generated method stub
		return null;
	}

}

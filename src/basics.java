import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends base{
	
	//ENTER A VALUE IN WIFI SETTING Preference > Preference Dependencies > click checkbox of wifi > click on WiFi settings > send text in popup "hello" 
	//if you work in ui automator viewer after execution hit ctrl+c in cmd file for stop execution then only UIAutomator works

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//class value is a tag name in 99% of the cases
		
		driver.findElement(By.xpath("//android.windget.TextView[@text='Preference']")).click();
		driver.findElement(By.xpath("//android.windget.TextView[@text='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		driver.findElement(By.className("android.widget.EditText")).sendKeys("hello");
		driver.findElements(By.className("android.widget.Button")).get(2).click();
		
		
		
		
		

	}

}

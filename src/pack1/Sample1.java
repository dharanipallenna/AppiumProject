package pack1;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Sample1 {
	public static void main(String args[])throws Exception
	{
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID );
	capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "ASUS_ZO17D");
	capabilities.setCapability("appPackage", "com.facebook.katana");
	capabilities.setCapability("appActivity", ".LoginActivity");

	AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),
			capabilities);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElementByXPath("//*[@text='Phone or Email']").sendKeys("dharanivangala@gmail.com");
	driver.findElementByXPath("//*[@text='Password']").sendKeys("xxxxxx");
	driver.findElementById("Login click").click();

	}
}

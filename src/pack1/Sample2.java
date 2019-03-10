package pack1;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Sample2 {
	public static void main(String args[])throws Exception
	{
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID );
	capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "ASUS_ZO17D");
	capabilities.setCapability("appPackage", "com.grabtaxi.passenger");
	capabilities.setCapability("appActivity", "com.grab.pax.Home");

	AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),
			capabilities);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	

}
}

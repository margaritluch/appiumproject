import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class testingforfun {

    static AndroidDriver driver;
    public static void main(String[] args) throws MalformedURLException {
        try{
            openCalculator();
        }
        catch(MalformedURLException e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }

    }

    public static void openCalculator() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","Galaxy A40");
        cap.setCapability("udid","R58M846QLZH");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion","10");
        cap.setCapability("noReset","true");

        cap.setCapability("appPackage","com.sec.android.app.popupcalculator");
        cap.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, cap) ;

        System.out.println("Appllication started successfully....");
    }

}

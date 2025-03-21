package activity;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;

public class Activity2 
{
    // Driver Declaration
    AndroidDriver driver;
    
    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException, URISyntaxException 
    {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();

        // Set the Appium server URL
        URL serverURL = new URI("http://localhost:1111").toURL();

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);

        // Open the page in Chrome
        driver.get("https://training-support.net");
    }

    // Test method
    @Test
    public void chromeTest() throws InterruptedException 
    {
    	// Find heading on the page
        String pageHeading = driver.findElement(AppiumBy.xpath("//android.view.View[@text=\"Training Support\"]")).getText();

        Thread.sleep(5000);
        
        // Print to console
        System.out.println("Page Heading: " + pageHeading);
        
        // Find and click the About Us link
        driver.findElement(AppiumBy.xpath("//android.view.View[@text=\"About Us\"]")).click();

        Thread.sleep(5000);
        
        // Find heading of new page and print to console
        String aboutPageHeading = driver.findElement(AppiumBy.xpath("//android.view.View[@text=\"About Us\"]")).getText();
        System.out.println("Page Heading: " + aboutPageHeading);
    }


    // Tear down method
    @AfterClass
    public void tearDown() 
    {
        // Close the app
        driver.quit();
    }
}
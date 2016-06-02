package citi.thankyou;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rotatable;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PlpPages {
	private static WebDriver driver;

	 public static final String USERNAME = "zaqwsx1";
	  public static final String AUTOMATE_KEY = "Fs54nwmULt7BaSTosZxi";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
	 
	 
	  public String browser_type;
	  public String fail,error,url,rotate;
	  public String baseUrl = "https://uat.charmin.com/en-us";
	  
		static String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	    int counter=1;
		String local=(new java.io.File("").getAbsolutePath());
		String data="" + local + "/" + "url.csv";	
		String myTitle,brand;
		String csvFileToRead;
		String slide1 = "Today's Fresh Fish";
	    String safe = "https://10.10.10.34:8080/job/TESTNG3/ws/PageLoads1";
	  @Test(groups = {"create"})
		@Parameters({"browser"})
	  @BeforeClass
	  public void beforeClass(String browser) throws IOException, InterruptedException
	  {	   
		  
		  
		  
		if (browser.equals("firefoxMAC")) {
			  driver=browserFirefoxYasomin();
			  csvFileToRead = data;
			}
		  
		  

	
		  
		  String name=""+ browser+"/" + browser +"_"+ counter + "_" + "Successful-Completed-Capture.png";
		 
			  System.out.println("Let me see which one get tested " +browser);
			  System.out.println("Image Name " +name);

			  
		 
		  System.out.println("Let me run get driver "+driver);
		  fail="/failed/" + browser +"_"+ counter + "_" + "Failed.png";
			 
		  
		  
		 
		    BufferedReader br =null;
		    String line="";
		    String ext = "png";
		    File dir = new File("/users/agolubev1/Desktop/RondAndroid");
		
		    int lineNumber = 0;

		    br = new BufferedReader(new FileReader(csvFileToRead));  
		    brand = System.getProperty("Brand");
		    while ((line = br.readLine()) != null) {
			  	  
		        System.out.println("The URL is " + counter);
		        String [] nextLine = line.split(",");
		        // nextLine[] is an array of values from the line
		        System.out.println(nextLine[lineNumber]);
		        url=nextLine[lineNumber];
		        driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		        System.out.println("The URL is " + url);	
		        System.out.println("Image Name " +name);
		        counter+=1;
		        if (url.toLowerCase().endsWith(brand))
		        {
		        	 driver.get(url);
		        	 driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		        	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        	  driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		        	  driver.manage().window().setSize(new Dimension(320,1156));
				        name=local + "/320/" + counter + "_" + "320x568.png";
				        takeScreenPortrait(name);
				        System.out.println("Image Name " +name);
				        driver.manage().window().setSize(new Dimension(320,568));
				        
				        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				        
				        
				        name=local + "/320/" + "_" + counter + "930x1156.png";
				        takeScreenPortrait(name);
				        System.out.println("Image Name " +name);
				        driver.manage().window().setSize(new Dimension(930,1156));
				        
				        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				        name=local + "/320/" + "_" + counter + "1200x1400.png";
				        takeScreenPortrait(name);
				        System.out.println("Image Name " +name);
				        driver.manage().window().setSize(new Dimension(1200,1400));
				      
				        takeScreenPortrait(name);
				        System.out.println("Image Name " +name);
				        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				       
				    
				        
		        }
		        
		        else 
		        {
		        	System.out.println("Skip url # " +counter);
		        }
		       
		        
		      

		      }
	
		 
	    	 driver.quit();   
		
	  }
	  @BeforeTest
	  public void beforeTest()
	  {
		  System.out.println("Let me run beforeTest");
	  }  
	  @Test
	  public void f()
	  {
	       //your test code here
		  System.out.println("I'm out here print f");
	  }
	 @AfterTest
	 public void afterTest()
	 {
	 }
	 @AfterClass
	 public void afterClass()
	 {
	     driver.quit();
	 }

	 
	
	 
	 
	 
	
	 
	 
	 
	 
	 
	 
	
	 
	 public WebDriver browserFirefoxYasomin() throws MalformedURLException  
	 {  
	  
		 System.out.println("Let me run Yasomin");
		 String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browser", "Firefox");
		 caps.setCapability("browser_version", "40.0");
		 caps.setCapability("os", "OS X");
		 caps.setCapability("os_version", "Yosemite");
		 caps.setCapability("resolution", "1024x768");
		 caps.setCapability("browserstack.debug", "true");
		 caps.setCapability("acceptSslCerts", "true");
		 caps.setCapability("browserstack.selenium_version", "2.47.1");
			
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run Firefox  39 MAC OS");
	      browser_type="browserFirefoxYasomin";
	      System.out.println("Let me see which one get tested" +browser_type);
	      System.out.println("Let me see which one get tested" +driver);
	      //driver.get("http://www.publicis.com/");
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      System.out.println(data);
	      return driver;
	   
	    
	      
	 }
	 
	 
	 
	


	 
	
	 public WebDriver takeScreenPortrait(String name) throws IOException
	 {
		
		 WebDriver augmentedDriver = new Augmenter().augment(driver);
		//  System.out.println("Let me Rotate ");
	//	((Rotatable)augmentedDriver).rotate(ScreenOrientation.PORTRAIT);
	     System.out.println("Let me take a screenshot " +name);
	     driver.manage().timeouts().implicitlyWait(915, TimeUnit.SECONDS);
	   
	     driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		    File screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
		  
		  
		    
		   
		    FileUtils.copyFile(screenshot, new File(name));
		    
		    return driver;
	 }
	
	 
	 
	 @AfterMethod(alwaysRun = true, description = "take screenshot on fails") 
	 public void afterMethod_takeScreenshot(ITestResult result) throws Exception { 
	 if (!result.isSuccess()) { 
		 

		 WebDriver augmentedDriver = new Augmenter().augment(driver);
	     System.out.println("I found a bug placed a screen shot @ ContactUS");
		  
		    	
		    File screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);

		   
		    FileUtils.copyFile(screenshot, new File(fail));
	
	 } 
	 }

}

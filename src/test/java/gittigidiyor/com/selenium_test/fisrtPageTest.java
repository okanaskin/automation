package gittigidiyor.com.selenium_test;

import Models.firstPage;
import junit.framework.Assert;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.log4j.BasicConfigurator;  
import org.apache.log4j.LogManager;  
import org.apache.log4j.Logger;  
import org.apache.log4j.PropertyConfigurator;




public class fisrtPageTest {
    public static WebDriver driver;
    private static String baseUrl;
    public static String aranacak_kelime = "Bilgisayar";
    //public Logger logger;
    private static final Logger logger = LogManager.getLogger(App.class);
    
    
    public static firstPage elementPage;
    
    
    @Before
    public void setUp() throws Exception {
    	
    	
    	
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\okan\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.gittigidiyor.com";
      
        elementPage = new firstPage(driver);
        
    }
    
    @Test
    public void giris() throws InterruptedException {
    	
    	
    	BasicConfigurator.configure();
    	driver.get(baseUrl);
    	Thread.sleep(4000);
    	driver.manage().window().maximize();
    	logger.info("Sayfa buyutuldu");
    	if(elementPage.mainInfoName().isDisplayed()) {
    		
    		logger.info("Ana Sayfa acildi");
    		
    	}
    	
    	else {
    		
    		logger.info("Ana Sayfa acilmadi");
    		Assertions.fail("Ana sayfa acilmadi.");
    		
    	}
    	  }
    
    
    @Test
    public void aramaFunc() throws InterruptedException {
    	
    	BasicConfigurator.configure();
    	driver.get(baseUrl);
    	Thread.sleep(4000);
    	driver.manage().window().maximize();
    	logger.info("Sayfa buyutuldu");
    	elementPage.searchBar().sendKeys(aranacak_kelime);
    	
    	
    }


}

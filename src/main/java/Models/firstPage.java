package Models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class firstPage {
    public static WebDriver driver;
    
    public firstPage(WebDriver webDriver) {
        driver = webDriver;
 
    }

    public WebElement mainInfoName() {
        return driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[1]/div/div/a/div/img"));
    }
    
    public WebElement searchBar() {
        return driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]/input"));
    }
    
    public WebElement searchButton() {
        return driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[2]/button"));
    }
    
    
    
  //*[@id="main-header"]/div[3]/div/div/div/div[2]/form/div/div[2]/button/span
  //*[@id="main-header"]/div[3]/div/div/div/div[2]/form/div/div[2]/button

  

}


package app.browsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {
    private WebDriver driver;
    public ChromeDriver localChrome(){
        try {
            System.setProperty("webdriver.chrome.driver","/Users/claudioperez/Documents/programacion/chromeDriverSelenium");
            driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://www.google.cl");
            Thread.sleep(5000);
        }
        catch (Exception e){
            System.out.println("load error in driver"+e.getMessage());
        }
        return (ChromeDriver) driver;
    }
}

package daftra_crud_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    private static WebDriver driver = WebDriverConfig.getDriver();


    public static void log_in()
    {
        driver.manage().window().maximize();
        //open website URL
        driver.get("https://xipipe73125.daftra.com");
        //find email and password fields and enter the data
        WebElement email= driver.findElement(By.id("Email"));
        email.sendKeys("xipipe731225@janfab.com");
        WebElement password= driver.findElement(By.id("Password"));
        password.sendKeys("Zaid@250598");
        //search for log in button and click on it
        WebElement log_in= driver.findElement(By.xpath("/html/body/div[1]/div/form/button"));
        log_in.click();
    }
}

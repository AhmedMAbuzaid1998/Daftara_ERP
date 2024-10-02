package daftra_crud_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Update_Client {

    private static WebDriver driver = WebDriverConfig.getDriver();
    public static void updateClient()
    {
        //find edit botton on client record page and click it
        WebElement edit_btn= driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div[2]/div/ol/div[3]/a[1]"));
        edit_btn.click();
        //find name field and update it with the new name
        WebElement update_fullname= driver.findElement(By.id("ClientBusinessName"));
        update_fullname.sendKeys(WebDriverConfig.udated_name);
        //find save button and click it
        WebElement save_btn= driver.findElement(By.id("submitBtn"));
        save_btn.click();
        //check if the update done or not
        WebElement logResult = driver.findElement(By.cssSelector("#flashMessage"));
        if (logResult.getText().contains("Client has been saved")) {
            System.out.println("record updated successfully");
        } else {
            System.out.println("record update failed!");
        }

    }
}

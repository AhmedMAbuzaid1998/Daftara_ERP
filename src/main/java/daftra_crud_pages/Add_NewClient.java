package daftra_crud_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Add_NewClient
{
    private static WebDriver driver = WebDriverConfig.getDriver();

    public static void new_client()
    {
        //find client button and click it then find add new client and click it
        WebElement client = driver.findElement(By.xpath("//a[@class='menu-item account-tie' and span[text()='Clients']]"));
        client.click();
        WebElement addNewClient = driver.findElement(By.cssSelector("#main-nav > div.prim-nav.main-nav.nav-scroll.clearfix.app-manager-dropdown-container > div.simplebar-wrapper > div.simplebar-mask > div > div > div > div > ul > li.super-menu.mn_7.mn_clients.open-submenu > div > ul > li:nth-child(2) > a"));
        addNewClient.click();
        //find data fields and enter them
        WebElement fullname= driver.findElement(By.id("ClientBusinessName"));
        fullname.sendKeys(WebDriverConfig.name);
        /* WebElement telephone= driver.findElement(By.id("ClientPhone1"));
        telephone.sendKeys(WebDriverConfig.telephone_no);
        WebElement mobile= driver.findElement(By.id("ClientPhone2"));
        mobile.sendKeys(WebDriverConfig.mobile_no);
        WebElement reg_email= driver.findElement(By.id("ClientEmail"));
        reg_email.sendKeys(WebDriverConfig.email_add);*/
        //find save button and click it
        WebElement save_btn= driver.findElement(By.id("submitBtn"));
        save_btn.click();
        //check if the client record created or not
        WebElement logResult = driver.findElement(By.cssSelector("#flashMessage"));
        if (logResult.getText().contains("Client has been saved")) {
            System.out.println("successfully created record!");
        } else {
            System.out.println("failed!");
        }

    }
}

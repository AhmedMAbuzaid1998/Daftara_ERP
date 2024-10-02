package daftra_crud_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Delete_Client {

    private static WebDriver driver = WebDriverConfig.getDriver();
    public static void deleteClient()
    {
        //find manage client button and click it
        WebElement manageClient = driver.findElement(By.cssSelector("#main-nav > div.prim-nav.main-nav.nav-scroll.clearfix.app-manager-dropdown-container > div.simplebar-wrapper > div.simplebar-mask > div > div > div > div > ul > li.super-menu.mn_7.mn_clients.open-submenu > div > ul > li:nth-child(1) > a"));
        manageClient.click();
        //find client menue and click it
        WebElement menu_d= driver.findElement(By.xpath("//*[@id=\"lising-table\"]/tbody/tr[1]/td[4]/div/button"));
        menu_d.click();
        //find delete icon and click it
        WebElement delete_c= driver.findElement(By.xpath("//*[@id=\"lising-table\"]/tbody/tr[1]/td[4]/div/div/a[4]"));
        delete_c.click();
        //find confirmation botton to delete record and click it
        WebElement confirm_btn= driver.findElement(By.name("submit_btn"));
        confirm_btn.click();
        //check if the record deleted or not
        WebElement deletelog = driver.findElement(By.className("ui-flash-message-body-text"));
        if (deletelog.getText().contains("Client has been deleted")) {
            System.out.println("record deleted successfully");
        } else {
            System.out.println("record deleted failed!");
        }


    }
}

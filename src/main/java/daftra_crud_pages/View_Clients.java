package daftra_crud_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class View_Clients {
    private static WebDriver driver = WebDriverConfig.getDriver();
    public static void viewClient()
    {
        //find manage client button and click it
        WebElement manageClient = driver.findElement(By.cssSelector("#main-nav > div.prim-nav.main-nav.nav-scroll.clearfix.app-manager-dropdown-container > div.simplebar-wrapper > div.simplebar-mask > div > div > div > div > ul > li.super-menu.mn_7.mn_clients.open-submenu > div > ul > li:nth-child(1) > a"));
        manageClient.click();
        //find client record and view it
        WebElement read= driver.findElement(By.xpath("//*[@id=\"lising-table\"]/tbody/tr[1]/td[1]/a"));
        read.click();
        //check if you cand see client record page or not
        WebElement check_view = driver.findElement(By.cssSelector("#main-content > div.layout-container > div.main-area.clearfix > div > ol > div.pages-head.fixed-div > div > h1 > span:nth-child(1)"));
        if (check_view.getText().contains(WebDriverConfig.name)) {
            System.out.println("Ahmed Abuzaid record");
        } else {
            System.out.println("failed!");
        }

    }
}

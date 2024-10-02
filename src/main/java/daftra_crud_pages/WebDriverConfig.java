package daftra_crud_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfig {
    public static String name="Ahmed Abuzaid";
    public static String telephone_no="05527865254";
    public static String mobile_no="0124585689";
    public static String email_add="aghne@gmail.com";
    public static String udated_name="NEW";

    private static WebDriver cdriver;
    public static WebDriver getDriver() {
        if (cdriver == null) {

            // Initialize ChromeDriver
            cdriver = new ChromeDriver();
        }
        return cdriver;
    }
}

import daftra_crud_pages.*;
import org.openqa.selenium.WebDriver;

public class Main {

    private static WebDriver driver = WebDriverConfig.getDriver();
    public static void main(String[] arg)
    {
        Login.log_in();
        Add_NewClient.new_client();
        View_Clients.viewClient();
        Update_Client.updateClient();
        Delete_Client.deleteClient();
        driver.quit();

    }
}

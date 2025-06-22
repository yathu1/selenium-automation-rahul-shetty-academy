import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        // Select the first city from the dropdown
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        // Wait for the dropdown to update
        Thread.sleep(2000L);
        // Select the second city from the dropdown
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
    }
}

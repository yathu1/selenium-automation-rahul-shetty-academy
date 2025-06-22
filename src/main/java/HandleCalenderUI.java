import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandleCalenderUI {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

     //   driver.findElement(By.cssSelector(".ui-state-default.ui-state-active.ui-state-hover")).click();

        driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled();
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled();

        if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1")){
            System.out.println("its enabled");
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }

    }
}

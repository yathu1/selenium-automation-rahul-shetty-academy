import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

    public static void main(String[] args) {
        // This class is currently empty and does not perform any actions.
        // You can implement window activities here as needed.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.yahoo.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.close();
    }

}

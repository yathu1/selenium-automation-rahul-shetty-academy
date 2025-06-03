import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {
    public static void main(String[] args) {
        //invoking chrome browser
     //   System.setProperty("webdriver.chrome.driver","C:/Users/Yathuraj/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }
}

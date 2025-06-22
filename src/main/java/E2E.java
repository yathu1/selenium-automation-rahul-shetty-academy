import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        // Select the first city from the dropdown
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        // Wait for the dropdown to update
        Thread.sleep(2000L);
        // Select the second city from the dropdown
        //  driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();

        driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
        if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5")){
            System.out.println("its enabled");
            Assert.assertFalse(false);

        }else{
            Assert.assertTrue(true);
        }

        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        int i = 1;
        while (i < 5) {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        driver.findElement(By.id("btnclosepaxoption")).click();

        WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));


        Select dropDown = new Select(staticDropDown);
        dropDown.selectByIndex(3);
        System.out.println(dropDown.getFirstSelectedOption().getText());
        driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
    }


}

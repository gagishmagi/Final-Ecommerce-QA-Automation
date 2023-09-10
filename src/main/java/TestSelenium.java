import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestSelenium {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());

        driver.quit();
    }
}

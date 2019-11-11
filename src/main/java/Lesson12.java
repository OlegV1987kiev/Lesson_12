import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Lesson12 {

    public static void main(String[] args) {
//        System.setProperty("webdriver.gecko.driver", "F:\\34\\Fox\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();

        System.setProperty("webdriver.gecko.driver", "F:\\34\\Fox\\geckodriver.exe");
       WebDriver driver = new FirefoxDriver();
//        driver.get("http://automationpractice.com/");
//        System.setProperty("webdriver.chrome.driver","F:\\34\\Chrom\\1\\chromedriver.exe");
//                WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        WebElement singIn = driver.findElement(By.cssSelector(".login"));
        singIn.click();
        WebElement email = driver.findElement(By.id("email_create"));
        email.sendKeys("test@gmail.com");
        WebElement createAccount = driver.findElement(By.cssSelector("#SubmitCreate > span:nth-child(1)"));
        createAccount.click();
//        Thread.sleep("5000");
        WebElement dynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("dynami cElement_id")));

        WebElement validationMessage = driver.findElement(By.cssSelector("#create_account_error > ol:nth-child(1)"));
        boolean b =validationMessage.isEnabled();
        String a = validationMessage.getText() ;
        System.out.println(b);
        System.out.println(a);
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Set the driver path

System.setProperty("webdriver.chrome.driver", "D:\\SysOps Session CloudEQ\\selenium_proj\\src\\drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

 

driver.get("https://demo.guru99.com/test/newtours/register.php");

 

Thread.sleep(1000);

 

WebElement firstName = driver.findElement(By.name("firstName"));

firstName.sendKeys("Yuvraj Kumar");

 

Thread.sleep(1000);

 

WebElement lastName = driver.findElement(By.name("lastName"));

lastName.sendKeys("Arora");

 

Thread.sleep(1000);

 

WebElement phone = driver.findElement(By.name("phone"));

phone.sendKeys("6239557767");

 

Thread.sleep(1000);

 

WebElement username = driver.findElement(By.name("userName"));

username.sendKeys("yuvrajarora070@gmail.com");

 

Thread.sleep(1000);

 

WebElement address = driver.findElement(By.name("address1"));

address.sendKeys("H/n 213/8, Basti Nau");

 

Thread.sleep(1000);

 

WebElement city = driver.findElement(By.name("city"));

city.sendKeys("Jalandhar City");

 

Thread.sleep(1000);

 

WebElement state = driver.findElement(By.name("state"));

state.sendKeys("Punjab");

 

Thread.sleep(1000);

 

WebElement pinCode = driver.findElement(By.name("postalCode"));

pinCode.sendKeys("144002");
Thread.sleep(1000);
Select countryList = new Select(driver.findElement(By.name("country")));
countryList.selectByValue("INDIA");
Thread.sleep(1000);
WebElement loginUserName = driver.findElement(By.id("email"));
loginUserName.sendKeys("yuvrajarora070@gmail.com");
Thread.sleep(1000);
WebElement password = driver.findElement(By.name("password"));
password.sendKeys("yuvraj@123");
Thread.sleep(1000);
WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
confirmPassword.sendKeys("yuvraj@123");
Thread.sleep(1000);
WebElement submit = driver.findElement(By.name("submit"));
submit.click();
Thread.sleep(5000);
driver.quit();
}
}
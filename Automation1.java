package florida;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.project.utils.ExtentManager;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation1 {
	WebDriver driver;
	WebDriverWait wait;
	SoftAssert soft;
	ExtentReports extent;
    ExtentTest test;

	@BeforeTest
	public void setup() {
		extent = ExtentManager.getInstance(); // Initialize ExtentReports
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get(" https://westfloridaahec.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		soft = new SoftAssert();

	}

	
	// User Login
	
	@Test(priority = 2)

	public void login() throws InterruptedException, IOException {

		// login with valid email and password
		
		test = extent.createTest("Login with Email and Password");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav/ul/li/a/span[text()='My Account']"))).click();
		String username = "Vinod";
		String email = "test2@yopmail.com";
		String password = "123456Wasd#!&";
		driver.findElement(By.id("username")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();

		String name = driver.findElement(By.xpath("//div[@class='woocommerce-MyAccount-content']/p[1]")).getText();
		if (name.contains(username)) {

			WebElement high = driver.findElement(By.xpath("//div[@class='woocommerce-MyAccount-content']/p[1]"));
			high.getText();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", high);
			Actions act = new Actions(driver);
			act.moveToElement(high).perform();
			Thread.sleep(2000);

			if (high.isDisplayed()) {
				((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'yellow';", high);

			}

			driver.findElement(By.xpath("//*[@id=\"post-381\"]/div/div/nav/ul/li[7]/a")).click();


			driver.navigate().refresh();
	        test.pass("Test passed successfully.");

		}

	}

	// Trying to login with invalid email and password

	@Test(priority = 3)
	public void invalid() throws IOException {
		
		
        test = extent.createTest("Invalid Email and Password");
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav/ul/li/a/span[text()='My
		// Account']"))).click();
		driver.findElement(By.id("username")).sendKeys("test@omial");
		driver.findElement(By.id("password")).sendKeys("123456Wasd#");
		driver.findElement(By.name("login")).click();

		String error = driver.findElement(By.xpath("//*[@id=\"post-381\"]/div/div/div[1]/div/div")).getText();


		driver.navigate().refresh();
        test.pass("Test passed successfully.");
	}

	
	//login using invalid password
	
	@Test(priority = 4)
	public void invalidpass() throws IOException {
		
		
		test = extent.createTest("Invalid Password");
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav/ul/li/a/span[text()='My Account']"))).click();
		String username = "Vinod";
		String email = "test2@yopmail.com";
		String password = "123456Wasd&";

		driver.findElement(By.id("username")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();

		String error = driver.findElement(By.xpath("//*[@id=\"post-381\"]/div/div/div[1]/div/div")).getText();
        test.pass("Test passed successfully.");

	}
	
	//password reset
	
	@Test(priority = 5)
	public void resetpass() throws IOException {
		
		test = extent.createTest("Password Reset");
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav/ul/li/a/span[text()='My Account']"))).click();
		driver.findElement(By.linkText("Lost your password?")).click();
		
		driver.findElement(By.id("user_login")).sendKeys("test2@yopmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
        test.pass("Test passed successfully.");
		
	}
	
	@AfterTest
	public void quit() {
		 driver.quit();
		 extent.flush(); // Save the Extent Report
	}

}

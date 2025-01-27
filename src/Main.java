package florida;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.project.utils.ExtentManager;

import graphql.Assert;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation {
	
	WebDriver driver=null;
	WebDriver wait;
	ExtentReports extent;
    ExtentTest test;

	
    //Printing all the navigation bar options
	@Test(priority=1)
	public void all() {
		test = extent.createTest("All Navigation Bar Options");
		List<WebElement> elements = driver.findElements(By.className("fusion-menu"));
		System.out.print("Navigation Menu Consists of : \n");		
		for (WebElement webElement : elements) {
            String element = webElement.getText();
            System.out.print(element);
        }
		System.out.println();
		test.pass("Success");
	}
	
	// Home Page
	
  //Checking if home is available
  @Test(priority=2)
  public void verificationOfHome() {
      test = extent.createTest("Home");
	  WebElement home=driver.findElement(By.id("menu-item-207"));
	  boolean homeVerification=home.isDisplayed();
	  Assert.assertTrue(homeVerification);
	  System.out.println("Home is Available");
	  test.pass("Success");
  }
  
  //Checking if about is available
  @Test(priority=3)
  public void verificationOfAbout() {
      test = extent.createTest("About");
	  WebElement about=driver.findElement(By.id("menu-item-616"));
	  boolean aboutVerification=about.isDisplayed();
	  Assert.assertTrue(aboutVerification);
	  System.out.println("About is Available");
	  test.pass("Success");
  }
  
  //Checking if programs is available
  @Test(priority=4)
  public void verificationOfPrograms() {
      test = extent.createTest("Programs");
	  WebElement programs=driver.findElement(By.id("menu-item-264"));
	  boolean programVerification=programs.isDisplayed();
	  Assert.assertTrue(programVerification);
	  System.out.println("Programs is Available");
	  test.pass("Success");
  }
  
  //Checking if Services is Available
  @Test(priority=5)
  public void verificationOfServices() {
      test = extent.createTest("Services");
	  WebElement services=driver.findElement(By.id("menu-item-331"));
	  boolean serviceVerification=services.isDisplayed();
	  Assert.assertTrue(serviceVerification);
	  System.out.println("Services is Available");
	  test.pass("Success");
  }
  
  //Checking if CPR is available
  @Test(priority=6)
  public void verificationOfCPR() {
	  test = extent.createTest("CPR");
	  WebElement CPR=driver.findElement(By.id("menu-item-467"));
	  boolean CPRVerification=CPR.isDisplayed();
	  Assert.assertTrue(CPRVerification);
	  System.out.println("CPR is Available");
	  test.pass("Success");
  }
  
  //Checking if contact is available
  @Test(priority=7)
  public void verificationOfContactUs() {
	  test = extent.createTest("Contact Us");
	  WebElement contact=driver.findElement(By.id("menu-item-209"));
	  boolean contactVerification=contact.isDisplayed();
	  Assert.assertTrue(contactVerification);
	  System.out.println("Contact is Available");
	  test.pass("Success");
  }
  
  //Checking if News is available
  @Test(priority=8)
  public void verificationOfNews() {
      test = extent.createTest("News");
	  WebElement news=driver.findElement(By.id("menu-item-1097"));
	  boolean newsVerification=news.isDisplayed();
	  Assert.assertTrue(newsVerification);
	  System.out.println("News is Available");
	  test.pass("Success");
  }
  
  //Checking if Account is available
  @Test(priority=9)
  public void verificationOfAccount() {
	  test = extent.createTest("Account");
	  WebElement account=driver.findElement(By.xpath("//*[@id=\"menu-main-menu\"]/li[8]"));
	  boolean accountVerification=account.isDisplayed();
	  Assert.assertTrue(accountVerification);
	  System.out.println("My Account is Available");
	  test.pass("Success");
  }
  
  // About Page
  //Checking if "Board of Directors" page is working
  @Test(priority=10)
  public void boardOfDirectors() {
	  test = extent.createTest("Board of Directors");
	  WebElement program=driver.findElement(By.id("menu-item-616"));
	  Actions a=new Actions(driver);
	  a.moveToElement(program).perform();
	  driver.findElement(By.id("menu-item-594")).click();
	  boolean title=driver.getCurrentUrl().equals("https://westfloridaahec.org/board-of-directors/");
	  Assert.assertTrue(title);
	  System.out.println("\"Board of Directors\" page is working");
	  test.pass("Success");
  }
  
  //Checking if "Staff" page is working  
  @Test(priority=11)
  public void staff() {
	  test = extent.createTest("Staff");
	  WebElement program=driver.findElement(By.id("menu-item-616"));
	  Actions a=new Actions(driver);
	  a.moveToElement(program).perform();
	  driver.findElement(By.id("menu-item-593")).click();
	  boolean title=driver.getCurrentUrl().equals("https://westfloridaahec.org/staff/");
	  Assert.assertTrue(title);
	  System.out.println("\"Staff\" page is working");
	  test.pass("Success");
  }
  
  //Checking if "Partners" page is working 
  @Test(priority=12)
  public void partners() {
	  test = extent.createTest("Partners");
	  WebElement program=driver.findElement(By.xpath("//*[@id=\"menu-item-616\"]/a/span[1]"));
	  Actions a=new Actions(driver);
	  a.moveToElement(program).perform();
	  driver.findElement(By.xpath("//*[@id=\"menu-item-305\"]/a/span")).click();
	  boolean title=driver.getCurrentUrl().equals("https://westfloridaahec.org/partners-and-memberships/");
	  Assert.assertTrue(title);
	  System.out.println("\"Partners\" page is working");
	  test.pass("Success");
  }
  
  //Checking if "Work With Us" page is working 
  @Test(priority=13)
  public void workWithUs() {
	  test = extent.createTest("Work with Us");
	  WebElement program=driver.findElement(By.id("menu-item-616"));
	  Actions a=new Actions(driver);
	  a.moveToElement(program).perform();
	  driver.findElement(By.id("menu-item-644")).click();
	  boolean title=driver.getCurrentUrl().equals("https://westfloridaahec.org/job-openings/");
	  Assert.assertTrue(title);
	  System.out.println("\"Work With Us\" page is working");
	  test.pass("Success");
  }
  
  //Checking if "History of AHEC" page is working 
  @Test(priority=14)
  public void history() {
	  test = extent.createTest("History");
	  WebElement program=driver.findElement(By.id("menu-item-616"));
	  Actions a=new Actions(driver);
	  a.moveToElement(program).perform();
	  driver.findElement(By.id("menu-item-571")).click();
	  boolean title=driver.getCurrentUrl().equals("https://westfloridaahec.org/history-of-ahec/");
	  Assert.assertTrue(title);
	  System.out.println("\"History of AHEC\" page is working");
	  test.pass("Success");
  }
  
  // Services Page
  //Checking if "Community Based Student Education and Training" page is working 
  @Test(priority=15)
  public void community() {
	  test = extent.createTest("Community");
	  WebElement program=driver.findElement(By.id("menu-item-331"));
	  Actions a=new Actions(driver);
	  a.moveToElement(program).perform();
	  driver.findElement(By.id("menu-item-440")).click();
	  boolean title=driver.getCurrentUrl().equals("https://westfloridaahec.org/community-based-student-education-and-training/");
	  Assert.assertTrue(title);
	  System.out.println("\"Community Based Student Education and Training\" page is working");
	  test.pass("Success");
  }
  
  //Checking if "Continuing Education Services" page is working  
  @Test(priority=16)
  public void education() {
	  test = extent.createTest("Education");
	  WebElement program=driver.findElement(By.id("menu-item-331"));
	  Actions a=new Actions(driver);
	  a.moveToElement(program).perform();
	  driver.findElement(By.id("menu-item-330")).click();
	  boolean title=driver.getCurrentUrl().equals("https://westfloridaahec.org/continuing-education-services/");
	  Assert.assertTrue(title);
	  System.out.println("\"Continuing Education Services\" page is working");
	  test.pass("Success");
  }
  
  // CPR Page
  //Checking if "Shop" page is working  
  @Test(priority=17)
  public void shop() {
	  test = extent.createTest("Shop");
	  WebElement program=driver.findElement(By.id("menu-item-467"));
	  Actions a=new Actions(driver);
	  a.moveToElement(program).perform();
	  driver.findElement(By.id("menu-item-693")).click();
	  boolean title=driver.getCurrentUrl().equals("https://westfloridaahec.org/shop/");
	  Assert.assertTrue(title);
	  System.out.println("\"Shop\" page is working");
	  test.pass("Success");
  }
  
  //Checking if "Books" page is working
  /*@Test(priority=18)
  public void books() {
	  WebElement program=driver.findElement(By.xpath("//*[@id=\"menu-item-467\"]/a/span[1]"));
	  Actions a=new Actions(driver);
	  a.moveToElement(program).perform();
	  driver.findElement(By.xpath("//span[@data-userway-s6-styled='true' and text()='Books']")).click();
	  boolean title=driver.getCurrentUrl().equals("https://westfloridaahec.org/product-category/books/");
	  Assert.assertTrue(title);
	  System.out.println("\"Books\" page is working");
  }*/
  
  //Checking if "Cards" page is working
  @Test(priority=19)
  public void cards() {
	  test = extent.createTest("Cards");
	  WebElement program=driver.findElement(By.id("menu-item-467"));
	  Actions a=new Actions(driver);
	  a.moveToElement(program).perform();
	  driver.findElement(By.id("menu-item-695")).click();
	  boolean title=driver.getCurrentUrl().equals("https://westfloridaahec.org/product-category/cards/");
	  Assert.assertTrue(title);
	  System.out.println("\"Cards\" page is working");
	  test.pass("Success");
  }
  
  //Checking if "Rentals" page is working
  @Test(priority=20)
  public void rentals() {
	  test = extent.createTest("Rentals");
	  WebElement program=driver.findElement(By.id("menu-item-467"));
	  Actions a=new Actions(driver);
	  a.moveToElement(program).perform();
	  driver.findElement(By.id("menu-item-696")).click();
	  boolean title=driver.getCurrentUrl().equals("https://westfloridaahec.org/product-category/rentals/");
	  Assert.assertTrue(title);
	  System.out.println("\"Rentals\" page is working");
	  test.pass("Success");
  }
  
  
  //Checking if "CPR Classes" page is working
  @Test(priority=21)
  public void cprClasses() {
	  test = extent.createTest("CPR Classes");
	  WebElement program=driver.findElement(By.id("menu-item-467"));
	  Actions a=new Actions(driver);
	  a.moveToElement(program).perform();
	  driver.findElement(By.id("menu-item-747")).click();
	  boolean title=driver.getCurrentUrl().equals("https://westfloridaahec.org/cpr-classes/");
	  Assert.assertTrue(title);
	  System.out.println("\"CPR Classes\" page is working");
	  test.pass("Success");
  }
 
  // Programs Page
  //Checking if "Tobacco" page is working
  @Test(priority=22)
  public void tobaccoProgram() {
	  test = extent.createTest("Tobacco");
	  WebElement program=driver.findElement(By.id("menu-item-264"));
	  Actions a=new Actions(driver);
	  a.moveToElement(program).perform();
	  driver.findElement(By.id("menu-item-344")).click();
	  boolean title=driver.getCurrentUrl().equals("https://westfloridaahec.org/tobacco/");
	  Assert.assertTrue(title);
	  System.out.println("\"Tobacco\" page is working");
	  test.pass("Success");
  }
  
  //Checking if "AHEC Scholars" page is working
  @Test(priority=23)
  public void scholarsProgram() {
	  test = extent.createTest("AHEC");
	  WebElement program=driver.findElement(By.id("menu-item-264"));
	  Actions a=new Actions(driver);
	  a.moveToElement(program).perform();
	  driver.findElement(By.id("menu-item-280")).click();
	  boolean title=driver.getCurrentUrl().equals("https://westfloridaahec.org/ahec-scholars/");
	  Assert.assertTrue(title);
	  System.out.println("\"AHEC Scholars\" page is working");
	  test.pass("Success");
  }
  
  //Checking if "Healthy Aging" page is working
  @Test(priority=24)
  public void healthyAgingProgram() {
	  test = extent.createTest("Healthy Aging");
	  WebElement program=driver.findElement(By.id("menu-item-264"));
	  Actions a=new Actions(driver);
	  a.moveToElement(program).perform();
	  driver.findElement(By.id("menu-item-534")).click();
	  boolean title=driver.getCurrentUrl().equals("https://westfloridaahec.org/healthy-aging/");
	  Assert.assertTrue(title);
	  System.out.println("\"Healthy Aging\" page is working");
	  test.pass("Success");
  }
  
  //Checking if "Covering Florida" page is working
  @Test(priority=25)
  public void coveringFloridaProgram() {
	  test = extent.createTest("Covering Florida");
	  WebElement program=driver.findElement(By.id("menu-item-264"));
	  Actions a=new Actions(driver);
	  a.moveToElement(program).perform();
	  driver.findElement(By.id("menu-item-1572")).click();
	  boolean title=driver.getCurrentUrl().equals("https://westfloridaahec.org/navigators/");
	  Assert.assertTrue(title);
	  System.out.println("\"Covering Florida\" page is working");
	  test.pass("Success");
  }
  
  // Contact Us Page
  //Checking if "Contact Us" page is working
  @Test(priority=26)
  public void contactUsPage() {
	  test = extent.createTest("Contact Us");
	  driver.findElement(By.cssSelector("li#menu-item-209")).click();
	  boolean title=driver.getCurrentUrl().equals("https://westfloridaahec.org/contact-us/");
	  Assert.assertTrue(title);
	  System.out.println("\"Contact Us\" page is working");
	  test.pass("Success");
  }

  // Search Bar Functionality
  //Checking if "Search box" is working
  @Test(priority=27)
  public void searchBar() {
	  test = extent.createTest("Search Bar");
	  driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[1]/div[3]/div[1]/div/div/div/div/form/div/div[1]/label/input")).sendKeys("Tobacco");
	  driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[1]/div[3]/div[1]/div/div/div/div/form/div/div[2]/input")).click();
	  String input=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[1]/div[3]/div[1]/div/div/div/div/form/div/div[1]/label/input")).getAttribute("value");
	  System.out.println("Input in textbox is: "+input);
	  String value=driver.findElement(By.xpath("//*[@id=\"posts-container\"]/div[1]")).getText();
	  Boolean contains=value.contains("Tobacco");
	  Assert.assertTrue(contains);
	  System.out.println("Searched keyword is present in the searchbox");
	  test.pass("Success");
  }
  
  // Registration
  //Checking if "Registration" is working
  @Test(priority=28)
  public void registration() {
	  test = extent.createTest("Registration");
	  driver.findElement(By.xpath("//*[@id=\"menu-main-menu\"]/li[8]/a")).click();
	  
	  driver.findElement(By.id("reg_username")).sendKeys("Vishw51a");
	  driver.findElement(By.id("reg_email")).sendKeys("viswa253456@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).sendKeys("Byutu@27801");
	  String username= driver.findElement(By.id("reg_username")).getAttribute("value");
	  String mail=driver.findElement(By.id("reg_email")).getAttribute("value");
	  String pass=driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).getAttribute("value");
	  System.out.println("Username : "+username+"   Mail : "+mail+"  Password : "+pass);
	  driver.findElement(By.cssSelector("button[value='Register'")).click();	
	  test.pass("Success");
  }
   
  @BeforeMethod
  public void beforeMethod() {
	  Boolean URL=driver.getCurrentUrl().equals("https://westfloridaahec.org/");
	  if(URL==false) {
		  driver.navigate().to("https://westfloridaahec.org/");
	  }
  }
	  
  @BeforeClass
  public void beforeClass() {
	  extent = ExtentManager.getInstance(); // Initialize ExtentReports
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://westfloridaahec.org/");
  }
  
  //Cross Browser Testing
  
  /*@BeforeClass
	 @Parameters("browser")
	 public void setUp(String browser) {
		 switch (browser) {
	     	case "chrome":
	     		WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
	            break;
	        case "edge":
	        	WebDriverManager.edgedriver().setup();
	            driver = new EdgeDriver();
	            break;
	        default:
	           throw new IllegalArgumentException("Invalid browser: " + browser);
		 }
		 driver.get("https://westfloridaahec.org/");
	 }*/


  @AfterClass
  public void afterClass() {
	  driver.quit();
	  extent.flush();
  }

}
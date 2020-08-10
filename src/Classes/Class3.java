package Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mujeeb\\Downloads\\chromedriver\\chromedriver.exe");
		//@SuppressWarnings("unused")
		WebDriver driver = new ChromeDriver();
		driver.get("https://personal.digicoffer.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		/*driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[3]/a")).click();
		if(driver.findElement(By.name("first_name")).isDisplayed()) {
		System.out.println("first name element is present");
			driver.findElement(By.name("first_name")).sendKeys("mazahar");
		
		}
		else {
			
			System.out.println("first nameelement is not present ");
			}
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		if(driver.findElement(By.name("last_name")).isDisplayed()) {
			System.out.println("last name element is present");
		 driver.findElement(By.name("last_name")).sendKeys("mujeeb");
	
		}
		else {
			System.out.println("last name element is not present");
		}
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		if(driver.findElement(By.id("id_country")).isDisplayed()){
			System.out.println("choose country box is present");
			driver.findElement(By.id("id_country")).sendKeys("India");
		}
		else {
			System.out.println("choose country  box is not present");
		}
		if(driver.findElement(By.name("email")).isDisplayed()){
			System.out.println("email element should be present");
			driver.findElement(By.name("email")).sendKeys("mujeebuddowla@gmail.com");
		}
		
		else {
			System.out.println("email element is not present");
		}
		if(driver.findElement(By.id("id_password")).isDisplayed()){
			System.out.println("password element should be present");
			driver.findElement(By.id("id_password")).sendKeys("mujju8688");
		}
		else {
			System.out.println("password element is not present");
		}
		if(driver.findElement(By.name("confirm_password")).isDisplayed()){
			System.out.println(" confirm password element should be present");
			driver.findElement(By.name("confirm_password")).sendKeys("mujju8688");
	}
		else 
		{
			System.out.println("confirm password element is not present");
		}
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		if(driver.findElement(By.xpath("//*[@id=\"content-main\"]/div/div/form/div[11]/button")).isDisplayed()) {
			System.out.println("sign up elemnent is present ");
			driver.findElement(By.xpath("//*[@id=\"content-main\"]/div/div/form/div[11]/button")).click();
			System.out.println("clicked on the sign up element");
		}
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);*/
		driver.navigate().back();
		driver.findElement(By.linkText("Sign In")).click();
		driver.manage().timeouts().implicitlyWait(9000,TimeUnit.SECONDS);
	if(driver.findElement(By.xpath("//*[@id=\"mobile_input\"]/input")).isDisplayed()) {
		System.out.println("email field should be presnt in sign in page");
		driver.findElement(By.xpath("//*[@id=\"mobile_input\"]/input")).sendKeys("mujeebuddowla@gmail.com");
	}
	else {
		System.out.println("email field is not  presnt in sign in page");
	}
	
	if(driver.findElement(By.xpath("//*[@id=\"content-main\"]/div/div/form/div[5]/input")).isDisplayed()) {
		System.out.println("password field should be present in sign in page");
		driver.findElement(By.xpath("//*[@id=\"content-main\"]/div/div/form/div[5]/input")).sendKeys("mujju8688");
	}
	else {
		System.out.println("password field is not present in sign in page");
	}
	if(driver.findElement(By.className("signBtn")).isDisplayed()) {
		System.out.println("click on the login button");
		driver.findElement(By.className("signBtn")).click();
	
	}
	else {
		System.out.println("login button not present");
	}
	if(driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[3]/a")).isDisplayed()) {
		System.out.println("my digital documents element is present");
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[3]/a")).click();
		}
	else {
		System.out.println("my digital documents element is not present");
	}
	if(driver.findElement(By.xpath("/html/body/app-root/app-docs/app-identity/div/div/div/div[1]/div[4]/div/button")).isDisplayed()) {
		System.out.println("clicked on the upload document");
		driver.findElement(By.xpath("/html/body/app-root/app-docs/app-identity/div/div/div/div[1]/div[4]/div/button")).click();
		
	}
	else {
		System.out.println("could not be clicked on the upload document");
	}
	/*if(driver.findElement(By.xpath("/html/body/app-root/app-docs/app-identity/div/div/app-identity-upload/div[2]/div/div/div[2]/form/div[1]/select/option[2]")).isDisplayed()) {
		System.out.println("clicked on the select option ");
		driver.findElement(By.xpath("/html/body/app-root/app-docs/app-identity/div/div/app-identity-upload/div[2]/div/div/div[2]/form/div[1]/select/option[2]")).click();
		
	}
	else {
		System.out.println(" select is not displayed");
	}*/
	
	System.out.println("Reached Pop Up");
	Thread.sleep(10000);
	System.out.println("Syed Mustaq");
	//driver.findElement(By.xpath("/html/body/app-root/app-docs/app-identity/div/div/app-identity-upload/div[2]/div/div/div[2]/form/div[1]/select")).click();
	WebElement testDropDown = driver.findElement(By.xpath("/html/body/app-root/app-docs/app-identity/div/div/app-identity-upload/div[2]/div/div/div[2]/form/div[1]/select"));
	testDropDown.click();
	Thread.sleep(5000);
//	JavascriptExecutor executor = (JavascriptExecutor)driver;
//	executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@class='form-control ng-pristine ng-invalid ng-touched']")));
	
	Select dropdown = new Select(testDropDown);
	dropdown.selectByValue("aadhar"); 
	Thread.sleep(10000);
	
	//Select dropdown =new Select(driver.findElement(By.name("aadhar")));
  // h dropdown.selectByVisibleText("aadhar");*/
	if(driver.findElement(By.xpath("/html/body/app-root/app-docs/app-identity/div/div/app-identity-upload/div[2]/div/div/div[2]/form/div[2]/input")).isDisplayed()) {
		System.out.println("document id element is displayed");
		driver.findElement(By.xpath("/html/body/app-root/app-docs/app-identity/div/div/app-identity-upload/div[2]/div/div/div[2]/form/div[2]/input")).sendKeys("1234");
	}
	else {
		System.out.println("document id element is not displayed");
	}

//	if(driver.findElement(By.xpath("/html/body/app-root/app-docs/app-identity/div/div/app-identity-upload/div[2]/div/div/div[2]/form/div[3]/input")).isDisplayed()) {
//	 System.out.println("click on choosen file");
//	 driver.findElement(By.xpath("/html/body/app-root/app-docs/app-identity/div/div/app-identity-upload/div[2]/div/div/div[2]/form/div[3]/input")).click();
//	}
//	else {
//		System.out.println("not clicked");
//	}
	

	
	/*if(driver.findElement(By.xpath("/html/body/app-root/app-docs/app-identity/div/div/app-identity-upload/div[2]/div/div/div[2]/form/div[3]/input")).isDisplayed()) {
	 System.out.println("click on choosen file");
	 driver.findElement(By.xpath("/html/body/app-root/app-docs/app-identity/div/div/app-identity-upload/div[2]/div/div/div[2]/form/div[3]/input")).click();
	}
	else {
		System.out.println("not clicked");
	}*/
	}
	
}

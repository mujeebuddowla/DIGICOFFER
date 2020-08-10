package Classes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Digicoffer {

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
		//driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a")).click();
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
	if(driver.findElement(By.xpath("/html/body/app-root/app-docs/div/div/div/ul/li[2]/a")).isDisplayed()) {
		System.out.println("clicked on the personal document");
		driver.findElement(By.xpath("/html/body/app-root/app-docs/div/div/div/ul/li[2]/a")).click();
		
	}
	else {
		System.out.println("could not be clicked on the personal document");
	}
	if(driver.findElement(By.xpath("/html/body/app-root/app-docs/app-personal/div/div/div/div[1]/div[4]/div/button")).isDisplayed()) {
		System.out.println("clicked on the upload Document element");
		driver.findElement(By.xpath("/html/body/app-root/app-docs/app-personal/div/div/div/div[1]/div[4]/div/button")).click();
	}
	else {
		System.out.println("upload document element is not present ");
	}
	
	if(driver.findElement(By.xpath("/html/body/app-root/app-docs/app-personal/div/div/app-upload/div[2]/div/div/div[2]/form/div[1]/div/input")).isDisplayed()) {
		System.out.println("clicked on the Document name");
		driver.findElement(By.xpath("/html/body/app-root/app-docs/app-personal/div/div/app-upload/div[2]/div/div/div[2]/form/div[1]/div/input")).sendKeys("licience");
	}
	else {
		System.out.println("document name element is not present ");
	}
	if(driver.findElement(By.xpath("/html/body/app-root/app-docs/app-personal/div/div/app-upload/div[2]/div/div/div[2]/form/div[2]/div/textarea")).isDisplayed()) {
		System.out.println("text filled in Descprition");
		driver.findElement(By.xpath("/html/body/app-root/app-docs/app-personal/div/div/app-upload/div[2]/div/div/div[2]/form/div[2]/div/textarea")).sendKeys("my driving licienece");
	}
	else {
		System.out.println("Descprition field is not visible");
	}
	
		driver.findElement(By.xpath("/html/body/app-root/app-docs/app-personal/div/div/app-upload/div[2]/div/div/div[2]/form/div[4]/div/input")).click();
		
		{
			System.out.println("clicked on the choosen file");
		}
	if(driver.findElement(By.className("btn btn-primary")).isDisplayed()) {
      System.out.println("clicked on the submit button");
      driver.findElement(By.className("btn btn-primary")).click();
	}
	else {
		System.out.println("not clicked");
	}
	
	}
}
	
	
	
	
	

		
	


package Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class class1 {

//	public static void main(String[] args) throws InterruptedException {





@Test
public void Test2() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mujeeb\\Downloads\\chromedriver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	//
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.navigate().to("https://staging-internqa-blinkerfluid.armentum.co/");
	if(driver.findElement(By.className("nav-link active")).isDisplayed()) {
		driver.findElement(By.className("nav-link active")).click();
		System.out.println("clicked on the subscribe button");
	}
	else 
	{
		System.out.println("not visible");
	}
	
	if(driver.findElement(By.className("img-fluid")).isDisplayed()){
		System.out.println("Header Blinkers fluid image is displayed");
	}
	else {
		System.out.println("not displayyed");
	}
	if(driver.findElement(By.xpath("/html/body/footer/div/div/div/div[1]/div/div[2]/div[1]/h6")).isDisplayed())
	{
	     System.out.println("Link element in footer should be displayed in the subscribe module");
	}
	
	else
	{
		System.out.println("link elemnet is not displayed");
	}
	
	if(driver.findElement(By.xpath("//*[@id=\"follow\"]/div/div/div/div[1]/div/div[2]/div[2]/h6")).isDisplayed())
	{
	System.out.println("contact info element in footer should be displayyed in the subscribe module");
	}
	else 
	{
		System.out.println("contact info elemnt is not present");
	}
	if(driver.findElement(By.xpath("//*[@id=\"menu-footer-menu-2\"]/li[1]/a")).isDisplayed()) 
	{
           driver.findElement(By.xpath("//*[@id=\"menu-footer-menu-2\"]/li[1]/a")).click();
           System.out.println("clicked on the footer shop icon");
	}
	else
	{
	System.out.println("shop iconis not displayed");	
	}

}

}	
	

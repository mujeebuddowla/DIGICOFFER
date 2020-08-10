package Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Class2 {
	WebDriver driver;
	@Test
	public void test1() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mujeeb\\Downloads\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://staging-internqa-blinkerfluid.armentum.co/");

		driver.findElement(By.xpath("//*[@id=\"menu-item-29\"]/a")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		System.out.println("click on the login button");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		boolean b = driver.findElement(By.xpath("//*[@id=\"registerModal\"]/div/div/div/div/div[2]/button/span")).isDisplayed();
		if (b==true)
		{
			System.out.println("cancel button should be displayed");
		}
		System.out.println("cancel button should be displayed");
		boolean c=driver.findElement(By.xpath("//*[@id='loginModal']/div/div/div/div/div[1]/img")).isDisplayed();
		if (c==true) {
		
		}
		System.out.println("image is displayed");
		driver.findElement(By.xpath("//*[@id='account']")).click();



		driver.findElement(By.id("fname")).sendKeys("123");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//{
			
			//driver.findElement( By.id("fname")).sendKeys("1234");
			driver.findElement(By.id("register_form_btn")).click();
			 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			String name =driver.findElement(By.id("email-error")).getText();
			Assert.assertEquals(name, "this field is required");
			if(name == "this field is required")
			{
				System.out.println("this field is required");
			}
			else {
				System.out.println("invalid email");
			}
		    String name1=driver.findElement(By.id("password-error")).getText();
		    Assert.assertEquals(name1, " this field is required");
		    if(name1 == "this field is required")
			{
				System.out.println("this field is required");
			}
			else
			{
				System.out.println("invalid password");
			}
		    String name3=driver.findElement(By.id("fname-error")).getText();
		    Assert.assertEquals(name3, "Please enter only characters");
		    if(name3 == "this field is required")
			{
				System.out.println("Please enter only characters");
			}
			else
			{
				System.out.println("invalid characters");
			}
		 
	
	

	//@Test
	//public void test2() throws InterruptedException {
		// driver = new ChromeDriver();
		 //driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.get("https://staging-internqa-blinkerfluid.armentum.co/");

			//driver.findElement(By.xpath("//*[@id=\"menu-item-29\"]/a")).click();
			//Thread.sleep(3000);
			//{
			//System.out.println("click on the login button");
			//}
			//driver.findElement(By.xpath("//*[@id=\"account\"]")).click();



			//driver.findElement(By.id("fname")).sendKeys("123");
			//Thread.sleep(3000);
	driver.findElement(By.id("fname")).clear();
	driver.findElement(By.id("email")).sendKeys("mujeebuddowla@");
	driver.findElement(By.id("register_form_btn")).click();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	String name10=driver.findElement(By.id("password-error")).getText();
	Assert.assertEquals(name10, "this field is required");
	if(name10=="this field is required")
	{
		System.out.println("this field is required");
	}
	else {
		System.out.println("invaid password");
	}
	String name11=driver.findElement(By.id("fname-error")).getText();
	Assert.assertEquals(name11, "this field is required");
	if(name11=="this field is required")
	{
		System.out.println("this field is required");
	}
	else {
		System.out.println("invaid password");
	}
	String name12=driver.findElement(By.id("email-error")).getText();
	Assert.assertEquals(name12, "Please enter a valid email address");
	if(name12=="Please enter a valid email address")
	{
		System.out.println("this field is required");
	}
	else {
		System.out.println("invaid email");
	}
	driver.close();
}
	

	
	//@Test
	//public void test3() throws InterruptedException {
		//driver = new ChromeDriver();
		 //driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.get("https://staging-internqa-blinkerfluid.armentum.co/");

			//driver.findElement(By.xpath("//*[@id=\"menu-item-29\"]/a")).click();
			//Thread.sleep(3000);
			//{
			//System.out.println("click on the login button");
			//}
			//driver.findElement(By.xpath("//*[@id=\"account\"]")).click();
			//driver.findElement(By.id("email")).sendKeys("mujeebuddowla@");

		//driver.findElement(By.id("email")).clear();
		//driver.findElement(By.id("password")).sendKeys("mujju868");
		//driver.findElement(By.id("register_form_btn")).click();
	//Thread.sleep(2000);
	//String name=driver.findElement(By.id("fname-error")).getText();
	//Assert.assertEquals(name, "this field is required");
	//String mujju=driver.findElement(By.id("fname-error")).getText();
	//Assert.assertEquals(mujju, "Please enter a valid email address.");
	//String mujeeb=driver.findElement(By.id("password-error")).getText();
	//Assert.assertEquals(mujeeb, "Your password must be at least 8 characters long");
	//driver.close();
	
	//}
}





	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
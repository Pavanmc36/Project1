package filter_option;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; 
import org.testng.annotations.AfterTest; 
import org.testng.annotations.BeforeTest; 
import org.testng.annotations.Test; 

public class Filters {
	
	
	public static WebDriver driver;

	@BeforeTest
	
	public void setUp() throws InterruptedException{ 

		System.setProperty("webdriver.chrome.driver", "D:\\Software Setup\\chromedriver_win32 (1)\\chromedriver.exe");

	     driver = new ChromeDriver(); 

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.swiggy.com/search"); 
        driver.manage().window().maximize();
		Thread.sleep(2000); 
		System.out.println("SetUp Successful !!"); 
	
}
	
	@Test
	
	public void filterTest() throws InterruptedException {
		
		driver.findElement(By.className("_1fiQt")).click();
		Thread.sleep(10000);
		
		WebElement Test1 = driver.findElement(By.cssSelector("div._3arMG div.nDVxx div._3kbpE div._29kDH._3pFoM:nth-child(5) div._1LV_f.undefined div._10p2- div.k4axS div._19Aso div._2LB31 div._3IrNP div._3Ynv- div._2-ofZ:nth-child(7) > span.h0xOG"));
		Test1.click();
		System.out.println("Website allows using of filter option before searching");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("body.overlay-enabled:nth-child(2) div._3vi_e div._12S7_ div:nth-child(1) div:nth-child(2) div._1L8WG > span.SSFcO.icon-close")).click();
		Thread.sleep(2000);
		
		
		Test1.click();
		System.out.println("All the Filter Options are opened");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[contains(text(), 'Afghani')]")).click();
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[contains(text(), 'American')]")).click();
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[contains(text(), 'Barbecue')]")).click();
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[contains(text(), 'Burgers')]")).click();
		Thread.sleep(1000);
		
		System.out.println("Filter option allows to filter the user requirements in it");
		
		driver.findElement(By.className("LIBH0")).click();
		Thread.sleep(1000);
		
		System.out.println("Results displayed with applied filters on the page");
		
		
		driver.findElement(By.className("_6Wb2O")).click();
		Thread.sleep(2000);
		
		System.out.println("Selected filter is saved , User can edit or clear the selected filter options");
		
		
		
	}
	
	@AfterTest 
	public void tearDown(){ 

	driver.quit(); 

	} 
}
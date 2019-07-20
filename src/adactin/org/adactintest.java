package adactin.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class adactintest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\mohan\\adactin\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.adactin.com/HotelApp/");

		driver.findElement(By.id("username")).sendKeys("Mohan1234");

		driver.findElement(By.id("password")).sendKeys("Mohan@1234");

		driver.findElement(By.id("login")).click();

		WebElement loc = driver.findElement(By.id("location"));

		Select s = new Select(loc);
		s.selectByValue("London");

		WebElement h = driver.findElement(By.id("hotels"));

		Select ho = new Select(h);

		ho.selectByValue("Hotel creek");
		
		WebElement r = driver.findElement(By.id("room_type"));
		
		Select ro = new Select(r);
		
		ro.selectByValue("Standard");
		
		System.out.println();
		int a = 10;
		int b = 20;
		System.out.println(a + b);
		
	
	}

}

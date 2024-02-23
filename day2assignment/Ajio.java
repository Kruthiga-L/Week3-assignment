package week3.day2assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		
		//search 
		driver.findElement(By.xpath("//input[@aria-label='Search Ajio']")).sendKeys("bags",Keys.ENTER);
		
		//filter by men
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(3000);
		
		//filter by category
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		Thread.sleep(3000);
		
		//no of items found
		String text = driver.findElement(By.xpath("//div[@id='products']/div[3]//strong")).getText();
		System.out.println("No of items found: "+text);
		
		//LIST OF BRAND NAME
		System.out.println("BRAND NAME:");
		List<WebElement> brand= driver.findElements(By.className("brand"));
		for (WebElement i : brand) {
			String b=i.getText();
			System.out.println(b);
			
		}
		
		// list of names of the bags
		System.out.println("Names of the bags: ");
		List<WebElement> brandName=driver.findElements(By.className("nameCls"));
		for (WebElement j : brandName) {
			String bn=j.getText();
			System.out.println(bn);
		}
	}

}

package org.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;

public class contactsPage {

	public WebDriver driver;

	public void launchPresidioWebsite() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		/* Accept Cookies button */
		driver.get("https://www.presidio.com/");
		WebElement acceptAllButton = driver.findElement(By.xpath(
				"//a[@id='wt-cli-accept-all-btn' and contains(@class, 'wt-cli-accept-all-btn') and contains(text(), 'Accept All')]"));
		acceptAllButton.click();
		driver.quit();

	}

	/* Page Details */
	public void pageURL() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.presidio.com/");
		WebElement acceptAllButton = driver1.findElement(By.xpath(
				"//a[@id='wt-cli-accept-all-btn' and contains(@class, 'wt-cli-accept-all-btn') and contains(text(), 'Accept All')]"));
		acceptAllButton.click();
		String pagetitle = driver1.getTitle();
		System.out.println("The Page Title is" + pagetitle);
		String currentURL = driver1.getCurrentUrl();
		System.out.println("Page current URL" + currentURL);
		driver1.quit();
	}

	/* Page Scroll Up/Down*/
	public void check_page_scroll_down() throws InterruptedException {
		System.out.println("Scroll Page Down");
		WebDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://www.presidio.com/");
		WebElement acceptAllButton = driver2.findElement(By.xpath(
				"//a[@id='wt-cli-accept-all-btn' and contains(@class, 'wt-cli-accept-all-btn') and contains(text(), 'Accept All')]"));
		acceptAllButton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver2;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-2000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-3000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-1000)");
		driver2.quit();
	}
	
	public void demoWebsitePractice() throws InterruptedException {
		System.out.println("Demo Website for UI Automation");
		WebDriver driver3 = new ChromeDriver();
		driver3.manage().window().maximize();
		driver3.get("https://www.way2automation.com/way2auto_jquery/");
		Thread.sleep(4000);
		WebElement entername = driver3.findElement(By.xpath("//input[@name='name']"));
		entername.sendKeys("Aishwarya Kamaraj");
		WebElement enterphone = driver3.findElement(By.xpath("//input[@name='phone']"));
		enterphone.sendKeys("+91-1112233445566");
		WebElement enteremail = driver3.findElement(By.xpath("//input[@name='email']"));
		enteremail.sendKeys("xyz@gmail.com");
		WebElement entercity = driver3.findElement(By.xpath("//input[@name='city']"));
		entercity.sendKeys("Chennai");
		WebElement enterusername = driver3.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input"));
		enterusername.sendKeys("Aishu");
		WebElement enterpassword = driver3.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[7]/input"));
		enterpassword.sendKeys("Maha@2020");
		WebElement selectcountry = driver3.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[4]/select/option[82]"));
		selectcountry.click();
		WebElement submitbutton = driver3.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]"));
		submitbutton.click();
		Thread.sleep(3000);
		driver3.quit();
	}

}

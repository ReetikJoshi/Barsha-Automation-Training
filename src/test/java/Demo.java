import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/test/resources/Drivers/chromedriver.exe");

		// make driver object for using selenium code
		WebDriver driver = new ChromeDriver();
		// open chrome browser and go to google.com
		driver.get("https://google.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		// search "abcde" text
//		cy.get(cssSelector).type("abcde");

		// ID
		// ClassName
		WebElement searchField = driver.findElement(By.className("gLFyf"));
		searchField.sendKeys("abcde");
		searchField.sendKeys(Keys.ENTER);
		// cssSelector
//		driver.findElement(By.cssSelector(".gLFyf.gsfi"));
		// XPath
//		driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
		// LinkText
		// Name
//		driver.findElement(By.name("q"));
		// ID, className, LinkText, cssSelector, Xpath,
	}

	//click
	//type
	//radio box
	//dropdown select
	//checkbox
	//drag and drop
	
}

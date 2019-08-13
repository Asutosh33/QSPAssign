import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sc1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}

	@Test
	public static void M1() throws InterruptedException

	{

		WebDriver driver = new ChromeDriver();// casting
		driver.manage().window().maximize();// maximize the browser window

		driver.navigate().to(
				"https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.id("identifierId")).sendKeys("dhamanasapa18@gmail.com");// we can pass the value directly

		WebElement next = driver.findElement(By.id("identifierNext"));
		next.click();
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("madaautkde");
		driver.findElement(By.id("passwordNext")).click();
		;

		Thread.sleep(2000);

		List<WebElement> ele = driver.findElements(By.xpath("//tbody/tr[@jsmodel='nXDxbd']"));
		System.out.println("No. of mails: " + ele.size());

		int i = 1;
		List<WebElement> ele2 = driver.findElements(
				By.xpath("//tbody/tr[@jscontroller='ZdOxDb'][" + i + "]/td/div[@class='yW']/child::*/child::*"));
		for (WebElement sender : ele2) {
			System.out.println("Subject of the mail is: " + sender.getText());
		}
		List<WebElement> ele3 = driver.findElements(By.xpath("//tbody/tr[@jscontroller='ZdOxDb'][" + i
				+ "]/td[@tabindex='-1']//div[@class='y6']/child::*/child::*"));
		for (WebElement subject : ele3) {
			System.out.println("Subject of the mail is: " + subject.getText());
		}
	}
}

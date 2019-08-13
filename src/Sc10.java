import java.util.List;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Sc10 {
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}

	@Test
	public static void M10()throws InterruptedException, AWTException

	{

		WebDriver driver = new ChromeDriver();// casting
		driver.manage().window().maximize();// maximize the browser window
		Actions a = new Actions(driver);
		driver.navigate().to("https://www.bluestone.com/");
		Thread.sleep(2000);
		WebDriverWait ww = new WebDriverWait(driver, 30);
		WebElement ele = driver.findElement(By.xpath("//div[@class='lc-8w4vj8 eqd5v0k2']/p"));
		a.click(ele);
		driver.switchTo().frame(ele);

		if (ww.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[@class='lc-8w4vj8 eqd5v0k2']/p"))) != null) {

		}

		Thread.sleep(5000);

	}
}

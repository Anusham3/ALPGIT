package discussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import generic.WebdriverUtils;

public class Main1 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
	}
static WebDriver driver=null;
	public static void main(String[] args) {
		int x=3;
		int y=2;
		
		WebdriverUtils wb=new WebdriverUtils();
		WebElement element = driver.findElement(By.xpath(""));
		wb.waitElementUntilDisplay(driver, element);
		wb.openBrowser("chromes");
		if(x==2)
			System.out.println("A");
		else if(x==3)
			System.out.println("L");
		
		
		
		
	}

}

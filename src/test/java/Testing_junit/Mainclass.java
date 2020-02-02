package Testing_junit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mainclass extends Baseclass {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kanagaj\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement f1=driver.findElement(By.id("email"));
		f1.sendKeys(getdata(0,0));
		WebElement f2=driver.findElement(By.id("pass"));
		f2.sendKeys(getdata(0,1));
		WebElement f3=driver.findElement(By.id("loginbutton"));
		f3.click();
		System.out.println("Excel integration successfully done");
	}
	
		
	

}

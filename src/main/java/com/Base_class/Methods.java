package com.Base_class;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods {
public static WebDriver driver;
	
	public static WebDriver Setup(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("Invalid driver input");
		}
		return getDriver();
		
	}		
	public static void geturl(String url) {
		try {
		getDriver().get(url);
		}
		catch (Exception e) {
			System.out.println("Invalid URL");
		}
	}
	public void wait(int t) {
		try {
			driver.manage().timeouts().implicitlyWait(+t, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}	
	
	public void actions(WebElement element) {
		Actions mouse=new Actions(getDriver());
		mouse.moveToElement(element).build().perform();
	}
	public static void click(WebElement cli) {
		try {
			cli.click();
		} catch (Exception e) {
			System.out.println("No such Element");
		}
	}
	public void screenshot(String scname) {
		 try {
		TakesScreenshot sc=(TakesScreenshot) getDriver();
		File src = sc.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Gayu\\eclipse-workspace\\Dhanush_maven\\Screenshots\\"+scname+".png");
        FileHandler.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void sendkeys(WebElement element,String value ) {
		element.sendKeys(value);
	}
	public void scroll(String sc) {
		JavascriptExecutor js= (JavascriptExecutor)getDriver();
		js.executeScript("argument[0].scrollIntoView(true);"+sc);
	}
	public void windowhandle(int we) {
		try {
			Set<String> move=getDriver().getWindowHandles();
			List<String> ls=new ArrayList(move);
			getDriver().switchTo().window(ls.get(+we));
		} catch (Exception e) {
			System.out.println("No such window");
		}
		
	}
	
	public void waits(Duration time, By ele ) {
		
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), time);
			wait.until(ExpectedConditions.presenceOfElementLocated(ele));
		} catch (Exception e) {
			System.out.println("No element");
		}  
	}
	public void closemethod() {
		try {
			getDriver().close();
		} catch (Exception e) {
			System.out.println("Browser is not closed");
		}
	}

	public void quitmethod() {
		try {
			getDriver().quit();
		} catch (Exception e) {
			System.out.println("Browser is not Quited");
		}
	}
	public void gettext(WebElement text) {
		try {
			text.getText();
		} catch (Exception e) {
			System.out.println("Text is Not gettable");
		}
	}
	public void getattribute(WebElement text,String s) {
		try {
			text.getAttribute(s);
		} catch (Exception e) {
			System.out.println("Attribute is Not gettable");
		}
	}
	public void navigateto(String nav) {
		try {
			getDriver().navigate().to(nav);
		} catch (Exception e) {
			System.out.println("Invalid Url");
		}
	}
	public void navigatefw() {
		try {
			getDriver().navigate().forward();
		} catch (Exception e) {
			System.out.println("Window is not Present");
		}
	}
	public void navigateback() {
		try {
			getDriver().navigate().back();
		} catch (Exception e) {
			System.out.println("Window is not present");
		}
	}
	public void dropdown(WebElement sel,int index,String val,String vtext ) {
		try {
			Select click=new Select(sel);
			click.selectByIndex(index);			
		} catch (Exception e) {
			System.out.println("");
		}
	}
	public void dropdown(WebElement sel,String val) {
		Select click=new Select(sel); 
		click.selectByValue(val);
		click.selectByVisibleText(val);
	}
	public static WebDriver getDriver() {
		return driver;
	}
}


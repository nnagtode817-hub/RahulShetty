package Test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.baseClass;

public class iframe extends baseClass {
	@Test
	public void iframe() {
		
	
	//switch to iframe
		driver.switchTo().frame("courses-iframe");
		// click courses
		driver.findElement(By.linkText("Courses")).click();
		//switch back to the main page
		driver.switchTo().defaultContent();
		System.out.println("iframes are working");
		
	
	}
}

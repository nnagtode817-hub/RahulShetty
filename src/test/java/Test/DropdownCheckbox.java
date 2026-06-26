package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.baseClass;

public class DropdownCheckbox extends baseClass{
	  
	@Test
	public void drop() {
		WebElement dropp= driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(dropp);
		select.selectByIndex(2);  	
	}
     @Test
     public void check() {
    	 WebElement  checkk = driver.findElement(By.id("checkBoxOption3"));
    	 checkk.click();
     }
     @Test
     public void mouse() {
    	 //locate mouse hover button
     
    	 WebElement hover = driver.findElement(By.id("mousehover")); 
    	 //create action object
    	 Actions action = new Actions(driver);
    	 //perform mouse hover
         action.moveToElement(hover).perform();
         //click on "Top"
         driver.findElement(By.linkText("Top")).click();     	 
     }
 
}
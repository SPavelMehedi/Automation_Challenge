package com.utility;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.usa.base.BasePage;







public class WaitHelper extends BasePage {

	public static void waitForElement(WebElement element, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void waitVisibilityOfAllElements(List<WebElement> element) {
		WebDriverWait waitForFormLabel = new WebDriverWait(driver, 30);
		waitForFormLabel.until(ExpectedConditions.visibilityOfAllElements(element));
	}
	
	
	
	public static void waitPresenceOfAllElementsLocatedBy(By element) {
		WebDriverWait waitForFormLabel = new WebDriverWait(driver, 30);
		waitForFormLabel.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));

	}
}








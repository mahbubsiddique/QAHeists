package com.careerhack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {

	WebDriver driver;

	public PageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElement searchBox;
	// searchBox = driver.findElement(By.name("q"));
	@FindBy(name = "q")
	WebElement searchBox;

	// searchBox.sendKeys(string);
	public void enterSearch(String text) {
		searchBox.sendKeys(text);
	}

	// WebElement searchBtn;
	// searchBtn = driver.findElement(By.name("btnK"));
	@FindBy(name = "btnK")
	WebElement searchBtn;

	// searchBtn.click();
	// searchBtn.submit();

	public void clickSearch() {
		searchBtn.submit();
	}

}

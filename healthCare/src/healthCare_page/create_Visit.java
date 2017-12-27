package healthCare_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class create_Visit {
	

	WebDriver driver;

	public create_Visit(WebDriver driver)
	{
	this. driver = driver;
	}

	By createVisit=By.xpath("//*[@id='container_body']/p[1]/a/input");

	public  WebElement createVisit() {
		
		return driver.findElement(createVisit);
		
		// this just a test 
		

	}	

	}
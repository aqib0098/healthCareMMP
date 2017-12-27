package healthCare_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class patientPage {
WebDriver driver;
	
	public patientPage(WebDriver driver)
	{
		this. driver = driver;
		
	}
	
	By patient=By.xpath("html/body/div[1]/div/div[1]/div/ul/li[5]/a");
	By search_Field=By.id("search");
	By search_Button=By.xpath("//*[@id='tfheader']/input[2]");
	By patient_Link=By.xpath("//*[@id='show']/table/tbody/tr/td[1]/a");

	
	public void patient()
	
	{
	 driver.findElement(patient).click();
		
	}
	public void search_Field()
	
	{
		driver.findElement(search_Field).sendKeys("Patient");
		
	}
	public void search_Button()
	
	{
	 driver.findElement(search_Button).click();
		
	}
	public void patient_Link()

{
	 driver.findElement(patient_Link).click();
	 
}
}
	
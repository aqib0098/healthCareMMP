package healthCare_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
WebDriver driver;
	
	public loginPage(WebDriver driver)
	{
		this. driver = driver;
		
	}
	
	
	By userName=By.id("username");
	By passWord=By.id("password");
	By SignIn=By.xpath("//*[@id='login1']/p[6]/input");
	By patient=By.xpath("html/body/div[1]/div/div[1]/div/ul/li[5]/a");
	By search_Field=By.id("search");
	By search_Button=By.xpath("//*[@id='tfheader']/input[2]");
	By patient_Link=By.xpath("//*[@id='show']/table/tbody/tr/td[1]/a");
	
	
	public void Login (String username, String password)
	
	{
		 driver.findElement(userName).sendKeys(username);
		 driver.findElement(passWord).sendKeys(password);
		 driver.findElement(SignIn).click();
	}

	public WebElement patient()
	
	{
		return driver.findElement(patient);
		
	}
	public WebElement search_Field()
	
	{
		return driver.findElement(search_Field);
		
	}
public WebElement search_Button()
	
	{
		return driver.findElement(search_Button);
		
	}
public WebElement patient_Link()

{
	return driver.findElement(patient_Link);
	
}
	
}

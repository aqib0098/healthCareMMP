package healthCare_page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class add_Prescription {
WebDriver driver;
	
	public add_Prescription(WebDriver driver)
	{
		this. driver = driver;
		
	}

	By addPrescriptionlnk=By.xpath("//*[@id='container_body']/p[2]/a/input");
	By prescriptionName =By.id("exampleInputcardnumber1");
	By prescriptionDescription=By.xpath("html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/form/div[4]/textarea");
	By submit=By.xpath("html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/form/input");
	
	public void addPrescriptionlnk()
	
	{
		driver.findElement(addPrescriptionlnk).click();
		
	}
	public void prescriptionName()
	
	{
		 driver.findElement(prescriptionName).sendKeys("Test");
		
	}
	public void prescriptionDescription()
	
	{
		 driver.findElement(prescriptionDescription).sendKeys("123 test");
	}
	public void submit()
	
	{
		 driver.findElement(submit).click();
		
	}
	
	}

package healthCare_TestCase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import healthCare_page.add_Prescription;


public class add_Prescriptions {

	 protected WebDriver driver;
	
	
	@Test(priority=1)
	public void Add_prescription() throws InterruptedException
	{
		
		add_Prescription click = new add_Prescription(driver);

		// Click on the Add Prescription link
		click.addPrescriptionlnk();
		// Verify the title 
		String Actual = "Prescriptions Details";
		String expected = "Prescriptions Details";
		assertEquals(Actual, expected,"it does not match");
		Thread.sleep(8000);
		// Enter the prescription name	
		click.prescriptionName();
		Thread.sleep(3000);
		click.prescriptionDescription();
		Thread.sleep(4000);
		click.submit();
		// test
		
		
		
		
		
		
		
	}
}
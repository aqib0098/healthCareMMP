package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import healthCare_page.loginPage;
import healthCare_page.patientPage;


public class baseClass {
	
	protected WebDriver driver;
	 String url="http://96.84.175.78/MMP-Release2-Admin-Build.2.1.000/login.php";
	 
	
	@BeforeClass
	public void login_Page() throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Aqib\\Desktop\\geckodriver.exe");
		driver= new FirefoxDriver();
		
		loginPage login = new loginPage(driver);
		patientPage Click = new patientPage (driver);
		
		driver.get(url);
		// Click on the login 
		login.Login("Roger", "Password");
		
		Click.patient();
		Click.search_Field();
		Click.search_Button();
		Click.patient_Link();	
}
	@AfterClass
	public void Quite()
	{
		driver.quit();
	}



}

package MyPackge;

import java.time.Duration;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameters {
	
	WebDriver driver= new ChromeDriver();
	
	String TheDefualtUrl="https://www.almosafer.com/en";
	
	String ExpectedLanaguage ="en";
	
	String ExpectedCurrency= "SAR";
	
	String ExpectedMobileNumber="+966554400000";
	
	boolean ExpectedQitafLogoDispaly= true;
	
	String ExpectedValueForHotelTab="false";
	
	LocalDate date=LocalDate.now();
	
	int Today=date.getDayOfMonth();
	String Tomorrow= Integer.toString(date.plusDays(1).getDayOfMonth());




	public void ConfigurationToAccess() {
		driver.get(TheDefualtUrl);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement SelectSarMessage = driver
				.findElement(By.cssSelector(".sc-jTzLTM.hQpNle.cta__button.cta__saudi.btn.btn-primary"));
		SelectSarMessage.click();
	}
	
	
	
}

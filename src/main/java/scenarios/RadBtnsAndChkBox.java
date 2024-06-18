package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class RadBtnsAndChkBox {

	WebDriver driver;
	@Test
	public void radChkBox() throws InterruptedException
	{
		driver = new EdgeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.findElement(By.id("hondaradio")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("hondaradio")).isSelected());
		boolean chkRadBtn=driver.findElement(By.id("hondaradio")).isSelected();
		if(chkRadBtn==true)
		{
			System.out.println("Selected");
		}
		else
		{
			System.out.println("not Selected");
		}
		driver.findElement(By.id("bmwcheck")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("benzcheck")).click();
		System.out.println(driver.findElement(By.id("bmwcheck")).isSelected());
		System.out.println(driver.findElement(By.id("benzcheck")).isSelected());
		driver.quit();

	}
}

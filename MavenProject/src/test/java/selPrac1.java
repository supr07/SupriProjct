import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class selPrac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arrangement
		System.setProperty("webdriver.chrome.driver","C:\\Supri\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		
		//Action
		
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("!New@123");
		driver.findElement(By.id("#login")).click();
		
		//Assertion	

	}

}

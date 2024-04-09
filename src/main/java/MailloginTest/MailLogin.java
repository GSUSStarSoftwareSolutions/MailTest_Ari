package MailloginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MailLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=ARZ0qKKDCFZBR-XMisBtz6w21C0h31bJh-yNyFXazUnjJdPwi_UFhP2YtaiKCUl3H9hCF2UAiUvO&theme=mn&ddm=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		
		// email pass
		String email = "nhcprabhu2596@gmail.com";
		String pass = "xxxx";
		
		driver.findElement(By.id("identifierId")).sendKeys("nhcprabhu2596@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.id("password")).sendKeys("xxxx");
		driver.findElement(By.id("identifierNext")).click();                                   
		driver.quit();
	}

}

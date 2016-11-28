/*package MyPackage;
 

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 */


package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass {
	 
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
		
     
		driver.get("http://www.google.com");
 
	
		Thread.sleep(5);
		
     
        driver.quit();
    }
}
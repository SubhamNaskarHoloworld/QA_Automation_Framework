package subham;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Childwindows {
    private static Object url;

	public static void main(String[] args) throws InterruptedException {
        // Set the path of the chromedriver executable
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KaayaTech\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to https://www.holoworld.one/
        driver.get("https://www.holoworld.one/");
        Thread.sleep(3000);
        

        public void (" url"); {
            driver.get((String) url);
            checkPageTitle("Expected Page Title");
            checkLinks();
            checkForms();
            driver.quit();
        }
        // Find all the buttons on the page
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        Thread.sleep(3000);
        // Click on each button
        for (WebElement button : buttons) {
            button.click();
            System.out.println("Clicked on button: " + button.getText());
        }

        // Close the browser
        driver.quit();
    }

	private static void checkForms() {
		// TODO Auto-generated method stub
		
	}

	private static void checkLinks() {
		// TODO Auto-generated method stub
		
	}

	private static void checkPageTitle(String string) {
		// TODO Auto-generated method stub
		
	}
}

package subham;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.zaproxy.clientapi.core.ApiResponse;
import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Proxy;
public class ZAPSecurityTest {

	static final String ZAP_PROXY_ADDRESS = "localhost";
	static final int ZAP_PROXY_PORT = 8080;
	static final String ZAP_API_KEY = "8nt3nl407pm7kcav5ksg474lpp";
	
	private WebDriver driver;
	private ClientApi api ;
	
	@BeforeMethod
	public void setup() {
		String proxyServerURL = ZAP_PROXY_ADDRESS + ":" + ZAP_PROXY_PORT;
		
		Proxy proxy = new Proxy();
		proxy.setHttpProxy(proxyServerURL);
		proxy.setSslProxy(proxyServerURL);
		
		ChromeOptions co = new ChromeOptions();
		co.setAcceptInsecureCerts(true);
		co.setProxy(proxy);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		api = new ClientApi(ZAP_PROXY_ADDRESS,ZAP_PROXY_PORT,ZAP_API_KEY);
		
	}
	
	@Test
	public void holoworldSecurityTest() {
		driver.get("http://agrimetaverse.tnau.ac.in/");
		//Assert.assertTrue(driver.getTitle().contains("HoloWorld"));
	}
	
	@AfterMethod
	public void tearDown() {
		if(api !=null) {
			String title ="TNAU ZAP Security Report";
			String template = "traditional-html";
			String description = "This is TNAU zap Security Test Report";
			String reportfilename = "TNAU-zap-report.html";
			String targetFolder = System.getProperty("user.dir");
			
			try {
			ApiResponse response = api.reports.generate(title,template,null,description,null,null,null, null, null,reportfilename, null,targetFolder, null);
			System.out.println("ZAP report generated at this location:"+response.toString());
		}catch (ClientApiException e) {
			e.printStackTrace();
		}
	}
		driver.quit();
}
}

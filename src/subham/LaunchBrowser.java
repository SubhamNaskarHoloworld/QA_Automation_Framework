package subham;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LaunchBrowser {

	public static void main(String[] args)  throws InterruptedException  {
		// TODO Auto-generated method stub

		

		//chrome Browser
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\KaayaTech\\Downloads\\chromedriver_win32\\chromedriver.exe");
				//ChromeDriver driver= new ChromeDriver();
				
				WebDriver driver=new ChromeDriver();

				driver.get("https://holoworld.one/");
				Actions a = new Actions(driver);
				driver.manage().window().maximize();//maximum window 
			
				JavascriptExecutor JS = (JavascriptExecutor)driver;
				
				
				
				
				
				JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
				Thread.sleep(2000);
				JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
				Thread.sleep(2000);

				System.out.println("Title of the WebPage"+driver.getTitle());
				
				System.out.println("Current URL"+driver.getCurrentUrl());
				
				
				
				
				
				
				// verticlesButton
				//Education
				WebElement VerticlesButton= driver.findElement(By.xpath("//a[normalize-space()='Verticals']"));
		
				a.moveToElement(VerticlesButton).perform();
				Thread.sleep(3000);
				
				
				JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
				Thread.sleep(3000);
				
				JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//ul[@class='mani-hr']//li//a[@href='education'][normalize-space()='Education']")).click();
				System.out.println("Title of the WebPage"+driver.getTitle());
				
				//Industry
				WebElement VerticlesButton1= driver.findElement(By.xpath("//a[normalize-space()='Verticals']"));
				a.moveToElement(VerticlesButton1).perform();
				Thread.sleep(3000);
				
				JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
				Thread.sleep(3000);
				JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//a[contains(text(),'Industry')]")).click();
				
				
				//Entertainment
				WebElement VerticlesButton2= driver.findElement(By.xpath("//a[normalize-space()='Verticals']"));
				a.moveToElement(VerticlesButton2).perform();
				Thread.sleep(3000);
				
				JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
				Thread.sleep(3000);
				JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//a[normalize-space()='Entertainment']")).click();
				
				
				//Gaming
		        WebElement VerticlesButton3= driver.findElement(By.xpath("//a[normalize-space()='Verticals']"));
				a.moveToElement(VerticlesButton3).perform();
				Thread.sleep(3000);
				
				JS.executeScript("window.scrollBy(0,4000)", args);
				Thread.sleep(3000);
				JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//a[normalize-space()='Gaming']")).click();
				
				
				//Sports
				 WebElement VerticlesButton4= driver.findElement(By.xpath("//a[normalize-space()='Verticals']"));
					a.moveToElement(VerticlesButton4).perform();
					Thread.sleep(3000);
					
					JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
					Thread.sleep(3000);
					JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
					Thread.sleep(3000);
					driver.findElement(By.xpath("//a[normalize-space()='Sports']")).click();
					
					//Robotics
					 WebElement VerticlesButton5= driver.findElement(By.xpath("//a[normalize-space()='Verticals']"));
						a.moveToElement(VerticlesButton5).perform();
						Thread.sleep(3000);
						
						JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
						Thread.sleep(3000);
						JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
						Thread.sleep(3000);
						
						driver.findElement(By.xpath("//a[contains(text(),'Robotics')]")).click();
						
						
						//Healthcare
		               WebElement VerticlesButton6= driver.findElement(By.xpath("//a[normalize-space()='Verticals']"));
						a.moveToElement(VerticlesButton6).perform();
						Thread.sleep(3000);
						
						JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
						Thread.sleep(3000);
						JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
						Thread.sleep(3000);
						
						driver.findElement(By.xpath("//a[normalize-space()='Healthcare']")).click(); 
						
						// Technology Part Functionality
						//HoloSuit
						 WebElement Technology= driver.findElement(By.xpath("//a[normalize-space()='Technologies']"));
							a.moveToElement(Technology).perform();
							Thread.sleep(3000);
							
							JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
							Thread.sleep(3000);
							JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
							Thread.sleep(3000);
							
							driver.findElement(By.xpath("//ul[@class='mani-hr']//li//a[@href='holosuit'][normalize-space()='HoloSuit']")).click(); 
							
							//HoloProjector
							 WebElement Technology1= driver.findElement(By.xpath("//a[normalize-space()='Technologies']"));
								a.moveToElement(Technology1).perform();
								Thread.sleep(3000);
								
								JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
								Thread.sleep(3000);
								JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
								Thread.sleep(3000);
								
								driver.findElement(By.xpath("//a[normalize-space()='HoloProjector']")).click(); 
								
								
								//HoloCapture
		                  WebElement Technology2= driver.findElement(By.xpath("//a[normalize-space()='Technologies']"));
							a.moveToElement(Technology2).perform();
								Thread.sleep(3000);
								
								JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
								Thread.sleep(3000);
								JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
								Thread.sleep(3000);
								
								driver.findElement(By.xpath("//a[contains(text(),'HoloCapture')]")).click(); 
								
								
								//HoloYantra
		            WebElement Technology3= driver.findElement(By.xpath("//a[normalize-space()='Technologies']"));
								a.moveToElement(Technology3).perform();
								Thread.sleep(3000);
								
								JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
								Thread.sleep(3000);
								JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
								Thread.sleep(3000);
								
								driver.findElement(By.xpath("//a[normalize-space()='HoloYantra']")).click(); 
								
								
								//HoloXR
		          WebElement Technology4= driver.findElement(By.xpath("//a[normalize-space()='Technologies']"));					
								a.moveToElement(Technology4).perform();				
								Thread.sleep(3000);
								
								JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
								Thread.sleep(3000);
								JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
								Thread.sleep(3000);
								
					
								driver.findElement(By.xpath("//a[normalize-space()='HoloXR']")).click(); 
								
								
								//Agriculture
								 WebElement Experiences= driver.findElement(By.xpath("//a[normalize-space()='Experiences']"));					
									a.moveToElement(Experiences).perform();				
									Thread.sleep(3000);
									
									JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
									Thread.sleep(3000);
									JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
									Thread.sleep(3000);
									
						
									driver.findElement(By.xpath("//li[@class='col-md-4 tab-link']//a[@href='agriculture'][normalize-space()='Agriculture']")).click(); 
									
									
									
									//Animation Studio
									 WebElement Experiences1= driver.findElement(By.xpath("//a[normalize-space()='Experiences']"));					
										a.moveToElement(Experiences1).perform();				
										Thread.sleep(3000);
										
										JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
										Thread.sleep(3000);
										JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
										Thread.sleep(3000);
										
							
										driver.findElement(By.xpath("//a[contains(text(),'Animation Studio')]")).click(); 
										
										
										//Electricity Training
										     WebElement Experiences2= driver.findElement(By.xpath("//a[normalize-space()='Experiences']"));					
											a.moveToElement(Experiences2).perform();				
											Thread.sleep(3000);
											
											JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
											Thread.sleep(3000);
											JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
											Thread.sleep(3000);
											
								
											driver.findElement(By.xpath("//a[contains(text(),'Electricity Training')]")).click(); 
											
											
											//Build Your Own Robot
											 WebElement Experiences3= driver.findElement(By.xpath("//a[normalize-space()='Experiences']"));					
												a.moveToElement(Experiences3).perform();				
												Thread.sleep(3000);
												
												JS.executeScript("window.scrollBy(0,8000)", args);//Scroll Down
												Thread.sleep(3000);
												JS.executeScript("window.scrollBy(0,-8000)", args);//Scroll Up
												Thread.sleep(3000);
												
									
												driver.findElement(By.xpath("//a[contains(text(),'Build Your Own Robot')]")).click();
												
												
												//Heavy Equipment Training
												WebElement Experiences4= driver.findElement(By.xpath("//a[normalize-space()='Experiences']"));					
												a.moveToElement(Experiences4).perform();				
												Thread.sleep(3000);
												
												JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
												Thread.sleep(3000);
												JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
												Thread.sleep(3000);
												
									
												driver.findElement(By.xpath("//a[contains(text(),'Heavy Equipment Training')]")).click();
												
												
												//Ergonomics
												WebElement Experiences5= driver.findElement(By.xpath("//a[normalize-space()='Experiences']"));					
												a.moveToElement(Experiences5).perform();				
												Thread.sleep(3000);
												
												JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
												Thread.sleep(3000);
												JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
												Thread.sleep(3000);
												
									
												driver.findElement(By.xpath("//li[@class='col-md-4 tab-link']//a[@href='ergonomics'][normalize-space()='Ergonomics']")).click();
												
												
												//K12 - Higher Secondary
												WebElement Experiences6= driver.findElement(By.xpath("//a[normalize-space()='Experiences']"));					
												a.moveToElement(Experiences6).perform();				
												Thread.sleep(3000);
												
												JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
												Thread.sleep(3000);
												JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
												Thread.sleep(3000);
												
									
												driver.findElement(By.xpath("//a[contains(text(),'K12 - Higher Secondary')]")).click();
												
												//Veterinary
												WebElement Experiences7= driver.findElement(By.xpath("//a[normalize-space()='Experiences']"));					
												a.moveToElement(Experiences7).perform();				
												Thread.sleep(3000);
												
												JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
												Thread.sleep(3000);
												JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
												Thread.sleep(3000);
												
									
												driver.findElement(By.xpath("//li[@class='col-md-4 tab-link']//a[@href='veterinary'][normalize-space()='Veterinary']")).click();
												
												
												//Rehabilitation
												WebElement Experiences8= driver.findElement(By.xpath("//a[normalize-space()='Experiences']"));					
												a.moveToElement(Experiences8).perform();				
												Thread.sleep(3000);
												
												JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
												Thread.sleep(3000);
												JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
												Thread.sleep(3000);
												
									
												driver.findElement(By.xpath("//li[@class='col-md-4 tab-link']//a[@href='rehabilitation'][normalize-space()='Rehabilitation']")).click();
												
												
												//Virtualized Arcade
												WebElement Experiences9= driver.findElement(By.xpath("//a[normalize-space()='Experiences']"));					
												a.moveToElement(Experiences9).perform();				
												Thread.sleep(3000);
												
												JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
												Thread.sleep(3000);
												JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
												Thread.sleep(3000);
												
									
												driver.findElement(By.xpath("//a[contains(text(),'Virtualized Arcade')]")).click();
												
												//Cricket Coaching
												WebElement Experiences10= driver.findElement(By.xpath("//a[normalize-space()='Experiences']"));					
												a.moveToElement(Experiences10).perform();				
												Thread.sleep(3000);
												
												JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
												Thread.sleep(3000);
												JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
												Thread.sleep(3000);
												
									
												driver.findElement(By.xpath("//a[contains(text(),'Cricket Coaching')]")).click();
												
												//driver.navigate().to("https://www.holoworld.one/");
												JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
												Thread.sleep(3000);
												JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
												Thread.sleep(3000);
												 
											
												Actions a1 = new Actions(driver);
												
												// Book Demo Button
												driver.findElement(By.xpath( "//body/header/div/div/div/div/a[1]")).click();;
												Set<String> windowIDs = driver.getWindowHandles();
												
												List<String> windowIDsList = new ArrayList(windowIDs);
												
												String parentWindowID=windowIDsList.get(0);
												String childWindowID=windowIDsList.get(1);
												
												driver.switchTo().window(parentWindowID);
												System.out.println("Parent window Title"+driver.getTitle());
											
												driver.switchTo().window(childWindowID);
												System.out.println("child window Title"+driver.getTitle());
												driver.findElement(By.xpath("//input[@name='SingleLine']")).sendKeys("Subham Naskar");
												driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("naskarsubham14@gmail.com");
												driver.findElement(By.xpath("//input[@id='PhoneNumber']")).sendKeys("7059766512");
												driver.findElement(By.xpath("//input[@name='SingleLine2']")).sendKeys("XyZ");
												driver.findElement(By.xpath("//input[@id='Checkbox3_1']")).click();
												driver.findElement(By.xpath("//input[@id='Checkbox_1']")).click();
												driver.findElement(By.xpath("//input[@id='Checkbox2_6']")).click();
												driver.findElement(By.xpath("//input[@id='Checkbox1_11']")).click();
												driver.findElement(By.xpath("//input[@name='SingleLine1']")).sendKeys("Testing from QA");
												Thread.sleep(3000);
												driver.findElement(By.xpath("//li[@id='formAccess']//button[@value='submit']")).click();
												Thread.sleep(3000);
											           
												
												driver.close();
												driver.switchTo().window(parentWindowID);
										
					
											    //Menu Section
											    driver.findElement(By.xpath("//a[@class='nav-link icon-menu']")).click();
												 Thread.sleep(2000);
												    driver.findElement(By.xpath("//ul[@class='menu-side_l']//a[normalize-space()='BLOGS']")).click();
												    
												    Set<String> windowIDs1 = driver.getWindowHandles();
													
													List<String> windowIDsList1 = new ArrayList(windowIDs1);
													
													String parentWindowID0=windowIDsList1.get(0);
													String childWindowID1=windowIDsList1.get(1);
													
													driver.switchTo().window(parentWindowID0);
													System.out.println("Parent window Title"+driver.getTitle());
												
													driver.switchTo().window(childWindowID1);
													driver.findElement(By.xpath("//li[@id='menu-item-1663']//a[@href='#'][normalize-space()='News']")).click();
													Thread.sleep(3000);
													JS.executeScript("window.scrollBy(0,2000)", args);//Scroll Down
													Thread.sleep(3000);
													JS.executeScript("window.scrollBy(0,-2000)", args);//Scroll Up
													Thread.sleep(3000);

													driver.findElement(By.xpath("//li[@id='menu-item-1471']//a[normalize-space()='In News']")).click();
													Thread.sleep(3000);
													driver.findElement(By.xpath("//li[@id='menu-item-1663']//a[@href='#'][normalize-space()='News']")).click();
													Thread.sleep(3000);
													driver.findElement(By.xpath("//li[@id='menu-item-1662']//a[normalize-space()='Videos']")).click();
													JS.executeScript("window.scrollBy(0,1000)", args);//Scroll Down
													Thread.sleep(2000);
													JS.executeScript("window.scrollBy(0,-1000)", args);//Scroll Up
													Thread.sleep(2000);
													driver.findElement(By.xpath("//li[@id='menu-item-1623']//a[normalize-space()='Press-Gallery']")).click();
													Thread.sleep(2000);
													JS.executeScript("window.scrollBy(0,1000)", args);//Scroll Down
													Thread.sleep(2000);
													JS.executeScript("window.scrollBy(0,-1000)", args);//Scroll Up
													Thread.sleep(2000);
													driver.findElement(By.xpath("//li[@id='menu-item-1721']//a[normalize-space()='Events']")).click();
													JS.executeScript("window.scrollBy(0,1000)", args);//Scroll Down
													Thread.sleep(2000);
													JS.executeScript("window.scrollBy(0,-1000)", args);//Scroll Up
													Thread.sleep(2000);
													
													driver.findElement(By.xpath("//img[@alt='Holoworld']")).click();
													JS.executeScript("window.scrollBy(0,1000)", args);//Scroll Down
													Thread.sleep(2000);
													JS.executeScript("window.scrollBy(0,-1000)", args);//Scroll Up
													Thread.sleep(2000);
													
													//About
													
													driver.findElement(By.xpath("//a[@class='nav-link']")).click();
													JS.executeScript("window.scrollBy(0,1000)", args);//Scroll Down
													Thread.sleep(2000);
													JS.executeScript("window.scrollBy(0,-1000)", args);//Scroll Up
													Thread.sleep(2000);
													
													//driver.findElement(By.xpath("//a[normalize-space()='CONTACT US NOW']")).click();
												
													//Set<String> windowIDs2 = driver.getWindowHandles();
													
													//List<String> windowIDsList2 = new ArrayList(windowIDs2);
													
													//String parentWindowID1=windowIDsList2.get(0);
													//String childWindowID2=windowIDsList2.get(1);
													
													//driver.switchTo().window(parentWindowID1);
													//System.out.println("Parent window Title"+driver.getTitle());
												
													//driver.switchTo().window(childWindowID2);
													 driver.get("https://forms.zohopublic.in/holosuit/form/ContactUs/formperma/KNd0Hj4vJzhvVszHlZVrns2THMzHy0s_a3CGmaN--nY");
													driver.findElement(By.xpath("//li[@id='Name-li']//span[1]//input[1]")).sendKeys("Subham");
													 driver.findElement(By.xpath("//li[@id='Name-li']/div/div/span[2]/input")).sendKeys("Naskar");
													
													driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("naskarsubham14@gmail.com");
													driver.findElement(By.xpath("//input[@id='PhoneNumber']")).sendKeys("7059766512");
													WebElement ddown1=driver.findElement(By.name("Dropdown1"));
													driver.findElement(By.name("Dropdown1")).click();
													new Select(driver.findElement(By.name("Dropdown1"))).selectByVisibleText("Investor");
													
													Thread.sleep(2000);
													driver.findElement(By.name("MultiLine")).sendKeys("hello QA Testing");
													Thread.sleep(2000);
													driver.findElement(By.xpath("//li[@id='formAccess']//div//div//div//button[@value='submit']")).click();
													Thread.sleep(2000);
													driver.get("https://holoworld.one/");
													JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
													Thread.sleep(2000);
													JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll up
													
													driver.close();
													
												    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SDK'])[2]/following::a[1]")).click();
												    driver.get("https://holosuit.zohorecruit.in/jobs/Careers");
					
													
													Thread.sleep(2000);
													 driver.get("https://www.instagram.com/holoworld_one/");
													 driver.findElement(By.linkText("Go back to Instagram.")).click();
													 
													 Thread.sleep(2000);
													 driver.get("https://www.facebook.com/HoloWorld.one");
													    driver.findElement(By.xpath("//div[@id='mount_0_0_qJ']/div/div/div/div[3]/div/div/div/div/div/div/div/div[4]/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div[2]/div/div/div/div[3]/div/a/div/span")).click();
													    driver.close();
													
													 
													 driver.get("https://twitter.com/holoworld_one");
													    
													    Thread.sleep(2000);
													    
													    driver.get("https://www.linkedin.com/company/holoworld");
													    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sign in'])[2]/following::*[name()='svg'][1]")).click();
													    
													    
													    Thread.sleep(2000);
													    driver.get("https://www.youtube.com/channel/UCHVog1z6yzm94iknC5BWdiA");
													    
													    
													    driver.get("https://www.holoworld.one/");
													    driver.findElement(By.xpath("//a/img")).click();
													    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='AR EXPERIENCES'])[1]/following::a[6]")).click();
													    driver.findElement(By.id("Line_23")).click();
													    driver.findElement(By.id("Line_23")).click();
													    driver.findElement(By.id("Line_23")).click();
													    driver.findElement(By.id("Line_23")).click();
													    driver.findElement(By.id("Line_23")).click();
													    driver.findElement(By.id("Line_23")).click();
													    driver.findElement(By.linkText("PRIVACY POLICY")).click();
													    driver.findElement(By.linkText("COOKIE POLICY")).click();
													    driver.findElement(By.linkText("TERMS OF USE")).click();
													    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='EVENTS'])[2]/following::a[1]")).click();
													    driver.findElement(By.name("Email")).click();
													    driver.findElement(By.name("Email")).clear();
													    driver.findElement(By.name("Email")).sendKeys("naskarsubham14@gmail.com");
													    driver.findElement(By.xpath("//img[@onclick='submitForm()']")).click();
			}

		}


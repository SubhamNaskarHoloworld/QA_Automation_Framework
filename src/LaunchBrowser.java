


import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args)  throws InterruptedException  {

		

		//chrome Browser
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\KaayaTech\\Downloads\\chromedriver_win32\\chromedriver.exe");
				//ChromeDriver driver= new ChromeDriver();
				
				WebDriver driver=new ChromeDriver();

				driver.get("https://holoworld.one/");
				Actions a = new Actions(driver);
				driver.manage().window().maximize();//maximum window 
				
				String parentHandle=driver.getWindowHandle();
				
				JavascriptExecutor JS = (JavascriptExecutor)driver;
				driver.findElement(By.xpath( "//body/header/div/div/div/div/a[1]")).click();
			
				//JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
				//Thread.sleep(3000);
				//JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
				//Thread.sleep(3000);
				
				driver.findElement(By.xpath("//input[@name='SingleLine']")).sendKeys("Subham Naskar");
				
				
				//JavascriptExecutor JS = (JavascriptExecutor)driver;
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
												 
											//Book Demo
												//driver.findElement(By.xpath( "//a[normalize-space()='Book Demo']")).click();
												//JS.executeScript("window.scrollBy(0,4000)", args);//Scroll Down
												//Thread.sleep(3000);
												//JS.executeScript("window.scrollBy(0,-4000)", args);//Scroll Up
												//Thread.sleep(3000);
												
												Actions a1 = new Actions(driver);
												driver.navigate().to("https://forms.zohopublic.in/holosuit/form/SoftwareRequest/formperma/8uRIK4TVaxetbA4tHNZTKjg3bhrjxD3MwRL8xrVJjhI");
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
											    driver.navigate().to("https://holoworld.one/");
											    Thread.sleep(3000);
											    driver.findElement(By.xpath("//a[@class='nav-link icon-menu']")).click();
											    driver.findElement(By.xpath("//ul[@class='menu-side_l']//a[normalize-space()='BLOGS']")).click();
			}

		}


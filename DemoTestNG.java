package TestNG;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoTestNG {
   	protected static WebDriver driver;
	String name;
	String dropboxNames[];
	Scanner input = new Scanner(System.in); 
	int num;
   @BeforeClass(description="open chrome browser")
   public static void setup()  {
		System.setProperty("webdriver.chrome.driver", "/home/prajakta/Documents/Selenium/newDocuments/chromedriver");
	    driver= new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }
   
   @BeforeClass(description="Create dropboxNames")
	void createDropboxName() { 
	 System.out.println("Enter a starting DropboxName: ");
	 name = input.nextLine();
	 System.out.println("Enter number of dropbox you want to create: ");
	 num=input.nextInt();
	 String[] part = name.split("(?<=\\D)(?=\\d)");
	 int result = Integer.parseInt(part[1]);
	 int array[] = new int[num];
	 array[0]=result;
	 String strarr[] = new String[num];
	 strarr[0]= name;
	 for(int i=1;i<num; i++) {
		 int nextName= result+1;
		 array[i]=nextName;
		 result = nextName;
	 }
	 dropboxNames=new String[num];
	 dropboxNames[0]= name;
	 for(int i=1; i< num; i++) {
	 String demo= Integer.toString(array[i]);
	 dropboxNames[i]=part[0] + demo;
	 }
	 
	 }
 
   @Test(description=" print dropbox names")
   void F()
   {
	   for (int i=0; i<num;i++) {
		   System.out.println(dropboxNames[i]);
	   }
   }
	@Test(description = "Fill the Login Details")
	void Testcase1() {

		driver.get("http://www.dropbox.com/developers");	
        driver.findElement(By.linkText("Create your app")).click();
        driver.findElement(By.xpath("//input[@name='login_email']")).sendKeys("email_id");
        driver.findElement(By.xpath("//input[@name='login_password']")).sendKeys("Password");
        driver.findElement(By.xpath("//input[@name='remember_me']")).click();
	    driver.findElement(By.xpath("//*[@class='login-button button-primary']")).click();
	    
	 }
	
	@Test(description = "create dropbox ids and access token")
	void Testcase2() throws InterruptedException {
		
	    driver.findElement(By.xpath("//*[@id='dropbox']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='app_folder_permission']")).click();
	    driver.findElement(By.xpath("//*[@id='app_folder_permission']")).click();
	    driver.findElement(By.xpath("//*[@id='app-name']")).sendKeys(dropboxNames[0]);
	    driver.findElement(By.xpath("//*[@id='email-verified']/button")).click();
	    driver.findElement(By.xpath("//*[@id='generate-token-button']")).click();
	    String appid= driver.findElement(By.xpath("//*[@id='generated-token']")).getAttribute("data-token");
	     
	 }
	
	
	 @AfterClass
     public static void teardown()  {

     driver.close();

     driver.quit();

      }
	
}










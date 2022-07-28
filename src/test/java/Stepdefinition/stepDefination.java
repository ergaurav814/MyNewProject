package Stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {

public static WebDriver driver;


    @Given("User is on fusion login page")
    public void user_is_on_fusion_login_page()  {

  //  System.setProperty("webdriver.gecko.driver","C:/Users/ggaurav/eclipse-workspace/Automation/geckodriver.exe");
    System.setProperty("webdriver.chrome.driver","C:/Users/ggaurav/eclipse-workspace/Automation/chromedriver.exe");
   // System.setProperty("webdriver.edge.driver","C:/Users/ggaurav/eclipse-workspace/Automation/msedgedriver.exe");

    	//   driver = new FirefoxDriver ();
         //   driver = new EdgeDriver();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
    	    driver.get("https://fusion-app.sekureqa.com/");

    }

       @When("user login into the application by following details")
       public void user_login_into_the_application_by_following_details(DataTable data) throws Throwable {

    	List<List<String>> obj= data.asLists();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	// driver.get("https://fusion-app.sekureqa.com/");
    	driver.findElement(By.id("okta-signin-username" )).sendKeys(obj.get(0).get(0));;
    	driver.findElement(By.id("okta-signin-password")).sendKeys(obj.get(0).get(1));
    	System.out.println(" USername and Password fetched successfully");
    	System.out.println(" USername and Password fetched successfully");
    	System.out.println(" USername and Password fetched successfully");
     //  System.out.println(driver.findElement(By.cssSelector("div[role='alert']p")).getText());
    	}



    @Then("homepage is populated")
    public void homepage_is_populated() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	// driver.get("https://fusion-app.sekureqa.com/");
    	//driver.findElement(By.id("okta-signin-username")).sendKeys("ggaurav@sekuremerchants.com");
    	//driver.findElement(By.id("okta-signin-password")).sendKeys("Q@SPuzybQXD");
    	driver.findElement(By.id("okta-signin-submit")).click();
        driver.findElement(By.xpath("//input[@value='Send Push']")).click();

    	//driver.get("https://fusion-app.sekureqa.com/dashboard");
        //driver.get("https://fusion-app.sekureqa.com/dashboard");
        // System.out.println(driver.findElement(By.tagName("img")).isDisplayed());
  
        //driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();1
        
        WebElement target = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/main[1]/app-sidenav-menu[1]/aside[1]/p-panelmenu[1]/div[1]/div[9]/div[1]/a[1]/span[3]"));
        WebElement target2= driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/main[1]/app-sidenav-menu[1]/aside[1]/p-panelmenu[1]/div[1]/div[9]/div[2]/div[1]/p-panelmenusub[1]/ul[1]/li[1]/a[1]/span[3]"));
        Actions a = new Actions(driver);
        a.moveToElement(target);
        a.click(target);
        a.moveToElement(target2);
        a.click(target2);
        a.build().perform();
       
        System.out.println("USer is on the fusion homepage");
        Thread.sleep(300);
        driver.close();


    }





}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TestSelenium {
    public static void main(String[] args) {
        //create the driver object and initialise with system properties
        System.setProperty("webdriver.chrome.driver", "D:\\New folder (3)\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.coursera.org/");



        //Maximize current window
        driver.manage().window().maximize();



        //reading page title
        driver.get("https://www.coursera.org/");
        System.out.println("Page title is : " + driver.getTitle());

        //fill input (text)
        driver.findElement(By.cssSelector("#__next > header > div > div > div > div:nth-child(1) > div.rc-SearchBarContainer > div > form > div > div > div.rc-AutoComplete.horizontal-box.isLohpRebrand > div.react-autosuggest__container > input")).sendKeys("Data science course");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //static page
        driver.findElement(By.cssSelector("#student-link")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //fill input (text)
        driver.findElement(By.cssSelector("#university-email-input-input")).sendKeys("automationfunworld@gmail.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //login was blocked and needed google recaptcha verifying
        //driver.findElement(By.cssSelector("#c-ph-right-nav > ul > li.c-ph-right-nav-button.c-ph-log-in.isLohpRebrand > a")).click();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //driver.findElement(By.cssSelector("#email")).sendKeys("automationfunworld@gmail.com");
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //driver.findElement(By.cssSelector("#password")).sendKeys("nagham12");
        //driver.findElement(By.xpath("//*[@id=\"password\"]")).submit();
        //String alrt = driver.switchTo().alert().getText();
        //driver.switchTo().alert().accept();
        //System.out.println(alrt);


        //browser back button
        driver.navigate().back();

        //go to the form page
        driver.findElement(By.cssSelector("#__next > main > section.rc-PromoAdRedesign._1lwxvya > div._gtp2q1 > div._qdw02k > a")).click();
        driver.findElement(By.cssSelector("#wrapper-navbar > div > div > a.btn.btn-standard.topbar-cta.d-none.d-sm-none.d-md-block")).click();


        //form sending by user & dropdown selection
        driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Nagham");
        driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Dahi");
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("automationfunworld@gmail.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"db_company_name__c\"]")).sendKeys("Nokia");
        driver.findElement(By.xpath("//*[@id=\"Phone\"]")).sendKeys("0036111222");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //selection and dropdown
        Select dropdown =new Select(driver.findElement(By.id("jobRole")));
        dropdown.selectByIndex(3);
        Select dropdownn1 =new Select(driver.findElement(By.id("C4C_Job_Title__c")));
        dropdownn1.selectByIndex(4);
        Select droppdwnn3 =new Select(driver.findElement(By.id("Employee_Range__c")));
        droppdwnn3.selectByIndex(3);
        Select droppdnn4 =new Select(driver.findElement(By.id("Self_reported_employees_to_buy_for__c")));
        droppdnn4.selectByIndex(3);
        Select droppdn5 =new Select(driver.findElement(By.id("Country")));
        droppdn5.selectByVisibleText("Argentina");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#What_the_lead_asked_for_on_the_website__c")).sendKeys("motivation letter");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //send the form to the server
        driver.findElement(By.xpath("//*[@id=\"What_the_lead_asked_for_on_the_website__c\"]")).submit();
        String alrt = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        System.out.println(alrt);



        //Delay execution for 3 seconds
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Close the browser
        driver.quit();



    }
}






import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v106.runtime.model.WebDriverValue;
import org.openqa.selenium.devtools.v107.input.Input;
import javax.lang.model.element.Element;
import java.util.List;


public class AUTOMATION_PROJECT {
    public static void main(String[] args) throws InterruptedException {
        // set the prroperty of Crome driver

        System.setProperty("'webdriver.crome.driver", "C:\\Users\\Rahul Bhandari\\IdeaProjects\\selenium\\Selenium Jar Files And Drivers\\Crome Driver");

        // create the object of crome drver class and
        // also access the all elements or tools with the help og crome driver class refrence
        WebDriver driver = new ChromeDriver();
        // driver is the refrence object of crome driver class



        // go to the google crome url
        driver.get("https://www.google.co.in/");

        // Maximize the window , maximize is predefined method of crome driver class
        driver.manage().window().maximize();


        // find element by xpath locator
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("https://demo.guru99.com/");
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[11]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/h3[1]")).click();


         String act_url=driver.getCurrentUrl();
         String desired_url = "https://demo.guru99.com/";

         // check Url is actual url or not
         if(act_url.equals(desired_url))
             System.out.println("pass");
         else
             System.out.println("fail");


        // access the element by name locator
        WebElement emailID=driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[5]/td[2]/input[1]"));
                emailID.sendKeys("rahulbhan231@gmail.com");


        driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[6]/td[2]/input[1]")).click();
       WebElement UserID = driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[4]/td[2]"));
       WebElement Passwd = driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[5]/td[2]"));

       String Userid=UserID.getText();
       String passwd=Passwd.getText();

        // we can find element in various ways by id,by xpath,by name etc

          driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
        Thread.sleep(1000);


         // find element by linked text locator
        driver.findElement(By.linkText("Login")).click();

        // create refrence of Webelement class
        WebElement Email =driver.findElement(By.id("email"));
        Email.sendKeys(Userid);

        // create refrence of Webelement class
        WebElement Pasword =driver.findElement(By.id("passwd"));
        Pasword.sendKeys(passwd);

        driver.findElement(By.id("SubmitLogin")).click();

        // again click selenium link for next further task
         driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
        Thread.sleep(1000);
        // after that click on delete customer form link
        driver.findElement(By.linkText("Delete Customer Form")).click();
        driver.navigate().refresh();

        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();

        Thread.sleep(1000);
        // after that click on delete customer form link
        driver.findElement(By.linkText("Delete Customer Form")).click();

        Thread.sleep(1000);
        driver.findElement(By.name("cusid")).sendKeys("1234");
        driver.findElement(By.name("submit")).click();


        // create a refrence variable of Alert type class which accept many mathhod like switchto(),
       // alert(),dismiss etc.
        Alert alert =driver.switchTo().alert();

        // show the alert box and ask that customer have to deleted or not
        Thread.sleep(1000);
        alert.accept();

        // customer has deleted
        alert.accept();


        driver.findElement(By.className("dropdown")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Radio & Checkbox Demo")).click();

          // click on radio button
        WebElement radiobox1=driver.findElement(By.id("vfb-7-1"));
                radiobox1.click();
        Thread.sleep(1000);
        WebElement radiobox2=driver.findElement(By.id("vfb-7-2"));
                radiobox2.click();
        Thread.sleep(1000);
        WebElement radiobox3=driver.findElement(By.id("vfb-7-3"));
        radiobox3.click();


        Thread.sleep(1000);
         WebElement checkbox1=driver.findElement(By.id("vfb-6-0"));
         checkbox1.click();
        Thread.sleep(1000);
        WebElement checkbox2=driver.findElement(By.id("vfb-6-1"));
        checkbox2.click();
        Thread.sleep(1000);
        WebElement checkbox3=driver.findElement(By.id("vfb-6-2"));
        checkbox3.click();




        System.out.println(" is checkbox1 selected ? " +checkbox1.isSelected());
        System.out.println(" is checkbox2 selected ? " +checkbox2.isSelected());
        System.out.println(" is checkbox3 selected ? " +checkbox3.isSelected());
        System.out.println(" is radiobox1 selected ? " +radiobox1.isSelected());
        System.out.println(" is radiobox2 selected ? " +radiobox2.isSelected());
        System.out.println(" is radiobox1 selected ? " +radiobox3.isSelected());
        driver.close();

    }
}

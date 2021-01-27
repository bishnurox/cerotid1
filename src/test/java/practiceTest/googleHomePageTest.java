package practiceTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import practice1.GoogleHomePage;

public class googleHomePageTest {

    @Test
    public void test() {


        //public static void main (String[]args) throws InterruptedException {


            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();


            driver.get("https://www.cerotid.com/");

            driver.manage().window().maximize();

            if (driver.getTitle().equals("Cerotid")) {

                System.out.println("Cerotid was Lunched-------------");

            } else {

                System.out.println("Wrong Page");
            }


            GoogleHomePage cerotidFrom = new GoogleHomePage(driver);

            cerotidFrom.selectCourse(3);

            cerotidFrom.selectSession("NewSession");
            cerotidFrom.enterFullName("Harry Potter");
            cerotidFrom.enterAddress("1222 Holleywood Rd");
            cerotidFrom.enterCityName("California");
            cerotidFrom.enterZipCode("40222");
            cerotidFrom.getEmailId("harry@aol.com");
            cerotidFrom.enterPhoneNumber("123-456-7890");
            cerotidFrom.selectVisaStatus("5");
            cerotidFrom.hearAbout("1");
            cerotidFrom.radioBtn("Yes");
            cerotidFrom.eduBg("Test Test Test");


            driver.close();
            driver.quit();
        }


    }




package practice1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GoogleHomePage {

    WebDriver driver = null;
    By selectCourse = By.xpath("//select[@id='classType']");
    By selectSession = By.xpath("//select[@id='sessionType']");
    By fullName = By.xpath("//input[@placeholder='Full Name *']");
    By addressElement = By.xpath("//input[@placeholder='Address *']");
    By cityName = By.xpath("//input[@placeholder='City *']");
    By stateElement = By.xpath("//select[@id='state']");
    By zipCode = By.xpath("//input[@placeholder='Zip Code *']");
    By emailId = By.xpath("//input[@placeholder='Email *']");
    By contactNumber = By.xpath("//input[@placeholder='Phone *']");
    By visaStatus = By.xpath("//select[@id='visaStatus']");
    By hearAboutUs = By.xpath("//select[@id='mediaSource']");
    By radioBtn = By.xpath("//input[@type='radio']");
    By eduBg = By.xpath("//textarea[@id='eduDetails']");

    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
    }



    public void selectCourse(int index) {

        WebElement element = driver.findElement(selectCourse);
        Select chooseCourse = new Select(element);
        chooseCourse.selectByIndex(index);

    }
    public void selectSession(String sessionValue) {
        WebElement element = driver.findElement(selectSession);
        Select chooseSession = new Select(element);
        chooseSession.selectByValue(sessionValue);

    }
    public void enterFullName(String name) {
        driver.findElement(fullName).sendKeys(name);
    }
    public void enterAddress(String address) {
        driver.findElement(addressElement).sendKeys(address);
    }
    public void enterCityName(String city) {
        driver.findElement(cityName).sendKeys(city);
    }

    public void enterZipCode(String zipcode) {
        driver.findElement(zipCode).sendKeys(zipcode);
    }
    public void getEmailId(String emailid) {
        driver.findElement(emailId).sendKeys(emailid);
    }
    public void enterPhoneNumber(String phonenumber) {
        driver.findElement(contactNumber).sendKeys(phonenumber);
    }
    public  void selectVisaStatus(String string) {
        WebElement element = driver.findElement(visaStatus);
        Select choosevisaStatus = new Select(element);
        choosevisaStatus.selectByIndex(5);
    }
    public void hearAbout(String index) {
        WebElement element = driver.findElement(hearAboutUs);
        Select hearAbout = new Select(element);
        hearAbout.selectByIndex(1);

    }
    public void radioBtn(String Yes) {
        driver.findElement(radioBtn).sendKeys(Yes);
    }

    public void eduBg(String Value) {
        driver.findElement(eduBg).sendKeys(Value);
    }



    public boolean isElementPresent(By by) {
        boolean check;
        try {
            driver.findElements(by);
            check = true;
        }catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
            e.getCause();
            check = false;
        }
        return check;
    }

}



package Object;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class quoteObjects extends verify {
    WebDriver driver = null;

    public void accessPage(String link){
        System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
        //abrir o navegador
        this.driver = new ChromeDriver();
        driver.get(link);
        driver.manage().window().maximize();

        //verifica que está na página correta
        try {
            WebElement check = driver.findElement(By.id("tricentis_logo"));
            Assert.assertTrue(check.isDisplayed());
        } catch(NoSuchElementException nsee) {
            System.out.println("The table was not located.1");
        } catch(AssertionError ae) {
            System.out.println("The table was located, but not displayed.");
        }
        driver.findElement(By.id("nav_automobile")).click();
    }
    public void EnterVehicleData() throws InterruptedException {
        //Verifica que a aba correta está selecionada
        if (verifyTab(driver, "entervehicledata")) {
            //Steps
            driver.findElement(By.id("make")).click();
            {
                WebElement dropdown = driver.findElement(By.id("make"));
                dropdown.findElement(By.xpath("//option[. = 'Nissan']")).click();
            }
            driver.findElement(By.id("make")).click();
            driver.findElement(By.id("engineperformance")).click();
            driver.findElement(By.id("engineperformance")).sendKeys("500");
            driver.findElement(By.id("opendateofmanufacturecalender")).click();
            driver.findElement(By.cssSelector(".ui-datepicker-prev")).click();
            driver.findElement(By.linkText("16")).click();
            driver.findElement(By.id("numberofseats")).click();
            {
                WebElement dropdown = driver.findElement(By.id("numberofseats"));
                dropdown.findElement(By.xpath("//option[. = '7']")).click();
            }
            driver.findElement(By.id("numberofseats")).click();
            driver.findElement(By.id("fuel")).click();
            {
                WebElement dropdown = driver.findElement(By.id("fuel"));
                dropdown.findElement(By.xpath("//option[. = 'Electric Power']")).click();
            }
            driver.findElement(By.id("fuel")).click();
            driver.findElement(By.id("listprice")).click();
            driver.findElement(By.id("listprice")).sendKeys("25000");
            driver.findElement(By.id("annualmileage")).click();
            driver.findElement(By.id("annualmileage")).sendKeys("300");
            driver.findElement(By.id("nextenterinsurantdata")).click();

            Thread.sleep(1000);
        }
    }
    public void EnterInsurantData(){
       //Verifica que a aba correta está selecionada
        if (verifyTab(driver, "enterinsurantdata")) {
            //Steps
            driver.findElement(By.id("firstname")).click();
            driver.findElement(By.id("firstname")).sendKeys("Manuel");
            driver.findElement(By.id("lastname")).click();
            driver.findElement(By.id("lastname")).sendKeys("Bandeira");
            driver.findElement(By.id("birthdate")).click();
            driver.findElement(By.id("birthdate")).sendKeys("08/21/1967");
            driver.findElement(By.id("country")).click();
            {
                WebElement dropdown = driver.findElement(By.id("country"));
                dropdown.findElement(By.xpath("//option[. = 'Brazil']")).click();
            }
            driver.findElement(By.id("country")).click();
            driver.findElement(By.id("zipcode")).click();
            driver.findElement(By.id("zipcode")).sendKeys("50670901");
            driver.findElement(By.id("occupation")).click();
            {
                WebElement dropdown = driver.findElement(By.id("occupation"));
                dropdown.findElement(By.xpath("//option[. = 'Selfemployed']")).click();
            }
            driver.findElement(By.id("occupation")).click();
            driver.findElement(By.cssSelector(".field:nth-child(10) .ideal-radiocheck-label:nth-child(2)")).click();
            driver.findElement(By.id("nextenterproductdata")).click();
        }
    }
    public void EnterProductData(){
       //Verifica que a aba correta está selecionada
        if (verifyTab(driver, "enterproductdata")){
            //Steps
            driver.findElement(By.cssSelector("#openstartdatecalender > .fa")).click();
            driver.findElement(By.cssSelector(".ui-datepicker-next")).click();
            driver.findElement(By.linkText("11")).click();
            driver.findElement(By.id("insurancesum")).click();
            {
                WebElement dropdown = driver.findElement(By.id("insurancesum"));
                dropdown.findElement(By.xpath("//option[. = ' 10.000.000,00']")).click();
            }
            driver.findElement(By.id("insurancesum")).click();
            driver.findElement(By.id("meritrating")).click();
            {
                WebElement dropdown = driver.findElement(By.id("meritrating"));
                dropdown.findElement(By.xpath("//option[. = 'Bonus 4']")).click();
            }
            driver.findElement(By.id("meritrating")).click();
            driver.findElement(By.id("damageinsurance")).click();
            {
                WebElement dropdown = driver.findElement(By.id("damageinsurance"));
                dropdown.findElement(By.xpath("//option[. = 'Full Coverage']")).click();
            }
            driver.findElement(By.id("damageinsurance")).click();
            driver.findElement(By.cssSelector(".field:nth-child(5) .ideal-radiocheck-label:nth-child(2)")).click();
            driver.findElement(By.id("courtesycar")).click();
            {
                WebElement dropdown = driver.findElement(By.id("courtesycar"));
                dropdown.findElement(By.xpath("//option[. = ' Yes']")).click();
            }
            driver.findElement(By.id("courtesycar")).click();
            driver.findElement(By.id("nextselectpriceoption")).click();
        }
    }
    public void SelectPriceOption() throws InterruptedException {
       //Verifica que a aba correta está selecionada
       if (verifyTab(driver, "selectpriceoption")) {
            //Steps
            driver.findElement(By.cssSelector(".choosePrice:nth-child(2) > .ideal-radio")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("nextsendquote")).click();
       }
    }
    public void SendQuote() throws InterruptedException {
        //Verifica que a aba correta está selecionada
        if (verifyTab(driver, "sendquote")) {
            //Steps
            driver.findElement(By.id("email")).click();
            driver.findElement(By.id("email")).sendKeys("bandeiram@email.com");
            driver.findElement(By.id("username")).click();
            driver.findElement(By.id("username")).sendKeys("manuelb");
            driver.findElement(By.id("password")).click();
            driver.findElement(By.id("password")).sendKeys("Passargada123");
            driver.findElement(By.id("confirmpassword")).click();
            driver.findElement(By.id("confirmpassword")).sendKeys("Passargada123");
            driver.findElement(By.id("sendemail")).click();
            Thread.sleep(15000);
        }
    }
    public void VerifyEmailSending(){
        driver.findElement(By.xpath("//*[text()='Sending e-mail success!']"));
        //driver.findElement(By.cssSelector(".confirm")).click();
    }
}

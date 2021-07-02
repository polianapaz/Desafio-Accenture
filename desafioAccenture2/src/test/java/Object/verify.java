package Object;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verify {
    public boolean verifyTab(WebDriver driver, String tabName){
        try {
            WebElement check = driver.findElement(By.cssSelector("li[class*=\"idealsteps-step-active\"] a[id*=" + tabName +" ]"));
            Assert.assertTrue(check.isDisplayed());
            return true;
        } catch(NoSuchElementException nsee) {
            System.out.println("The table was not located.");
            return false;
        } catch(AssertionError ae) {
            System.out.println("The table was located, but not displayed.");
            return false;
        }
    }
}
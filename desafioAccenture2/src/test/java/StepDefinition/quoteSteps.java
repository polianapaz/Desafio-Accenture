package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Object.quoteObjects;

public class quoteSteps extends quoteObjects{
    @Given("I access {string} webpage")
    public void iAccessWebpage(String link) {
        accessPage(link);
    }

    @When("I fill out the form in the {string} tab")
    public void iFillOutTheFormInTheTab(String arg0) throws InterruptedException {
        switch (arg0) {
            case "Enter Vehicle Data":
                EnterVehicleData();
                Thread.sleep(1500);
                break;
            case "Enter Insurant Data":
                EnterInsurantData();
                Thread.sleep(1500);
                break;
            case "Enter Product Data":
                EnterProductData();
                Thread.sleep(1500);
                break;
            case "Select Price Option":
                SelectPriceOption();
                Thread.sleep(1500);
                break;
            case "Send Quote":
                SendQuote();
                Thread.sleep(1500);
                break;
        }
    }

    @Then("A “Sending e-mail success!” message is displayed")
    public void aSendingEMailSuccessMessageIsDisplayed() {
        VerifyEmailSending();
    }
}

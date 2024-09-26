package KeyProductsEnjay.MainProductsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SangamCRM {
    protected WebDriver driver;
    private Actions actions;

    // Locators for the product links
    private By productsMenu = By.xpath("//a[@class='mega-menu-link' and text()='Products']");
    private By sangamCRMLink = By.linkText("Sangam CRM");

    // Example locator for an element unique to the Sangam CRM page
    private By pageHeader = By.xpath("//h1[contains(text(),'Sangam CRM')]"); // Adjust as necessary

    // Constructor
    public SangamCRM(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver); // Initialize Actions
    }

    // Method to hover over the Products menu and click on Sangam CRM
    public void hoverAndClickSangamCRM() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement productMenuElement = wait.until(ExpectedConditions.visibilityOfElementLocated(productsMenu));
        actions.moveToElement(productMenuElement).perform();
        driver.findElement(sangamCRMLink).click();
    }

    public boolean isPageLoaded() {
        try {
            return driver.findElement(pageHeader).isDisplayed(); // Check if the header is visible
        } catch (Exception e) {
            return false; // Return false if element is not found
        }
    }
}
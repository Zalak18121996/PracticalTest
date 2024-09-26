package KeyProductsEnjay.MainProductsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SamvadTelecallerApp {
    private WebDriver driver;
    private Actions actions;

    // Locators for the product link
    private By productsMenu = By.xpath("//a[@class='mega-menu-link' and text()='Products']");
    private By SamvadTelecallerApp = By.linkText("Samvad Telecaller App");

    // Example locator for an element unique to the Samvad Tele caller App page
    private By pageHeader = By.xpath("//h1[contains(text(),'Synapse Call Center Cloud')]");

    // Constructor
    public SamvadTelecallerApp(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver); // Initialize Actions
    }

    // Method to hover over the Products menu
    public void hoverOverProductsMenu() {
        actions.moveToElement(driver.findElement(productsMenu)).perform();
    }

    // Method to hover over Products and click on Samvad Telecaller App
    public void hoverAndClickSamvadTelecallerApp() {
        hoverOverProductsMenu(); // Ensure the Products menu is hovered
        // Directly click on SamvadTelecallerApp without hovering over it
        driver.findElement(SamvadTelecallerApp).click();
    }

    public boolean isPageLoaded() {
        try {
            return driver.findElement(pageHeader).isDisplayed(); // Check if the header is visible
        } catch (Exception e) {
            return false; // Return false if element is not found
        }
    }
}

package KeyProductsEnjay.MainProductsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SynapseCallCenter {
    private WebDriver driver;
    private Actions actions;

    // Locators for the product links
    private By productsMenu = By.xpath("//a[@class='mega-menu-link' and text()='Products']");
    private By SynapseCallCenterLink = By.linkText("Synapse Telephony");

    // Example locator for an element unique to the Synapse Call Center page
    private By pageHeader = By.xpath("//h1[contains(text(),'Synapse Telephony')]");

    // Constructor
    public SynapseCallCenter(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver); // Initialize Actions
    }

    // Method to hover over the Products menu
    public void hoverOverProductsMenu() {
        actions.moveToElement(driver.findElement(productsMenu)).perform();
    }

    // Method to hover over Products and click on Synapse Call Center
    public void hoverAndClickSynapseCallCenter() {
        hoverOverProductsMenu(); // Ensure the Products menu is hovered
        // Directly click on SynapseCallCenter without hovering over it
        driver.findElement(SynapseCallCenterLink).click();
    }

    public boolean isPageLoaded() {
        try {
            return driver.findElement(pageHeader).isDisplayed(); // Check if the header is visible
        } catch (Exception e) {
            return false; // Return false if element is not found
        }
    }
}

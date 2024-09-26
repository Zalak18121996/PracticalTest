package KeyProductsEnjay.DetailsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import KeyProductsEnjay.MainProductsPages.SangamCRM;

import java.time.Duration;

public class SangamCRM_DetailPage extends SangamCRM {

    // Additional locators specific to the detail page

    private By detailPageHeader = By.xpath("//h1[contains(text(),'Detail for Sangam CRM')]"); // Adjust as necessary

    public SangamCRM_DetailPage(WebDriver driver) {
        super(driver); // Call the constructor of SangamCRM
    }

    // Method to verify that the detail page is loaded
    public boolean isDetailPageLoaded() {
        try {
            return driver.findElement(detailPageHeader).isDisplayed(); // Check if detail page header is visible
        } catch (Exception e) {
            return false; // Return false if the element is not found
        }
    }

    // Example of using inherited method to navigate to the detail page
    public void navigateToDetailPage() {
        // Call the method from SangamCRM to hover and click
        hoverAndClickSangamCRM(); // This calls the method from SangamCRM



        // Add any other actions required after navigating to the Sangam CRM page
        // For example, wait for the detail page to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(detailPageHeader));
    }
}
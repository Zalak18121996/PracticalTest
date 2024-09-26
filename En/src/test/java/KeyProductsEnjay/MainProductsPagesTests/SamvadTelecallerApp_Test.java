package KeyProductsEnjay.MainProductsPagesTests;

import KeyProductsEnjay.Base.BasePage;
import KeyProductsEnjay.MainProductsPages.SamvadTelecallerApp;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SamvadTelecallerApp_Test extends BasePage{
    @Test
    public void testNavigateToSamvadTelecallerApp() {
        // Create an instance of the ProductPage
        SamvadTelecallerApp productPage = new SamvadTelecallerApp(driver);

        // Hover and click on Samvad Telecaller App
        productPage.hoverAndClickSamvadTelecallerApp();

        // Create an instance of the SamvadTelecallerAppPage to validate page load
        SamvadTelecallerApp SamvadTelecallerApp = new SamvadTelecallerApp(driver);

        // Verify the Samvad Telecaller App page loaded
        Assert.assertTrue(SamvadTelecallerApp.isPageLoaded(), "Samvad Telecaller App page did not load as expected.");
    }
}

package KeyProductsEnjay.MainProductsPagesTests;

import KeyProductsEnjay.Base.BasePage;
import KeyProductsEnjay.MainProductsPages.SarathiFieldTrackingApp;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SarathiFieldTrackingApp_Test extends BasePage {
    @Test
    public void hoverAndClickSarathiFieldTrackingApp() throws InterruptedException {
        // Create an instance of the SarathiFieldTrackingApp page
        SarathiFieldTrackingApp SarathiFieldTrackingApp = new SarathiFieldTrackingApp(driver);

        // Hover and click on SarathiFieldTrackingApp
        SarathiFieldTrackingApp.hoverAndClickSarathiFieldTrackingApp();

        // Verify that the SarathiFieldTrackingApp page loaded
        Assert.assertTrue(SarathiFieldTrackingApp.isPageLoaded(), "SarathiFieldTrackingApp page did not load as expected.");
    }
}
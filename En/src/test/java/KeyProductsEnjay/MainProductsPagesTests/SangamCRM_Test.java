package KeyProductsEnjay.MainProductsPagesTests;

import KeyProductsEnjay.Base.BasePage;
import KeyProductsEnjay.MainProductsPages.SangamCRM;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SangamCRM_Test extends BasePage {
    @Test
    public void testNavigateToSangamCRM() {
        // Create an instance of the SangamCRM page
        SangamCRM sangamCRMPage = new SangamCRM(driver);

        // Hover and click on Sangam CRM
        sangamCRMPage.hoverAndClickSangamCRM();

        // Verify that the Sangam CRM page loaded
        Assert.assertTrue(sangamCRMPage.isPageLoaded(), "Sangam CRM page did not load as expected.");
    }
}
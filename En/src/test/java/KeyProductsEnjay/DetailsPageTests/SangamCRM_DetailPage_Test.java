package KeyProductsEnjay.DetailsPageTests;

import KeyProductsEnjay.Base.BasePage;
import KeyProductsEnjay.DetailsPage.SangamCRM_DetailPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SangamCRM_DetailPage_Test extends BasePage {
    @Test
    public void testNavigateToSangamCRMDetailPage() {
        // Create an instance of the SangamCRM_DetailPage
        SangamCRM_DetailPage sangamCRMDetailPage = new SangamCRM_DetailPage(driver);

        // Navigate to the Sangam CRM detail page
        sangamCRMDetailPage.navigateToDetailPage();
        

        // Verify that the detail page is loaded
        Assert.assertTrue(sangamCRMDetailPage.isDetailPageLoaded(), "Sangam CRM detail page did not load as expected.");
    }
}
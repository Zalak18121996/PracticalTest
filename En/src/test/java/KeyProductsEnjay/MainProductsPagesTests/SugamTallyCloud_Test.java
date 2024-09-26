package KeyProductsEnjay.MainProductsPagesTests;

import KeyProductsEnjay.Base.BasePage;
import KeyProductsEnjay.MainProductsPages.SugamTallyCloud;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SugamTallyCloud_Test extends BasePage{
    @Test
    public void testNavigateToSugamTallyCloud() {
        // Create an instance of the ProductPage
        SugamTallyCloud productPage = new SugamTallyCloud(driver);

        // Hover and click on Sugam Tally Cloud
        productPage.hoverAndClickSugamTallyCloud();

        // Create an instance of the SugamTallyCloudPage to validate page load
        SugamTallyCloud SugamTallyCloud = new SugamTallyCloud(driver);

        // Verify the Sugam Tally Cloud page loaded
        Assert.assertTrue(SugamTallyCloud.isPageLoaded(), "Sugam Tally Cloud page did not load as expected.");
    }
}

package KeyProductsEnjay.MainProductsPagesTests;

import KeyProductsEnjay.Base.BasePage;
import KeyProductsEnjay.MainProductsPages.SynapseCallCenter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SynapseCallCenter_Test extends BasePage{
    @Test
    public void testNavigateToSynapseCallCenter() {
        // Create an instance of the ProductPage
        SynapseCallCenter productPage = new SynapseCallCenter(driver);

        // Hover and click on Synapse Call Center
        productPage.hoverAndClickSynapseCallCenter();

        // Create an instance of the SynapseCallCenterPage to validate page load
        SynapseCallCenter SynapseCallCenter = new SynapseCallCenter(driver);

        // Verify the Synapse Call Center page loaded
        Assert.assertTrue(SynapseCallCenter.isPageLoaded(), "Synapse Call Center page did not load as expected.");
    }

}

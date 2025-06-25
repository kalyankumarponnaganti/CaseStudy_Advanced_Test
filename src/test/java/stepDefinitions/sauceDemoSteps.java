package stepDefinitions;

import io.cucumber.java.en.*;

import static Reports.seleniumTest.*;
import static org.junit.Assert.assertEquals;
import static pages.cartPage.*;
import static pages.checkOutCompletePage.*;
import static pages.checkOutInfoPage.*;
import static pages.checkOutOverviewPage.*;
import static pages.loginCredentialsPage.*;
import static pages.productsPage.*;

public class sauceDemoSteps {

    @Given("User successfully enters the login credentials username {string} and password {string}")
    public void user_provides_login_details_sauce_demo_site(String username, String password) throws Exception {

                extent_reports("first.jpg","Initial Login Page");
                sendkeys_username(username);
                sendkeys_password(password);
                Thread.sleep(3000);
                extent_reports("login.jpg","User Credentials");
                click_login_btn();
                Thread.sleep(3000);
    }

    @When("User adds items to cart and checkout")
    public void user_adds_items() throws Exception {
        extent_reports("products.jpg", "Products Page");
        click_add_items_btn();
        extent_reports("additems.jpg", "Added Items");
        Thread.sleep(3000);
        click_cart_btn();
        extent_reports("cartbt.jpg","Cart Filled");
        Thread.sleep(3000);
        click_checkout_btn();
        Thread.sleep(3000);
    }

//    @And("User proceeds to fills information and continue")
    @And("User proceeds to fills information firstname {string} and lastname {string} and postalcode {string} and continue")
    public void user_checks_fill_info(String firstname, String lastname, String postalcode) throws Exception {
        extent_reports("fillinfo.jpg", "User Info to get products");
        sendkeys_firstName(firstname);
        sendkeys_lastName(lastname);
        sendkeys_postalCode(postalcode);
        extent_reports("details.jpg", "User Information to deliver");
        click_continue_btn();
        Thread.sleep(3000);
        extent_reports("finish.jpg", "Finish Action");
        click_finish_btn();
        Thread.sleep(3000);
    }

    @Then("User should see order confirmation message \"THANK YOU FOR YOUR ORDER\"")
        public void order_confirmation_validation() throws Exception {
        extent_reports("ordervalid.jpg", "Order Confirmation");
        String actualFinishMsg = visibility_finish_msg();
            assertEquals(actualFinishMsg, "Thank you for your order!");
        }
}

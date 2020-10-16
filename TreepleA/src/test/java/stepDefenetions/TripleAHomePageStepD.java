package stepDefenetions;

import common.WebAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tripleAPage.TripleHomePage;

public class TripleAHomePageStepD extends WebAPI {

//    @Given("user enter url {string}")
//    public void user_enter_url(String string) {
//
//        TripleHomePage.HPuser_enter_url("https://northeast.aaa.com/");
//    }
//
//    @When("user land on AAAHomePage")
//    public void user_land_on_AAAHomePage() {
//
//        TripleHomePage.HPuser_land_on_AAAHomePage();
//    }
//
//    @Then("user should see {string}")
//    public void user_should_see(String string) {
//
//        TripleHomePage.HPuser_should_see("https://northeast.aaa.com/");
//    }
@Given("user enter url")
public void user_enter_url() {
    TripleHomePage.HPuser_enter_url();
}

    @When("user land on AAAHomePage")
    public void user_land_on_AAAHomePage() {
       TripleHomePage.HPuser_land_on_AAAHomePage();
    }

    @Then("user should see home page")
    public void user_should_see_home_page() {
       TripleHomePage.HPuser_should_see();
    }


}

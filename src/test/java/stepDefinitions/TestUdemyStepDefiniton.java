package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestUdemyStepDefiniton {
    @Given("Udemy web sitesine git")
    public void udemy_web_sitesine_git() {
        System.out.println("hi");
    }
    @When("arama kutucuguna tikla")
    public void arama_kutucuguna_tikla() {
        System.out.println("hi");
    }
    @When("yazilim yaz ve ara")
    public void yazilim_yaz_ve_ara() {
        System.out.println("hi");
    }
    @Then("Yazilim kuslarinin geldigini kontrol et")
    public void yazilim_kuslarinin_geldigini_kontrol_et() {
        System.out.println("hi");
    }
}

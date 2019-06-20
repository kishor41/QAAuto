package com.StepDefinations;

import com.Pages.Register_Page;
import com.driverClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


public class Register extends driverClass {
    Register_Page RegisterPage = PageFactory.initElements(driver, Register_Page.class);


    @Given("^I goto URL as \"([^\"]*)\"$")
    public void iGotoURLAs(String URL)  {


        RegisterPage.GotoURL(URL);
    }

    @When("^I Click Register Button$")
    public void iClickRegisterButton() {
        RegisterPage.ClickRegisterButton();

    }


    @Given("^Enter Firstname as \"([^\"]*)\"$")
    public void enterFirstnameAs(String Firstname)  {
        driver.findElement(By.name("first_name")).sendKeys(Firstname);
    }

    @Given("^Enter Lastname as \"([^\"]*)\"$")
    public void enterLastnameAs(String Lastname) {
        driver.findElement(By.name("last_name")).sendKeys(Lastname);
    }

    @Given("^Enter email id as \"([^\"]*)\"$")
    public void enterEmailIdAs(String Email)  {
        driver.findElement(By.name("email")).sendKeys(Email);
    }

    @Given("^Enter password as \"([^\"]*)\"$")
    public void enterPasswordAs(String password) {
        driver.findElement(By.name("pass1")).sendKeys(password);
    }

    @Given("^Enter confirm password as \"([^\"]*)\"$")
    public void enterConfirmPasswordAs(String password)  {
        driver.findElement(By.name("pass2")).sendKeys(password);
    }

    @When("^click Register Button$")
    public void clickRegisterButton() {
        driver.findElement(By.name("btn-submit")).click();

    }

    @Then("^I should see my Account Button$")
    public void iShouldSeeMyAccountButton() {
          driver.findElement(By.xpath("//*[@id=\"post-2603\"]/h1"));
    }

    @Then("^I should see my Logout Button$")
    public void iShouldSeeMyLogoutButton() {

    }

    @Then("^I should see firstname as header$")
    public void iShouldSeeFirstnameAsHeader() {

    }


    @Then("^I should not see the signin Button$")
    public void iShouldNotSeeTheSigninButton() {
    }


    @When("I Click Contact us Button")
    public void iClickContactUsButton() {
        driver.findElement(By.linkText("Contact us")).click();

    }




    @Given("^I select \"([^\"]*)\" from subject heading drop down$")
    public void iSelectFromSubjectHeadingDropDown(String arg0){
    }
}

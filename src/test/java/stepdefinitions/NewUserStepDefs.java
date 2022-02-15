package stepdefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPageElements;
import pages.UserManagementPage;
import utilities.Driver;
public class NewUserStepDefs {
    CommonPageElements commonPageElements = new CommonPageElements();
    UserManagementPage userManagementPage = new UserManagementPage();
    Faker faker = new Faker();
    @Given("navigates to Administration")
    public void navigates_to_administration() {
        Driver.wait(3);
        Driver.waitAndClick(commonPageElements.administrationDropdown);
        Driver.wait(3);
        Driver.waitAndClick(commonPageElements.userManagementButton);
    }
    @Given("navigates to'Create or Edit user page'")
    public void navigates_to_create_or_edit_user_page() {
        Driver.wait(3);
        Driver.waitAndClick(userManagementPage.createNewUserButton);
    }
    @Given("user enters login as {string}")
    public void user_enters_login_as(String string) {
        Driver.wait(2);
        Driver.waitAndSendText(userManagementPage.loginId,string);
    }
    @Given("user enters firstname as {string} and lastname as {string}")
    public void user_enters_firstname_as_and_lastname_as(String string, String string2) {
        Driver.wait(2);
        Driver.waitAndSendText(userManagementPage.firstName,string);
        Driver.wait(2);
        Driver.waitAndSendText(userManagementPage.lastName,string2);
    }
    @Given("user enters email address as {string}")
    public void user_enters_email_address_as(String string) {
        Driver.wait(2);
        Driver.waitAndSendText(userManagementPage.email,faker.internet().emailAddress());
    }
    @Given("user clicks on language dropdown and select language")
    public void user_clicks_on_language_dropdown_and_select_language() {
        Driver.wait(2);
        Driver.selectByVisibleText(userManagementPage.language,"English");
    }
    @Given("user clicks on profiles and select profile")
    public void user_clicks_on_profiles_and_select_profile() {
        Driver.wait(2);
        Driver.selectByIndex(userManagementPage.profiles,1);
    }
    @Then("user clicks on save button")
    public void user_clicks_on_save_button() {
        Driver.wait(2);
        Driver.waitAndClick(userManagementPage.saveButton);
    }
    @Then("verify new user creation is successful")
    public void verify_new_user_creation_is_successful() {
        Driver.wait(2);
        //Assert.assertTrue(userManagementPage.successMessageToaster.isDisplayed());
        WebElement successMessage = Driver.getDriver().findElement(By.xpath("//div[@role='alert']"));
        Assert.assertTrue(successMessage.isDisplayed());
        System.out.println(successMessage.getText());
    }
}
package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import linkedinlearning.cucumbercourse.RestaurantMenuItem;
import linkedinlearning.cucumbercourse.RestaurantMenu;
import org.junit.jupiter.api.Assertions;

public class MenuManagementSteps {
    RestaurantMenuItem newMenuItem;
    RestaurantMenu locationMenu = new RestaurantMenu();
    String errorMessage;

    public MenuManagementSteps(){
        System.out.println("MenuManagementSteps constructor called");
    }

    @Given("I have a menu item with name {string} a description {string} and price {int}")
    public void i_have_a_menu_item_with_name_a_description_and_price(String itemName, String description, Integer price) {
        newMenuItem = new RestaurantMenuItem(itemName, description, price);
        System.out.println("Step 1");
    }

    @When("I add that menu item")
    public void i_add_that_menu_item() {
        try {
            locationMenu.addMenuItem(newMenuItem);
        } catch (IllegalArgumentException exception) {
            errorMessage = exception.getMessage();
        }

        System.out.println("Step 2");
    }

    @Then("A menu item with the name {string} should be added")
    public void a_menu_item_with_the_name_should_be_added(String string) {
        boolean exists = locationMenu.doesItemExist(newMenuItem);
        System.out.println("Step 3: Item exists? :" + exists);
    }

    @Then("I should see an error message with value {string}")
    public void i_should_see_an_error_message_with_value(String errorMessage) {
        Assertions.assertEquals("Duplicate item", errorMessage);
    }
}
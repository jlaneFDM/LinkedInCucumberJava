package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class DataTableSteps {
    @Given("I placed an order for the following items")
    public void i_placed_an_order_for_the_following_items(io.cucumber.datatable.DataTable dataTable) {
       List<Map<String,String>> billData = dataTable.asMaps(String.class, String.class);

        for (Map<String,String > billItems: billData) { //row
            for (Map.Entry<String,String> billItem: billItems.entrySet()) { //column
                System.out.println(billItem.getKey() + "\n" + billItem.getValue());
            }
        }
    }
    @When("I generate the bill")
    public void i_generate_the_bill() {
        System.out.println("i generate bill function called");
    }
    @Then("a bill for ${int} should be generated")
    public void a_bill_for_$_should_be_generated(Integer int1) {
        System.out.println("a bill for $ should be generated function called");
    }
}

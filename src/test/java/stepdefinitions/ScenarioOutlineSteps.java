package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import linkedinlearning.cucumbercourse.BillCalculationHelper;
import org.junit.jupiter.api.Assertions;

public class ScenarioOutlineSteps {
    double initialBillAmount;
    double taxRate;
    @Given("I have a Customer")
    public void i_have_a_customer() {
        System.out.println("Congrats: you have a customer.");
    }
    @And("user enters initial bill amount as {double}")
    public void user_enters_initial_bill_amount_as(double initialBillAmount) {
        this.initialBillAmount = initialBillAmount;

    }
    @And("sales tax rate is {double} percent")
    public void sales_tax_rate_is_percent(double taxRate) {
        this.taxRate = taxRate;
    }
    @Then("final bill amount calculated is {double}")
    public void final_bill_amount_calculated_is(Double expectedValue) {
        double systemCalcValue =
                BillCalculationHelper
                        .calculateBillForCustomer(this.initialBillAmount, this.taxRate);
        System
                .out
                .println
                        ("Expected value: " + expectedValue + "\n"
                                + "System calculated value: " + systemCalcValue);

        Assertions.assertTrue(expectedValue == systemCalcValue);
    }
}

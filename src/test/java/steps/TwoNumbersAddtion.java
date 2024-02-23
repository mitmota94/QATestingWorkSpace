package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class TwoNumbersAddtion {

    private int numberOne;
    private int numbertwo;
    private int result;
    @Given("user has number on as {int}")
    public void userHasNumberOnAs(int num1) {
        numberOne = num1;
    }

    @And("user has number two as {int}")
    public void userHasNumberTwoAs(int num2) {
        numbertwo = num2;
    }

    @When("user adds number one and number two")
    public void userAddsNumberOneAndNumberTwo() {
        result = numberOne + numbertwo;
    }

    @Then("the result is {int}")
    public void theResultIs(int num3) {
        Assertions.assertEquals(30,result);
    }
}

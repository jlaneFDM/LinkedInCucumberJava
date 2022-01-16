package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class RestaurantSystemHooks {
    /*hooks will run before Background and before step definitions*/
    @Before("@SmokeTest") //make sure to import from cucumber and not junit
    public void beforeDisplayMessage(Scenario scenario){
        System.out.println("Before: " + scenario.getName());
    }
    @After("@SmokeTest")
    public void afterDisplayMessage(Scenario scenario){
        System.out.println("After: " + scenario.getName());
    }

    /*Use Background for when non-technical stakeholders need to see initialization
    * use Hooks for programming specific execution*/
}

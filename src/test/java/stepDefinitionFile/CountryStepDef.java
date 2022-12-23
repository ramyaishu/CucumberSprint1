package stepDefinitionFile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CountryStepDef
{
    String[] countries = {"China", "Egypt", "France", "Germany", "India", "Japan", "Kenya", "Mexico", "United Kingdom", "United States"};
    String[] capitals = {"Beijing", "Cairo", "Paris", "Berlin", "New Delhi", "Tokyo", "Nairobi", "Mexico City", "London", "Washington D.C."};
    String[] languages = {"Chinese", "Arabic", "French", "German", "Hindi", "Japanese", "Swahili", "Spanish", "English", "English"};
    List<String > listCountries;
    List<String > listCapitals;
    List<String > listLanguages;
    int index;
    @Given("^User Need To crete Four arrays$")
    public void user_Need_To_crete_Four_arrays() throws Throwable
    {
        listCountries = new ArrayList<>(Arrays.asList(countries));
        listCapitals = new ArrayList<>(Arrays.asList(capitals));
        listLanguages = new ArrayList<>(Arrays.asList(languages));


    }

    @When("^User need to Pick random Number$")
    public void user_need_to_Pick_random_Number() throws Throwable
    {
         Random r = new Random();
         index = r.nextInt(11);

    }

    @Then("^User needs to print country details for corresponding Random number$")
    public void user_needs_to_print_country_details_for_corresponding_Random_number() throws Throwable
    {
        System.out.println("Country:"+"---"+listCountries.get(index));
        System.out.println("Capital:"+"----"+listCapitals.get(index));
        System.out.println("Language:"+"----"+listLanguages.get(index));

    }


}

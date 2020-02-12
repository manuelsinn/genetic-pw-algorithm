import org.junit.Before;
import org.junit.Test;

import java.util.SplittableRandom;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class TestGaussianMutation {
    GaussianMutation gm;
    Population population;
    String solution;

    @Before
    public void givenDeterministicMutation(){
        gm = new GaussianMutation(1.0); //this way the random element in the function under test is eliminated
        solution = "password";
        population = new Population(100, solution.length());
    }


    @Test
    public void whenIndividualIsPassword_ThenMutate(){
        String originalIndividual = "password"; //arrange
        String mutatedIndividual = gm.randomlyMutateIndividual(originalIndividual); //act
        assertThat(mutatedIndividual, is(not(equalTo(originalIndividual)))); //assert
    }

    @Test
    public void whenMutate_ThenChangedReferencedPopulation(){
        Population oldPopulation = new Population(population);  //arrange
        gm.mutate(population);  //act
        assertThat(population, is(not(equalTo(oldPopulation)))); //assert
    }


}

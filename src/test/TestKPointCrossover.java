import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class TestKPointCrossover {

    @Test
    public void cutPasswordInto2Chunks(){
        //arrange
        KPointCrossover crossover = new KPointCrossover(2, 8);
        String parent = "passxxxx";
        List<String> expected = new ArrayList<>();
        expected.add("pass");
        expected.add("xxxx");

        //act
        List<String> cutUp = crossover.cutParentIntoChunks(parent);

        //assert
        assertThat(cutUp, is(equalTo(expected)));
    }

    @Test
    public void cutPasswordInto4Chunks(){
        //arrange
        KPointCrossover crossover = new KPointCrossover(4, 8);
        String parent = "passxxxx";

        List<String> expected = new ArrayList<>();
        expected.add("pa");
        expected.add("ss");
        expected.add("xx");
        expected.add("xx");

        //act
        List<String> cutUp = crossover.cutParentIntoChunks(parent);

        //assert
        assertThat(cutUp, is(equalTo(expected)));
    }
}

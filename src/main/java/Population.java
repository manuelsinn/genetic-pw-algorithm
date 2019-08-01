import java.util.ArrayList;
import java.util.List;

public class Population {
    String best = "";

    public int gen = 1;

    int fitnessSum = 0;

    List<String> individuals = new ArrayList<>();

    public Population(){
    }


    public Population(String[] individuals) {
        for(String individual : individuals){
            add(individual);
        }
    }

    public void add(String individual){
        individuals.add(individual);
    }


}

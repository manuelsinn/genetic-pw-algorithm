import com.google.common.base.Splitter;

import java.util.ArrayList;
import java.util.List;

public class KPointCrossover implements Crossover{
    int numberOfPoints;

    KPointCrossover(int k){
        if(8 % k == 0) this.numberOfPoints = k;
        else System.out.println("k must be even");
    }

    @Override
    public void makeBabies(Population p) {
        System.out.println("Babies are made from all these parents.");
        // individuals are now half the original population
        List<String> individuals = p.individuals;

        int numberOfParents = individuals.size();
        for (int i = 0; i < numberOfParents; i += 2) {
            individuals.add(makeBaby(individuals.get(i), individuals.get(i+1)));
        }
    }

    public String makeBaby(String d, String m){
        List<String> dad = cutParentIntoChunks(d);
        List<String> mum = cutParentIntoChunks(m);
        String baby = "";
        for (int i = 0; i < dad.size(); i++) {
            if(i % 2 == 0) baby += dad.get(i);
            else baby += mum.get(i);
        }
        return baby;
    }

    public List<String> cutParentIntoChunks(String parent) {
        List<String> cutUp = new ArrayList<>(Splitter.fixedLength(parent.length() / numberOfPoints).splitToList(parent));
        return cutUp;
    }
}

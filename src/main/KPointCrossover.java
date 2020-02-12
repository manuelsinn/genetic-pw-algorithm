import java.util.ArrayList;
import java.util.List;

public class KPointCrossover extends Crossover {
    int numberOfPoints = 2;

    KPointCrossover(int k, int pwLength) {
        if (pwLength % k == 0) this.numberOfPoints = k;
        else System.out.println("k must be even");
    }

    @Override
    public String makeBaby(String d, String m) {
        List<String> dad = cutParentIntoChunks(d);
        List<String> mum = cutParentIntoChunks(m);
        String baby = "";
        for (int i = 0; i < dad.size(); i++) {
            if (i % 2 == 0) baby += dad.get(i);
            else baby += mum.get(i);
        }
        return baby;
    }

    public List<String> cutParentIntoChunks(String parent) {
        int size = parent.length() / numberOfPoints;

        ArrayList<String> split = new ArrayList<>(); //OLD with Guava: new ArrayList<>(Splitter.fixedLength(parent.length() / numberOfPoints).splitToList(parent));
        for (int i = 0; i <= parent.length() / size; i++) {
            String toAdd = parent.substring(i * size, Math.min((i + 1) * size, parent.length()));
            if (!toAdd.equals(""))
                split.add(toAdd);
        }
        return split;
    }
}

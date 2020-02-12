//import com.google.common.base.Splitter;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class KPointCrossover extends Crossover{
//    int numberOfPoints = 2;
//
//    KPointCrossover(int k, int pwLength){
//        if(pwLength % k == 0) this.numberOfPoints = k;
//        else System.out.println("k must be even");
//    }
//
//    @Override
//    public String makeBaby(String d, String m){
//        List<String> dad = cutParentIntoChunks(d);
//        List<String> mum = cutParentIntoChunks(m);
//        String baby = "";
//        for (int i = 0; i < dad.size(); i++) {
//            if(i % 2 == 0) baby += dad.get(i);
//            else baby += mum.get(i);
//        }
//        return baby;
//    }
//
//    public List<String> cutParentIntoChunks(String parent) {
//        List<String> cutUp = new ArrayList<>(Splitter.fixedLength(parent.length() / numberOfPoints).splitToList(parent));
//        return cutUp;
//    }
//}

//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//
//public class TestKPointCrossover {
//    public static void testCutParentIntoKChunks(int k){
//        String parent = "passxxxx";
//        KPointCrossover crossover = new KPointCrossover(k, 8);
//        List<String> cutParent = crossover.cutParentIntoChunks(parent);
//
//        List<String> expected = new ArrayList<>();
//        if(k == 2){
//            expected.add("pass");
//            expected.add("xxxx");
//        } else if (k == 4){
//            expected.add("pa");
//            expected.add("ss");
//            expected.add("xx");
//            expected.add("xx");
//        }
//
//        System.out.println(cutParent);
//        assertEquals(cutParent, expected);
//    }
//
//    public static void main(String[] args) {
//        testCutParentIntoKChunks(2);
//        testCutParentIntoKChunks(4);
//
//    }
//}

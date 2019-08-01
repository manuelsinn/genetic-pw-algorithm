import static org.junit.Assert.assertEquals;

public class TestKPointCrossover {
    public void testCutParentIntoKChunks(){
        KPointCrossover crossover = new KPointCrossover(2);

        String parent = "passxxxx";
        String[] cutParent = crossover.cutParentIntoChunks(parent);
        System.out.println(cutParent);
        assertEquals(cutParent, new String[]{"pass", "xxxx"});
    }

    public static void main(String[] args) {
        /*
        TestKPointCrossover test = new TestKPointCrossover();
        test.testCutParentIntoKChunks();
        System.out.println(test);
        */

        KPointCrossover crossover = new KPointCrossover(2);
        String parent = "passxxxx";
        String[] cutParent = crossover.cutParentIntoChunks(parent);
        System.out.println(cutParent);
    }
}

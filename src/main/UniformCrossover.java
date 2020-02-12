public class UniformCrossover extends Crossover {

    @Override
    /** baby gets either the dad's or the mum's character at each position (50-50 chance) */
    public String makeBaby(String dad, String mum) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < dad.length(); i++) {
            if (Math.random() > 0.5)
                sb.append(dad.charAt(i));
            else
                sb.append(mum.charAt(i));
        }
        return sb.toString();
    }
}

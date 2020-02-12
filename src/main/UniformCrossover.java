public class UniformCrossover extends Crossover {
    @Override
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

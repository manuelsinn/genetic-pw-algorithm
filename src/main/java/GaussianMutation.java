public class GaussianMutation implements Mutation {
    static double mutationRate = 0.05;

    /** goes through all individuals of population p and with probability mutationRate changes **/
    @Override
    public void mutate(Population p) {
        for(int populationIdx = 0; populationIdx < p.individuals.size(); populationIdx++){

            char[] individual = p.individuals.get(populationIdx).toCharArray();

            for (int characterIdx = 0; characterIdx < individual.length; characterIdx++) {
                double random = Math.random();
                if (random < mutationRate) {
                    char rnd = getRandomLetter();
                    individual[characterIdx] = rnd;
                }
            }

            p.individuals.set(populationIdx, new String(individual));
        }
    }

    private char getRandomLetter() {
        return (char) (int) (Math.random() * 26 + 97);
    }


}

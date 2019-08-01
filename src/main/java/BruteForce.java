public class BruteForce {

    public int neededTriesForSolution(String solution) {
        int tries = 0;

        int i = 0;
        while (i < solution.length()) {

            for (int ltr = 0; ltr < 26; ltr++) {
                if (solution.charAt(i) == (char) (ltr + 97))
                    break;
                tries++;
            }


            i++;
        }

        return tries;
    }
}

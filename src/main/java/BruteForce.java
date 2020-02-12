public class BruteForce {

    /** going through the letters of the solution-password one after the next,
     * every time going through each letter of the alphabet until the correct one is found.
     * @param solution
     */
    public void printNeededTriesForSolution(String solution) {
        int tries = 0;

        int i = 0;
        while (i < solution.length()) {

            for (int letter = 0; letter < 26; letter++) {
                tries++;
                if (solution.charAt(i) == getCharFromInt(letter))
                    break;
            }
            i++;
        }

        System.out.println("Needed tries with brute force: " + tries);
    }

    public char getCharFromInt(int c){
        return (char) (c + 97);
    }
}

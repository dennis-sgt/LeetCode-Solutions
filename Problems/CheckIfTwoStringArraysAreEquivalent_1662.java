public class CheckIfTwoStringArraysAreEquivalent_1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder word_1 = new StringBuilder();
        StringBuilder word_2 = new StringBuilder();
        for (String s : word1) {
            word_1.append(s);
        }

        for (String s : word2) {
            word_2.append(s);
        }

        return word_1.toString().equals(word_2.toString());
    }
}

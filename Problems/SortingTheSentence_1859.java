public class SortingTheSentence_1859 {
    public String sortSentence(String s) {
        String[] split = s.split(" ");
        String[] ans = new String[split.length];

        for(String string : split) {
            int num = Character.getNumericValue(string.charAt(string.length() - 1)) - 1;

            ans[num] = string.substring(0, string.length() - 1);
        }

        return String.join(" ", ans);
    }
}

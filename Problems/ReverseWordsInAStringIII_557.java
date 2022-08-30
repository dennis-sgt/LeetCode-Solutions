public class ReverseWordsInAStringIII_557 {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String output = "";

        for (int i = 0; i < arr.length; i++) {
            for (int k = arr[i].length() - 1; k >= 0; k--) {
                output += arr[i].charAt(k);
            }
            output += " ";
        }
        return output.trim();
    }
}

public class ReverseWordsInAStringIII_557 {
    public String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder builder = new StringBuilder();

        for(String string : split) {
            builder.append(new StringBuilder(string).reverse().toString());
            builder.append(" ");
        }

        return builder.toString().trim();
    }
}

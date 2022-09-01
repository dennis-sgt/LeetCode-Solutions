public class ValidPalindrome_125 {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        if(s.isEmpty()) {
            return true;
        }

        for(char c : s.toLowerCase().toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }

        boolean output = sb.toString().equals(sb.reverse().toString());

        return output;
    }
}

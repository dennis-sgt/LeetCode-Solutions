public class ShuffleString_1528 {
    public String restoreString(String s, int[] indicies) {
        char[] charArr = new char[s.length()];

        for(int i = 0; i < s.length(); i++) {
            charArr[indicies[i]] = s.charAt(i);
        }

        return new String(charArr);
    }
}

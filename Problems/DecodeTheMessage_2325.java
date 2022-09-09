public class DecodeTheMessage_2325 {
    public String decodeMessage(String key, String message) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> map = new HashMap<>();

        key = key.replaceAll(" ", "");
        char c = 'a';

        for(int i = 0; i < key.length(); i++) {
            if(!map.containsKey(key.charAt(i))) {
                map.put(key.charAt(i), c++);
            }
        }

        for(int i = 0; i < message.length(); i++) {
            if(map.containsKey(message.charAt(i))) {
                sb.append(map.get(message.charAt(i)));
            } else {
                sb.append(message.charAt(i));
            }
        }

        return sb.toString();
    }
}

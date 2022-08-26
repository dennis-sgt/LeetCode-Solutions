package Problems;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones_771 {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(char c : jewels.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for(char c : stones.toCharArray()) {
            if(map.containsKey(c)) {
                ans++;
            }
        }

        return ans;
    }
}

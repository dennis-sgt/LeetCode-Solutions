public class CountItemsMatchingRule_1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int output = 0;

        for (int i = 0; i < items.size(); i++) {
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) {
                output++;
            }else if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) {
                output++;
            }
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) {
                output++;
            }
        }

        return output;
    }
}

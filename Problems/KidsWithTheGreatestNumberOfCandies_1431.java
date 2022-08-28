public class KidsWithTheGreatestNumberOfCandies_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Integer> list = new LinkedList<>();

        List<Boolean> boo = new LinkedList<>();

        for(int i : candies) {
            list.add(i);
        }

        int max = Collections.max(list);

        for(int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= max) {
                boo.add(true);
            } else {
                boo.add(false);
            }
        }

        return boo;
    }
}

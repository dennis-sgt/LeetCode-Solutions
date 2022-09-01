public class BinarySearch_704 {
    public int search(int[] nums, int target) {
        List<Integer> list = new LinkedList<>();

        for(int i : nums) {
            list.add(i);
        }

        if(list.contains(target)) {
            return list.indexOf(target);
        } else {
            return -1;
        }
    }
}

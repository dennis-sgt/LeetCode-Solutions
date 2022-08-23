public class RichestCustomerWealth_1672 {
    public static int maximumWealth(int[][] accounts) {
        List<Integer> list = new LinkedList<>();
        int sum = 0;
        //Durch die Länge des gesamten Arrays loopen
        for (int[] account : accounts) {
            //Durch die jeweiligen Blöcke loopen
            for (int j = 0; j < account.length; j++) {
                sum += account[j];
            }
            list.add(sum);
            sum = 0;
        }
        return Collections.max(list);
    }
}

public class SubtractTheProductAndSumOfDigitsOfAnInteger_1281 {
    public int substractProductAndSum(int n) {
        int sum = 0;
        int product = 1;

        for(char c : (n + "").toCharArray()) {
            sum += Character.getNumericValue(c);
            product *= Character.getNumericValue(c);
        }

        return product - sum;
    }
}

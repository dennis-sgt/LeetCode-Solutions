public class NumberOfStepsToReduceANumberToZero_1342 {
    class Solution {
        public int numberOfSteps(int num) {
            int steps = 0;
            while(num > 0) {
                if(num % 2 == 0) {
                    num /= 2;
                    steps++;
                } else if(num % 2 != 0) {
                    num -= 1;
                    steps++;
                }
            }
            return steps;
        }
    }
}

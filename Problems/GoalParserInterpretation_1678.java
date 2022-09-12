public class GoalParserInterpretation_1678 {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();

        char[] arr = command.toCharArray();

        for (int i = 0; i < command.length(); i++) {
            if (arr[i] == 'G') sb.append("G");
            else if (i < command.length() - 1 && arr[i] == '(' && arr[i + 1] == ')') sb.append("o");
            else if (i < command.length() - 3 && arr[i] == '(' && arr[i + 1] == 'a' && arr[i + 2] == 'l' && arr[i + 3] == ')')
                sb.append("al");
        }

        return sb.toString();
    }
}

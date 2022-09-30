public class Q2011_FinalValueOfVariableAfterPerformingOperations {

    public int finalValueAfterOperations(String[] operations) {
        int sum = 0;

        for (String s : operations) {
            if (s.contains("+"))
                sum++;
            else
                sum--;
        }

        return sum;
    }

}

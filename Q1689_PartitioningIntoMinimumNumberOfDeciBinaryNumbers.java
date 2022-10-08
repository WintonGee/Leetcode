public class Q1689_PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

    public int minPartitions(String n) {
        int highestNum = 0;
        for (char c : n.toCharArray()) {
            highestNum = Math.max(highestNum, c - '0');
        }
        return highestNum;
    }

}

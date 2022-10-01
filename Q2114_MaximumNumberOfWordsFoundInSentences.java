public class Q2114_MaximumNumberOfWordsFoundInSentences {

    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;

        for (String s : sentences) {
            maxCount = Math.max(maxCount, s.split(" ").length);
        }

        return maxCount;
    }

}

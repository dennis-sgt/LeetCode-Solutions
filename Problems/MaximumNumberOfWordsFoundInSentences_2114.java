public class MaximumNumberOfWordsFoundInSentences_2114 {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for(int i = 0; i < sentences.length; i++) {
            if(sentences[i].split(" ").length > max) {
                max = sentences[i].split(" ").length;
            }
        }

        return max;
    }
}

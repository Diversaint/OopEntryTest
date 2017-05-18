package task;

/**
 * Created by Vorobiei on 18.05.2016.
 */
public class TextUtils {
    /**
     * Method contains inside of its body three another methods.
     * Each of this method defined below.
     *
     * @param  text
     * @return sorted by natural order array of unique words
     * */
    public static String[] getUniqueSortedWords(String text) {
//        TODO find mistake and correct it, so the method works correctly
        String[] words = getWords(text);
        String[] uniqueWords = getUniqueWords(words);
        return sortWords(words);
    }
    /**
     * @param text
     * @return array with words, get from receive text
     *          if received argument is null
     *          or text length is zero
     *          return array with zero length
     * */
    public static String[] getWords(String text) {

//        TODO write your code here

        // check null and length of string
        if (text == null || text.length() == 0)
            return new String[0];

        // Do
        String[] words = text.split("; ");

        return words;
    }
    /**
     * @param words array with words
     * @return  array with unique words
     * */
    public static String[] getUniqueWords(String[] words) {

//        TODO write your code here
        //check null and array length
        if (words == null || words.length == 0)
            return new String[0];

        int counterOfUniqueWords = 0;
        String[] tempWords = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            if (!checkEquals(words[i], tempWords)) {
                tempWords[counterOfUniqueWords++] = words[i];
            }
        }


        return cutAndCopyWords(counterOfUniqueWords, tempWords);
    }

    private static String[] cutAndCopyWords(int counterOfUniqueWords, String[] tempWords) {
        String[] result = new String[counterOfUniqueWords];
        for (int i = 0; i < counterOfUniqueWords; i++) {
            result[i] = tempWords[i];
        }
        return result;
    }

    private static boolean checkEquals (String word, String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (word.equals(words[i]))
                return true;
        }
        return false;
    }

     /**
     * @param  uniqueWords array with unique words
     * @return sorted by natural order array of unique words
     * */
    public static String[] sortWords(String[] uniqueWords) {

//        TODO write your code here
        //check for null
        if (uniqueWords == null)
            return new String[0];

        //do

        String tempWord = "";
        for (int i = 0; i < uniqueWords.length - 1; i++) {
            for (int j = i + 1; j < uniqueWords.length; j++) {
                if (uniqueWords[i].compareTo(uniqueWords[j]) > 0) {
                    tempWord = uniqueWords[i];
                    uniqueWords[i] = uniqueWords[j];
                    uniqueWords[j] = tempWord;
                }
            }
        }

        return getUniqueWords(uniqueWords);
    }
}

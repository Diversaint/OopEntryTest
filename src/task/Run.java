package task;

import utils.FileUtils;

import java.io.*;
import java.util.Arrays;


public class Run {
    public static void main(String[] args) throws IOException {
//        Don't touch this code
        String text = FileUtils.readFile("src/resources/WarAndPeace.txt");
//        You can give to getUniqueSortedWords your own String (with delimiters "; ")
        String[] result = TextUtils.getUniqueSortedWords(text);
        System.out.println(Arrays.toString(result));
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String result = theLongestDistinctSubstring("hganmkkssaksnuy");
        System.out.println(result + " -> result");
    }

    private static String theLongestDistinctSubstring(String word){
        String[] wordAsArray = word.split("");
        String newString = "";
        List<String> substrings = new ArrayList<>();
        for (int i = 0; i < wordAsArray.length; i++) {
            if(containsChar(newString.split(""), wordAsArray[i])){
                substrings.add(newString);
                i = i - newString.length();
                newString = "";
            } else {
                newString += word.charAt(i);
                if(i == word.length() - 1){
                    substrings.add(newString);
                }
            }
        }
        substrings.forEach(each -> System.out.println(each));

        substrings.sort(Comparator.comparingInt(String::length));
        return substrings.get(substrings.size() - 1);
    }
    private static boolean containsChar(String[] wordAsArray, String letter){
        return Arrays.asList(wordAsArray).contains(letter);
    }
}

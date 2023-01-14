import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        String result = theLongestDistinctSubstring("hganmkkssaksnuy");
//        System.out.println(result + " -> result");

//        String result = dateFormatting("-date=20220720");
//        System.out.println(result + " result");
//
        List<Integer> list = new ArrayList<>();
        //list.add(1);
        //list.add(2);
        list.add(0);
        System.out.println(list.stream().noneMatch(each -> each == 0));

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

    private static String dateFormatting(String dateString){
        DateFormat paramDf = new SimpleDateFormat("yyyyMMdd");
        String dateParam = null;
        if (dateString.startsWith("-date")) {
            try {
                dateParam = dateString.substring(dateString.indexOf("=") + 1);
                dateParam = paramDf.format(dateParam);
                dateParam = paramDf.format(paramDf.parse(dateParam));
            } catch (IllegalArgumentException ex) {
                System.out.println("wrong data format");
            } catch (ParseException e) {
                System.out.println("ParseException");
            }
        }
        return dateParam;
    }
}

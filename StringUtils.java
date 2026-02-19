package week05;

import java.util.Arrays;

public class StringUtils {
    // Exercise 7
    public static String Reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            sb.append(c);
        }
        return sb.toString();
    }

    // Exercise 8
    public static String ExplodedString(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i + 1; j++) {
                sb.append(s.charAt(j));
            }
        }

        // for (int i = 0; i < s.length(); i++) {
        //     sb.append(s.substring(0, i + 1));
        // }

        return sb.toString();
    }

    // Exercise 9
    public static String SortString(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }

    // Exercise 10
    public static Boolean IsAnagram(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String temp1 = new String(ch1);
        String temp2 = new String(ch2);

        return temp1.equals(temp2);
    }

    // Exercise 11
    public static String MixedString(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 1) {
                result.append(
                    word.charAt(word.length() - 1)
                    + word.substring(1, word.length() - 1)
                    + word.charAt(0) 
                    + " "
                );
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s1 = "Baku";
        System.out.println(Reverse(s1));
        System.out.println(ExplodedString(s1));
        System.out.println(SortString(s1));
        String s2 = "akuB";
        System.out.println(IsAnagram(s1, s2));
        String s3 = "This is PP2 Fall 2021";
        System.out.println(MixedString(s3));
    }
}
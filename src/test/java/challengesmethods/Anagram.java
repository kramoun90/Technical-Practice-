package challengesmethods;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        isAnagram("cat", "act");
        isAnagram("CAT", "ACTA");
        isAnagram("ARMY", "MARY");
        isAnagram("CAT", "BAT");
        isAnagram("CATv", "BAvT");
    }

    public static boolean isAnagram(String str, String str2) {
        boolean status;
        if (str.length() != str2.length()) {
            status = false;
        } else {
            char[] char1 = str.toLowerCase().toCharArray();
            char[] char2 = str.toLowerCase().toCharArray();
            Arrays.sort(char1);
            Arrays.sort(char2);
            status = Arrays.equals(char1, char2);
        }
        System.out.println(str + " " + str2 + " " + status);
        return status;
    }
}

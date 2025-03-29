package ExampleTryOut;

import java.util.HashMap;
import java.util.Map;

public class FindDistinctValue {

    public static void main (String [] args) {
        String str1 = "abcdABCDabcdDFGwertbgfd";
        Map <Character, Integer> charCountMap = getCharCount(str1);

        System.out.println(charCountMap);
    }

    public static Map <Character, Integer> getCharCount (String str) {
        Map <Character, Integer> charCountMap = new HashMap<>();
        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }

        return charCountMap;
    }

}
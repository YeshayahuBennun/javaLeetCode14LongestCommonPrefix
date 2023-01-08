public class Solution {
    public static void main(String[] args) {
        String[] case1 = {"flower", "flow", "flight"};
        String[] case2 = {"dog", "raceCar", "car"};
        String[] case3 = {"a"};

        System.out.println(longestCommonPrefix(case1));

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        //prefix = from "flower" ---> ["flow"] we'll reduce three times the size of the string then flow.indexOf(flower)==0
        //then we'll increase the i to the next string ...
        //We will set our prefix to the first element of the array.
        String prefix = strs[0];
        //Loop for any string
        for (int i = 1; i < strs.length; i++) {
            //While the index of the prefix string is not equal to zero
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}

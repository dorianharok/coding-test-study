import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Sort(n));
        return strings;
    }
}

class Sort implements Comparator<String> {
    int index;

    public Sort(int index) {
        this.index = index;
    }

    @Override
    public int compare(String s1, String s2) {
        String[] word1 = s1.split("");
        String[] word2 = s2.split("");
        if(index < s1.length() && index < s2.length()){
            if(word1[index].equals(word2[index])){
                return s1.compareTo(s2);
            }
            return word1[index].compareTo(word2[index]);
        }
        return 0;
    }
}

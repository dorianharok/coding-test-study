// Solution 1
import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
         Comparator<String> comp = new Comparator<String>() {
             public int compare(String s1, String s2) {
                 char str1 = s1.charAt(n);
                 char str2 = s2.charAt(n);

                 if (str1 > str2)
                     return 1;
                 else if (str1 < str2)
                     return -1;
                 else return 0;
             }
         };

        Arrays.sort(strings);
        Arrays.sort(strings, comp);

        return strings;
    }
}


// Solution 2
import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        Comparator<String> comp = new Comparator<String>() {
            public int compare(String s1, String s2) {
                char str1 = s1.charAt(n);
                char str2 = s2.charAt(n);

                if (str1 > str2)
                    return 1;
                else if (str1 < str2)
                    return -1;
                else if (str1 == str2)
                    return s1.compareTo(s2); // n 위치에서 두 문자가 같은 경우에는 나머지 부분에 대한 정렬을 compareTo 메서드에게 맡김
                else return 0;
            }
        };

        Arrays.sort(strings, comp);

        return strings;
    }
}


// Solution 3

import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        Comparator<String> comp = new Comparator<String>() {
            public int compare(String s1, String s2) {
                char str1 = s1.charAt(n);
                char str2 = s2.charAt(n);

                if (str1 > str2)
                    return 1;
                else if (str1 < str2)
                    return -1;
                else
                    return s1.compareTo(s2);
            }
        };

        Arrays.sort(strings, comp);

        return strings;
    }
}


// Solution 4
import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1.charAt(n) > s2.charAt(n)) return 1;
                else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2); // n 위치에서 두 문자가 같은 경우에는 나머지 부분에 대한 정렬을 compareTo 메서드에게 맡김
                else if(s1.charAt(n) < s2.charAt(n)) return -1;
                else return 0;
            }
        });
        return strings;
    }
}


// Solution 4
import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1.charAt(n) > s2.charAt(n)) return 1;
                else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
                else return -1;
            }
        });
        return strings;
    }
}


// Solution 5
import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        Comparator<String> comp = (s1, s2) -> s1.charAt(n) - s2.charAt(n);

        Arrays.sort(strings);
        Arrays.sort(strings, comp);

        return strings;
    }
}


// Solution 6
import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        Arrays.sort(strings, (s1, s2) -> s1.charAt(n) - s2.charAt(n));

        return strings;
    }
}



import java.util.*;
 
class Solution {
    public int[] solution(String s) {
        int[] answer = makeTuple(s);
        return answer;
    }
    
    public int[] makeTuple(String s) {
        
        String[] splitStr = s.split("},");
        for (int i = 0; i < splitStr.length; i++) {
            String row = splitStr[i];
            row = row.replaceAll("\\{", "");
            row = row.replaceAll("\\}", "");
            splitStr[i] = row;
        }
 
        Arrays.sort(splitStr, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        
        
        List<Integer> list = new ArrayList<>();
        for (String row : splitStr) {
            String[] rowArr = row.split(",");
            for (String val : rowArr) {
                int element = Integer.parseInt(val);
                if (!list.contains(element)) {
                    list.add(element);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

// Solution 1

import java.util.*;

class Solution {
    public int[] solution(String s) {
        // 문자열 s를 배열 arr로 만들어주기
        s = s.substring(2, s.length() - 2).replace("},{", " ");
        String[] arr = s.split(" ");

        // 배열 arr 안의 문자열 원소를 length 기준으로 오름차순 정렬
        Arrays.sort(arr, Comparator.comparingInt(str -> str.length()));

        // 1차 결과를 담을 빈 answer 배열 생성
        ArrayList<Integer> answerList = new ArrayList<>();

        // 정렬된 배열 arr 안의 원소를 차례로 돌며 각 문자열 안의 , 제거
        for (String str : arr) {
            String[] strArr = str.split(",");
            // 위에서 만든 answer에 원소 추가해주기
            for (String num : strArr) {
                int n = Integer.parseInt(num);
                if (!answerList.contains(n)) {
                    answerList.add(n);
                }
            }
        }
        // ArrayList<Integer>를 int[]로 변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;

    }
}
/*
입력 문자열 파싱: O(N)
배열 정렬: O(N log N)
배열 순회: O(N)
원소를 답 리스트에 추가하는 중첩 루프: O(N)
총 시간 복잡도: O(N log N)
 */


// Solution 2
import java.util.*;
class Solution {
    public int[] solution(String s) {
        Set<String> set = new HashSet<>();
        String[] arr = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , ");

        Arrays.sort(arr, (a, b) -> { return a.length() - b.length();} );

        int[] answer = new int[arr.length];
        int idx = 0;
        for(String s1 : arr) {
            for(String s2 : s1.split(",")) {
                if(set.add(s2)) answer[idx++] = Integer.parseInt(s2);
            }
        }
        return answer;
    }
}
/*
입력 문자열 내의 문자 대체: O(N)
입력 문자열을 배열로 파싱: O(N)
배열 정렬: O(N log N)
배열 순회 및 중첩 루프로 원소를 답 배열에 추가: O(N)
총 시간 복잡도: O(N log N)
 */


// Solution 3 => 정렬이 없어서 가장 빠름!
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Solution {
    public int[] solution(String s) {

        Map<String, Integer> map = new HashMap<>();
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(s);
        
        while (matcher.find()) {
            String n = matcher.group();
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int size = map.size();
        int[] answer = new int[size];
        
        for (String key : map.keySet()) {
            answer[size - map.get(key)] = Integer.parseInt(key);
        }
        
        return answer;
    }
}
/*
정규식을 사용하여 입력 문자열에서 숫자 찾기: O(N)
고유한 숫자 및 그 빈도로 구성된 맵 생성: O(N)
맵에서 답 배열 작성: O(N)
총 시간 복잡도: O(N)
 */


// Solution 4
import java.util.*;
import java.util.stream.Stream;
class Solution {
    final Map<Integer, Integer> counts = new LinkedHashMap<>();
    
    public int[] solution(String s) {
        Stream.of(s.replaceAll("[}{]", "").split(",")).mapToInt(Integer::parseInt)
                .forEach(i -> counts.merge(i, 1, Integer::sum));
        return counts.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map(Map.Entry::getKey).mapToInt(x -> x).toArray();
    }
}
/*
입력 문자열에서 불필요한 문자 제거: O(N)
스트림을 사용하여 배열 처리 및 맵 작성: O(N)
맵 정렬: O(N log N)
정렬된 맵에서 답 배열 작성: O(N)
총 시간 복잡도: O(N log N)
 */
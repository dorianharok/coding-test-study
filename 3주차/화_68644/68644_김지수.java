// Solution 1 => set을 쓰면 굳이 미리 정렬할 필요 없다는 거 깜빡함!
import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        // 오름차순으로 정렬
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int n = numbers[i] + numbers[j];
                set.add(n);
            }
        }

        // Set을 ArrayList으로 변환하고 정렬
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList); // 배열은 Arrays.sort(), ArrayList는 Collections.sort() !!

        // ArrayList을 배열로 변환
        int[] answer = sortedList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}


// Solution 2
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}


// Solution 3 => HashSet이 아닌 TreeSet을 사용하면 add하면서 정렬도 같이 됨!
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
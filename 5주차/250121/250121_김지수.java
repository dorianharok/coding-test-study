// Solution 1
import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // indexOf()는 배열에 사용 불가
        List<String> list = Arrays.asList("code", "date", "maximum", "remain");

        ArrayList<Integer[]> answerList = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (data[i][list.indexOf(ext)] < val_ext) {
                answerList.add(Arrays.stream(data[i]).boxed().toArray(Integer[]::new));
            }
        }

        answerList.sort(Comparator.comparingInt(row -> row[list.indexOf(sort_by)]));

        int[][] answer = new int[answerList.size()][];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = Arrays.stream(answerList.get(i)).mapToInt(Integer::intValue).toArray();
        }

        return answer;
    }
}


// Solution 2
import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        HashMap<String, Integer> data_type = new HashMap<>();
        data_type.put("code", 0);
        data_type.put("date", 1);
        data_type.put("maximum", 2);
        data_type.put("remain", 3);

        List<int[]> filtered_data = new ArrayList<>();
        for (int[] d : data){
            if (d[data_type.get(ext)] < val_ext){
                filtered_data.add(d);
            }
        }

        filtered_data.sort(Comparator.comparingInt(arr -> arr[data_type.get(sort_by)]));

        return filtered_data.toArray(new int[0][]);
        // toArray 메서드의 매개변수로 크기가 0인 배열을 제공하면?
        // => 내부적으로는 실제 크기에 맞는 새로운 배열이 생성되고, 리스트의 요소들이 새로운 배열로 복사됨
    }
}


// Solution 3
import java.util.*;
class Solution {
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {

        List<int[]> list = new ArrayList<>();
        String[] s = {"code","date","maximum","remain"};
        int extIdx = 0, sortIdx = 0;

        for(int i = 0; i < 4; i++){
            if(ext.equals(s[i])) extIdx = i;
            if(sort_by.equals(s[i])) sortIdx = i;
        }
        final int si = sortIdx;

        for(int i = 0; i < data.length; i++){
            if(data[i][extIdx] < val_ext) list.add(data[i]);
        }

        // *lambda, Comparator 사용시 final 이나 effectively final이어야 한다!
        Collections.sort(list,(o1,o2)->o1[si]-o2[si]);

        return list;
    }
}


// Solution 4
import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<String> list = List.of("code", "date", "maximum", "remain");

        int extIndex = list.indexOf(ext);
        int sortIndex = list.indexOf(sort_by);

        return Arrays.stream(data)
                .filter(d -> d[extIndex] < val_ext)
                .sorted(Comparator.comparingInt(o -> o[sortIndex]))
                .toArray(int[][]::new);
    }
}


/* <자바 List 초기화 방법 3가지> (Java9부터 사용 가능) */

// 1. List<String> list = List.of("A", "B");
// 2. List<String> list2 = Arrays.asList("A", "B");
// 3. List<String> list3 = new ArrayList<>(){
//        {
//            add("A");
//            add("B");
//        }
//    };
import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        List<Integer> list = new ArrayList<>();
        for(int i=0; i< answers.length; i++){
            if(answers[i] == NumberOne(i)) answer[0]++;
            if(answers[i] == NumberTwo(i)) answer[1]++;
            if(answers[i] == NumberThree(i)) answer[2]++;
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<answer.length; i++){
            max = Math.max(answer[i], max);
        }
        for(int i=0; i<answer.length; i++){
            if(answer[i] == max) list.add(i+1);
        }
        return list.stream().mapToInt(i-> i).toArray();
    }
    private static int NumberThree(int index) {
        int[] arr = {3,3,1,1,2,2,4,4,5,5};
        return arr[index % arr.length];

    }

    private static int NumberTwo(int index) {
        int[] arr = {2,1,2,3,2,4,2,5};
        return arr[index % arr.length];
    }

    private static int NumberOne(int index) {
        return index % 5 + 1;
    }
}
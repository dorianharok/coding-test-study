// Solution 1
import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        int[] daysLeft = new int[speeds.length];

        for (int i = 0; i < speeds.length; i++) {
            // 자바에서 정수끼리 나눌 때 소수점 아래 버려지는 것 주의!
            daysLeft[i] = (int) Math.ceil( (double) (100 - progresses[i]) / speeds[i] );
            System.out.println(daysLeft[i]);
        }

        Stack<Integer> answerList = new Stack<>();
        int max = 0;

        for (int i = 0; i < daysLeft.length; i++) {
            if (max < daysLeft[i]) {
                max = daysLeft[i];
                answerList.push(1);
                continue;
            } else if (max >= daysLeft[i]) {
                if (!answerList.isEmpty()) {
                    int lastCnt = answerList.pop();
                    lastCnt++;
                    answerList.push(lastCnt);
                }
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}


// Solution 2
import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> q = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < speeds.length; i++) {
            double remain = (100 - progresses[i]) / (double) speeds[i];
            int date = (int) Math.ceil(remain);

            if (!q.isEmpty() && q.peek() < date) {
                answerList.add(q.size());
                q.clear();
            }

            q.offer(date);
        }

        answerList.add(q.size());

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}


// Solution 3
import java.util.*;
        import java.util.stream.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] arr = new int[progresses.length];
        int length = progresses.length;

        for(int i=0; i < length; i++) {
            arr[i] = (int)Math.ceil((100 - progresses[i]) / (double)speeds[i]);
        }

        List<Integer> list = new ArrayList<>();
        int pre = arr[0];
        int idx = 0;

        for(int i=1; i < length; i++) {
            if(arr[i] <= pre) {
                continue;
            }

            list.add(i - idx);
            pre = arr[i];
            idx = i;
        }

        list.add(length - idx);

        return list.stream().mapToInt(i->i).toArray();
    }
}


// Solution 4 모듈화 코드인데..어렵다..
import java.lang.System;
        import java.lang.Math;
        import java.util.ArrayList;
class Solution {

    int progressesCount;
    int[] needDays;

    ArrayList<Integer> workCountStorage;

    public int[] solution(int[] progresses, int[] speeds) {

        //Init
        progressesCount = progresses.length;
        needDays = new int[progressesCount];
        workCountStorage = new ArrayList<>();


        //필요한 작업일 계산
        this.calcNeedDays(progresses, speeds);

        //this.viewAll(needDays, 0);


        //동시에 진행된 프로세스 계산
        for (int step = 0; step < progressesCount; ) {
            int stepNeedDay = needDays[step];

            //날짜 동시에 경과
            for (int remainStep = step; remainStep < progressesCount; remainStep++) {
                needDays[remainStep] -= stepNeedDay;
            }

            //this.viewAll(needDays, step);

            //완료한 작업까지의 갯수
            int workCount = 1;
            for ( ; step + workCount < progressesCount; workCount++) {
                if (needDays[step + workCount] > 0) break;
            }

            System.out.println("workCount:" + workCount);

            //완료한 작업 갯수 저장
            workCountStorage.add(workCount);

            //작업 갯수만큼 step 증가
            step += workCount;

        }

        //int[] answer = {};
        int[] answer = Solution.convertIntegers(workCountStorage);
        return answer;
    }

    private void calcNeedDays(int[] progresses, int[] speeds) {
        for (int i = 0; i < progressesCount; i++) {
            double remainProgress = 100 - progresses[i];
            double fNeedDay = remainProgress / speeds[i];

            needDays[i] = (int) Math.ceil(fNeedDay);
        }
    }

    public static int[] convertIntegers(ArrayList<Integer> integers) {
        int size = integers.size();
        int[] ret = new int[size];
        for (int i = 0; i < size; i++) {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }

    private void viewAll(int[] array, int startIdx) {
        System.out.print("viewAll:");

        int arrayCount = array.length;
        for(int i = startIdx; i < arrayCount; i++) {
            System.out.print(array[i]+",");
        }

        System.out.println();
    }
}
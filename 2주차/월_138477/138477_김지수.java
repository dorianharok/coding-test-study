// Solution 1
import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> pQ = new PriorityQueue<Integer>();

        for (int i = 0; i < score.length; i++) {
            if (pQ.size() < k) {
                pQ.offer(score[i]);
                answer[i] = pQ.peek();
                continue;
            }
            pQ.offer(Math.max(pQ.poll(), score[i]));
            answer[i] = pQ.peek();
        }
        return answer;
    }
}
/* 시간복잡도: O(N log K) => N: 입력 배열 score의 길이, K: 우선순위 큐의 크기 (우선순위 큐 삽입, 삭제 연산)  */


// Solution 2
import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i = 0; i < score.length; i++) {
            priorityQueue.add(score[i]);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
            answer[i] = priorityQueue.peek();
        }
        return answer;
    }
}
/* 시간복잡도: O(N log K) => N: 입력 배열 score의 길이, K: 우선순위 큐의 크기 (우선순위 큐 삽입, 삭제 연산)  */
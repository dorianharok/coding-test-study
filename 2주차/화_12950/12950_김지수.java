// Solution 1
import java.util.*;
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int col = arr1[0].length;

        // arr1 복사
        int[][] answer = new int[row][];
        for (int i = 0; i < row; i++) {
            answer[i] = Arrays.copyOf(arr1[i], col);
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                answer[i][j] += arr2[i][j];
            }
        }
        return answer;
    }
}


// Solution 2
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int col = arr1[0].length;

        int[][] answer = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}


// Solution 3
import java.util.stream.IntStream;  /
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        return IntStream.range(0, arr1.length)  // 2차원 배열의 행 인덱스 범위를 나타내는 IntStream
                // mapToObj를 사용하면 기본형 int로 이루어진 IntStream을 객체로 이루어진 스트림(Stream<T>)으로 변환할 수 있음
                // mapToObj를 사용해서 int[] 배열을 객체로 이루어진 스트림(Stream<Integer>)로 변환해야 각 열의 값에 대한 연산 수행 가능
                .mapToObj(i -> IntStream.range(0, arr1[i].length)
                        .map(j -> arr1[i][j] + arr2[i][j])  // 두 배열의 같은 위치의 원소를 더한 결과를 스트림으로 생성
                        .toArray())  // IntStream을 Integer[] 배열로 변환
                .toArray(int[][]::new);  // 2차원 배열로 최종 변환
    }
}

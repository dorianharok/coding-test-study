// Solution 1
class Solution {
    public long solution(int n) {
        long[] temp = new long[2001];
        temp[1] = 1;
        temp[2] = 2;
        for (int i = 3; i <= n; i++) {
            temp[i] = (temp[i - 1] + temp[i - 2]) % 1234567;
        }
        return temp[n];
    }
}


// Solution 2 재귀라서 스택 메모리를 사용하다보니 더 느림
class Solution {
    long[] arr = new long[2001];
    public long solution(int n) {
        for(int i = 1; i < 2001; i++)
            arr[i] = -1;
            arr[1] = 1;
            arr[2] = 2;
        return jumpCase(n);
    }

    public long jumpCase(int num) {
        long answer = 0;
        if(arr[num] != -1) return arr[num];
        if (num <= 2) {
            return num;
        }
        answer = (jumpCase(num-1) + jumpCase(num-2)) % 1234567;
        arr[num] = answer;
        return answer;
    }
}
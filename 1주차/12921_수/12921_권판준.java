public class No_12921 {
    public int solution(int n) { // 시간 초과
        int answer = 0;

        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            boolean flag = true;
            for (Integer primeNumber : primeNumbers) {
                if((i % primeNumber) == 0) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                primeNumbers.add(i);
            }
        }

        answer = primeNumbers.size();

        return answer;
    }

    // https://velog.io/@stella317/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%86%8C%EC%88%98%EC%B0%BE%EA%B8%B0-java
    public int solution2(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            boolean flag = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                answer++;
            }
        }

        return answer;
    }
}
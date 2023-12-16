public class No_12948 {
    public String solution(String phone_number) {
        String answer = "";

        String[] arr = phone_number.split("");

        for (int i = 0; i < arr.length - 4; i++) {
            arr[i] = "*";
        }

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        answer = sb.toString();

        return answer;
    }
}
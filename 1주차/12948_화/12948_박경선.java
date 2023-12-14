class Solution {
    public String solution(String phone_number) {
        // 뒤의 4자리 빼고 전부 *처리
        String number = phone_number.substring(phone_number.length() - 4);
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<phone_number.length()-4;i++){
            answer.append("*");
        }
        answer.append(number);
        return answer.toString();
    }
}
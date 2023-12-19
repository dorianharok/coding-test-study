//class Solution {
//    public int solution(int[] ingredient) {
//        String k = "";
//        int answer = 0;
//        int q = 0;
//        for(int i=0; i<ingredient.length; i++){
//            k+= ingredient[i];
//        }
//        while(k.length()>4) {
//            for (int i = 0; i < k.length() - 3; i++) {
//                if (k.substring(i, i + 4).equals("1231")) {
//                    answer += 1;
//                    k= k.substring(0,i+1)+k.substring(i+4);
//                }else{
//                    q+=1;
//                }
//            }
//            if(q==k.length()-3){
//                break;
//            }
//        }
//        return answer;
//    }
//}
//처음 작성한 코드 시간초과 문제로 해결 못 함 현재의 실력으로 시간초과의 문제 해결방법을 찾지 못해 정답을 봤음
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for (int j : ingredient) {
            sb.append(j);
            if (sb.length() > 3 && sb.subSequence(sb.length() - 4, sb.length()).equals("1231")) {
                answer++;
                sb.delete(sb.length() - 4, sb.length());
            }
        }
        return answer;
    }
}
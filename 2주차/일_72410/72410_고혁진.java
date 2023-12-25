class Solution {
    public String solution(String new_id) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        new_id=new_id.toLowerCase(); //1단계
        for(int i = 0; i<new_id.length();i++){
            if((new_id.charAt(i)>='a'&&new_id.charAt(i)<='z')||(new_id.charAt(i)>='0'&&new_id.charAt(i)<='9')||new_id.charAt(i)=='-'||new_id.charAt(i)=='_'||new_id.charAt(i)=='.')
                sb.append(new_id.charAt(i));
        }//2단계
        String str = sb.toString();
        while(str.contains("..")){
            str=str.replace("..",".");
        }//3단계
        if(str.length()>0) {
            if (str.charAt(0) == '.') {
                str = str.substring(1, str.length());
            }
        }
        if(str.length()>0){
            if(str.charAt(str.length()-1)=='.'){
                str=str.substring(0,str.length()-1);
            }
        }//4단계
        if(str.equals("")){
            str="a";
        }//5단계
        if(str.length()>=16){
            str=str.substring(0,15);
            if(str.charAt(str.length()-1)=='.'){
                str=str.substring(0,str.length()-1);
            }
        }//6단계
        if (str.length() <= 2) {
            char lastChar = str.charAt(str.length() - 1);
            while (str.length() < 3) {
                str += lastChar;
            }
        }
        answer=str;
        return answer;
    }
}
//풀었던 문제네요 ㅎㅎ
// Solution 1
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < index; j++) {
                c += 1;
                if (c > 'z') {
                    c -= 26;
                }
                if (skip.contains(String.valueOf(c))) {
                    j--;
                }
            }
            answer += c;
        }
        return answer;
    }
}


// Solution 2
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for (char letter : s.toCharArray()) {
            char temp = letter;
            int idx = 0;
            while (idx < index) {
                temp = temp == 'z' ? 'a' : (char) (temp + 1);
                if (!skip.contains(String.valueOf(temp))) {
                    idx += 1;
                }
            }
            answer.append(temp);
        }
        return answer.toString();
    }
}


// Solution 3
import java.util.ArrayList;

class Solution {
    public String solution(String s, String skip, int index) {
        char[] sArr = s.toCharArray();
        char[] skipArr = skip.toCharArray();
        ArrayList<Character> alphabet = new ArrayList<>();

        for(int i = 0 ; i <= 25 ; i++){
            alphabet.add((char)(i + 97));
        }
        for (char c : skipArr) {
            alphabet.remove(Character.valueOf(c));
        }

        int size = alphabet.size();
        for(int c=0; c < sArr.length ; c++) {
            int indexNum = alphabet.indexOf(Character.valueOf(sArr[c]))+index;
            indexNum = indexNum % size;
            sArr[c] = alphabet.get(indexNum);
        }

        String answer = new String(sArr);

        return answer;
    }
}


// Solution 4
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        //skip을 알파벳에서 없애고 시작하기.
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] delete = skip.split("");

        for(String d:delete)
            alphabet = alphabet.replace(d,"");

        String[] myalphabet = alphabet.split("");
        String[] sArr = s.split("");

        for(int i = 0; i< sArr.length; i++){
            for(int j = 0; j < myalphabet.length; j++){

                if(sArr[i].equals(myalphabet[j])){

                    answer+=myalphabet[(j+index)%myalphabet.length];
                    continue;
                }
            }
        }
        return answer;
    }
}
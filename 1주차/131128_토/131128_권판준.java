public class No_131128 {
    public String solution(String X, String Y) { // 시간초과
        String answer = "";

        char[] xArr = X.toCharArray();
        char[] yArr = Y.toCharArray();

        List<Character> xList = new ArrayList<>();
        List<Character> yList = new ArrayList<>();
        for (char x : xArr) {
            xList.add(x);
        }
        for (char y : yArr) {
            yList.add(y);
        }

        for (int i = 0; i < xList.size(); i++) {
            boolean flag = true;
            for (int j = 0; j < yList.size(); j++) {
                if (xList.get(i) == yList.get(j)) {
                    yList.remove(j);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                xList.remove(i--);
            }
        }
        Collections.sort(xList, Collections.reverseOrder());

        if (xList.size() == 0) {
            answer = "-1";
            return answer;
        }

        StringBuilder sb = new StringBuilder();
        for (Character x : xList) {
            sb.append(x);
        }

        answer = sb.toString();

        if (answer.replaceAll("0", "").length() == 0) {
            answer = "0";
        }

        return answer;
    }

    // https://travelerfootprint.tistory.com/287
    public String solution2(String X, String Y) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for(String s : X.split("")) {
            arr1[Integer.parseInt(s)]++;
        }
        for(String s : Y.split("")) {
            arr2[Integer.parseInt(s)]++;
        }

        StringBuilder answer = new StringBuilder("");
        for(int i = 9; i >= 0; i--) {
            while(arr1[i]-- > 0 && arr2[i]-- > 0) {
                answer.append(i);
            }
        }

        if(answer.toString().isBlank())
            answer.append("-1");
        else if(answer.toString().charAt(0) == '0')
            answer = new StringBuilder("0");
        return answer.toString();
    }
}
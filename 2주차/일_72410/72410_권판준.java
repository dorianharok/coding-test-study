public class No_72410 {
    public String solution(String new_id) {
        String lower = new_id.toLowerCase();

        char[] chArr = lower.toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            if(!Character.isAlphabetic(chArr[i]) &&
                    !Character.isDigit(chArr[i]) &&
                    chArr[i] != '-' &&
                    chArr[i] != '_' &&
                    chArr[i] != '.'
            ) {
                chArr[i] = '*';
            }
        }
        String rmChar = new String(chArr);
        rmChar = rmChar.replace("*", "");

        while (rmChar.contains("..")) {
            rmChar = rmChar.replace("..", ".");
        }

        String rmFirstOrLast = rmChar;
        if (rmChar.indexOf(".") == 0) {
            rmFirstOrLast = rmChar.substring(1, rmChar.length());
        }

        if (!rmFirstOrLast.isEmpty() && rmFirstOrLast.lastIndexOf(".") == rmFirstOrLast.length()-1) {
            rmFirstOrLast = rmFirstOrLast.substring(0, rmFirstOrLast.length()-1);
        }

        if(rmFirstOrLast.isEmpty()) {
            rmFirstOrLast = "a";
        }

        String limit15 = rmFirstOrLast;
        if (rmFirstOrLast.length() > 15) {
            limit15 = rmFirstOrLast.substring(0, 15);
            if (limit15.lastIndexOf(".") == limit15.length()-1) {
                limit15 = limit15.substring(0, limit15.length()-1);
            }
        }

        String limit2 = limit15;
        while (true) {
            if (limit2.length() < 3) {
                limit2 += limit2.charAt(limit2.length()-1);
            } else {
                break;
            }
        }

        return limit2;
    }
}
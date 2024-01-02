class Solution {
    public String solution(int[] numbers, String hand) {
        // 좌표로 구해야 하는문제! 접근을 잘못해서 결국 풀이참조함
        int leftHand = 10;
        int rightHand = 12;

        StringBuilder sb = new StringBuilder();
        for (int number : numbers) {
            if(number == 1 || number == 4 || number == 7){
                sb.append("L");
                leftHand = number;
            }else if( number == 3 || number == 6 || number == 9){
                sb.append("R");
                rightHand = number;
            }else{
                int leftLength = getLength(leftHand, number);
                int rightLength = getLength(rightHand, number);
                if(leftLength > rightLength){
                    sb.append("R");
                    rightHand = number;
                }else if(leftLength < rightLength){
                    sb.append("L");
                    leftHand = number;
                }else{
                    if(hand.equals("right")){
                        sb.append("R");
                        rightHand = number;
                    }else{
                        sb.append("L");
                        leftHand = number;
                    }
                }
            }
        }
        return sb.toString();
    }
    private static int getLength(int index,int number) {

        index = (index == 0) ? 11 : index;
        number = (number == 0) ? 11 : number;
        int x = (index - 1) / 3;
        int y = (index - 1) % 3;
        int numberX = number / 3;
        int numberY = 1;
        return Math.abs(x-numberX) + Math.abs(y-numberY);
    }
}
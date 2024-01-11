class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int leftFinger = 10;
        int rightFinger = 12;

        for (int number : numbers) {
            switch (number) {
                case 1, 4, 7 :
                    sb.append("L");
                    leftFinger = number;
                    break;
                case 3, 6, 9 :
                    sb.append("R");
                    rightFinger = number;
                    break;
                case 2, 5, 8, 0 :
                    int leftDistance = getDistance(leftFinger, number);
                    int rightDistance = getDistance(rightFinger, number);

                    if (rightDistance > leftDistance) {
                        sb.append("L");
                        leftFinger = number;
                    } else if (leftDistance > rightDistance) {
                        sb.append("R");
                        rightFinger = number;
                    } else {
                        if (hand.equals("left")) {
                            sb.append("L");
                            leftFinger = number;
                        } else {
                            sb.append("R");
                            rightFinger = number;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        return sb.toString();
    }

    public int getDistance(int finger, int number) {
        finger = (finger == 0)? 11 : finger;
        number = (number == 0)? 11 : number;

        int distanceX = Math.abs(finger - number) / 3;
        int distanceY = Math.abs(finger - number) % 3;

        return distanceX + distanceY;
    }
}
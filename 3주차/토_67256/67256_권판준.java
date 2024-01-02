public class No_67256 {
    public String solution(int[] numbers, String hand) {
        Pos[] keys = new Pos[10];
        keys[0] = new Pos(3, 1);
        int idx = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                keys[idx++] = new Pos(i, j);
            }
        }

        Pos posL = new Pos(3, 0);
        Pos posR = new Pos(3, 2);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            switch (numbers[i]) {
                case 1, 4, 7 :
                    posL.setXY(keys[numbers[i]].x, keys[numbers[i]].y);
                    sb.append("L");
                    break;
                case 3, 6, 9 :
                    posR.setXY(keys[numbers[i]].x, keys[numbers[i]].y);
                    sb.append("R");
                    break;
                case 2, 5, 8 ,0 :
                    if (posL.calcDistant(keys[numbers[i]]) < posR.calcDistant(keys[numbers[i]])) {
                        posL.setXY(keys[numbers[i]].x, keys[numbers[i]].y);
                        sb.append("L");
                    } else if (posL.calcDistant(keys[numbers[i]]) > posR.calcDistant(keys[numbers[i]])) {
                        posR.setXY(keys[numbers[i]].x, keys[numbers[i]].y);
                        sb.append("R");
                    } else {
                        if (hand.equals("left")) {
                            posL.setXY(keys[numbers[i]].x, keys[numbers[i]].y);
                            sb.append("L");
                        } else {
                            posR.setXY(keys[numbers[i]].x, keys[numbers[i]].y);
                            sb.append("R");
                        }
                    }
                    break;
                default:
                    break;
            }
        }

        return sb.toString();
    }

    class Pos {
        private int x, y;
        private int distant;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void setXY(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int calcDistant(Pos target) {
            return distant = Math.abs(x - target.x) + Math.abs(y - target.y);
        }
    }
}
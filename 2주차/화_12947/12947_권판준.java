public class No_12947 {
    public boolean solution(int x) {
        String[] xArr = String.valueOf(x).split("");

        int sumArr = 0;
        for (String n : xArr) {
            sumArr += Integer.valueOf(n);
        }

        return x % sumArr == 0;
    }
}
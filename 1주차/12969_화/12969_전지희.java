import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

      // 순서에 주의할 것! '몇 줄' 출력할거고, 한 줄에 '몇 개'가 있는데?
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
          
            System.out.println();
        }

    }
}

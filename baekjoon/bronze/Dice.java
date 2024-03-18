package baekjoon.bronze;

import java.util.Scanner;
public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();

        int result = (f == s && s == t) ? 10000 + f * 1000 :
                (f == s || f == t) ? 1000 + f * 100 :
                        (s == t) ? 1000 + s * 100 :
                                Math.max(Math.max(f, s), t) * 100;
        System.out.println(result);
    }
}

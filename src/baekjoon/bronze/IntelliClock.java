package baekjoon.bronze;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class IntelliClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();

        s = s + t;
        m = s/60 + m;
        s = s % 60;
        h = h + m/60;
        m = m % 60;
        h = h % 24;
        System.out.println(h + " " + m + " " + s);
    }
}

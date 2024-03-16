package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] sn = new int[5];
        for (int i = 0; i < sn.length ; i++) {
            sn[i] = sc.nextInt();
        }
        int result = 0;
        int sum = 0;
        for (int i = 0; i < sn.length; i++) {
            sum += sn[i] * sn[i];
        }
        result = sum%10;
        System.out.println(result);
    }
}

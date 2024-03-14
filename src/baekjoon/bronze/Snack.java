package baekjoon.bronze;

import java.util.Scanner;

public class Snack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int priceS = sc.nextInt();
        int count = sc.nextInt();
        int money = sc.nextInt();
        int needmoney = priceS*count;
        int result = (needmoney<=money)?0:needmoney-money;
        System.out.println(result);
    }
}

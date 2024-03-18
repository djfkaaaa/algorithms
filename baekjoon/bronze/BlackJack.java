package baekjoon.bronze;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] num = new int[size];
        int limit = sc.nextInt();
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 0; i < num.length-2; i++) {
            if (num[i] > limit) continue;
            for (int j = i+1; j < num.length-1; j++) {
                if (num[i] + num[j] > limit) continue;
                for (int k = j+1; k < num.length; k++) {
                    int sum = num[i] + num[j] + num[k];
                    if (sum == limit){
                        result = sum;
                    }
                    if (result <sum && sum < limit){
                        result = sum;
                    }
                }
            }
        }
        System.out.println(result);
    }

}

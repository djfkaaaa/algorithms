package baekjoon;

import java.util.Scanner;

public class Honey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] honey = new int[num];

        int sum = 0;
        for (int i = 0; i < honey.length; i++) {
            honey[i] = sc.nextInt();
            sum += honey[i];
        }

        int left, right, mid;
        left = sum - honey[0];
        right = left;
        mid = sum - honey[0] - honey[num-1];

        int answer = 0;
        for (int i = 1; i < num-1; i++) {
            answer = Math.max(mid + honey[i],answer);

            left -= honey[i];
            right -= honey[i];
            answer = Math.max(left + right, answer);
            left += honey[i];
        }

        left = sum - honey[num - 1];
        right = left;

        for (int i = num-2; i > 0 ; i--) {
            left -= honey[i];
            right -= honey[i];
            answer = Math.max(left + right , answer);
            left += honey[i];
        }
        System.out.println(answer);
    }
}
//https://thdbs523.tistory.com/m/288
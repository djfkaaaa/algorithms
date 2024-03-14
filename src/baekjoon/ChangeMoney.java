package baekjoon;
import java.util.Scanner;
public class ChangeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] change = {500,100,50,10,5,1};
        int money = 1000 - sc.nextInt();
        int count = 0;

        for (int i = 0; i < change.length; i++) {
            if (money%change[i] >= 0){
                count += money/change[i];
                money %= change[i];
            }
        }
        System.out.println(count);
    }
}

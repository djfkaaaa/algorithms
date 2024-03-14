package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Dwarf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] dwarf = new int[9];
        int sum = 0;

        for (int i = 0; i < dwarf.length; i++) {
            dwarf[i] = sc.nextInt();
            sum += dwarf[i];
        }
        Arrays.sort(dwarf);

        int fakeD1 = 0;
        int fakeD2 = 0;
        for (int i = 0; i < dwarf.length-1; i++) {
            for (int j = i+1; j < dwarf.length; j++) {
                if (sum - dwarf[i] - dwarf[j] == 100){
                    fakeD1 = i;
                    fakeD2 = j;
                    break;
                }
            }
        }
        for (int i = 0; i < dwarf.length; i++) {
            if (i == fakeD1 || i == fakeD2){
                continue;
            }
            System.out.println(dwarf[i]);
        }
    }
}

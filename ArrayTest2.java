import java.util.Scanner;

/***
 * 최적화 문제 ( 수의 범위를 지정하고 입력한 점수의 1등 뽑기)
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생수와 점수를 받아 1등을 출력하는 프로그램");

        System.out.println("학생수는 몇명입니까?");
        int numberOfStudents = sc.nextInt();
        String [] names = new String[numberOfStudents];
        int [] scores = new int[numberOfStudents];

        for (int i = 0; i < scores.length; i++) {
            System.out.println("학생의 이름을 입력하세요.");
            names[i] = sc.next();
        }

        int max = 0;
        int same = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.println("점수를 입력해주세요.");
            scores[i] = sc.nextInt();
            if (max < scores[i]){
                max = scores[i];
                same = i;
            }
        }

        System.out.println("이름은 = " + names[same] + " 점수는 = " + max);

    }
}
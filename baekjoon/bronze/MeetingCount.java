package baekjoon.bronze;
/*
입력받은 회의수에 대해 각 회의의 진행 시간을 입력받는다,
이때 시간이 곂치않으며 회의를 사용할수있는 최대 개수를 출력하라
끝나는 시간과 동시에 회의가 시작가능하다.
 */


import java.util.Comparator;
import java.util.Arrays;
import java.util.Scanner;

public class MeetingCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int meetingCount = sc.nextInt();
        int [][] timeTable = new int[meetingCount][2];

        for (int i = 0; i < meetingCount; i++) {
            timeTable[i][0] = sc.nextInt(); // 0 - 시작타임
            timeTable[i][1] = sc.nextInt(); // 1 - 종료타임
        }
        Arrays.sort(timeTable, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]){ //종료 시간이 같으면
                    return o1[0] - o2[0]; //시작시간이 빠른순으로
                }
                return o1[1] - o2[1]; //종료시간이 같지 않다면 종료시간 빠른순으로
            }
        });
        int count = 0;
        int beforeEndTime = 0;
        for (int i = 0; i < meetingCount; i++) {
            if (beforeEndTime <= timeTable[i][0]){
                beforeEndTime = timeTable[i][1];
                count++;
            }
        }
        // 단순히 종료시간이 빠른순으로 정렬한다면 시작시간이 더 빠르더라도 카운트되지 않는 예외가 발생할수있다.
        // 이를 방지하기위해 시작시간또한 오름차순으로 정렬시키는 반복문
        System.out.println(count);
    }
}

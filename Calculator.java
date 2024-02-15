import java.util.Scanner;

public class Calculator { /*Calculator class*/
    public static void main(String[] args) { /*메인메서드*/
        Scanner /*Scanner type(class)*/ scanner = new Scanner(System.in);

        System.out.println("숫자를 입력해주세요");
        int firstNum = Integer.parseInt(scanner.next());
        System.out.println("다음 숫자를 입력해주세요");
        int secondNum = Integer.parseInt(scanner.next());
        System.out.println(" 연산기호를 입력하세요");
        String opcode = scanner.next();
        System.out.println("입력받은 숫자는" + firstNum + "과 " + secondNum + "입니다.");

        int result = 0;

        if (opcode.equals("+")) {
            result = firstNum + secondNum;
        } else if (opcode.equals("-")) {
            result = firstNum - secondNum;
        } else if (opcode.equals("*")) {
            result = firstNum * secondNum;
        } else if (opcode.equals("/")) {
            result = firstNum / secondNum;
        } else {
            System.out.println("잘못된 연산기호입니다.");
        }
        // ^ if절은 main 메서드의 자식 따라서 result 변수를 if절 바깥 main메서드에서 출력 시키려면
        // 처음 result 선언을 if바깥 main메서드에 값이 없는형태로 선언하고, if 내부에서 변수에대한 식 계산

        System.out.println("연산결과 = " + result);
    }
}

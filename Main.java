import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ID를 입력하세요");
        String id = scanner.next();

        System.out.println("비밀번호를 입력하세요");
        String password = scanner.next();

        System.out.println("비밀번호를 한번 더 입력하세요");
        String passwordAgain = scanner.next();

        System.out.println("이름을 입력해주세요");
        String name = scanner.next();

        System.out.println("주민번호를 입력해주세요");
        String personId = scanner.next();

        System.out.println("전화번호를 입력해주세요");
        String phoneNumber = scanner.next();

        System.out.println("주소를 입력하세요");
        String address = scanner.next();

        System.out.println("직업을 입력하세요");
        String job = scanner.next();

        System.out.println("ID = " + id);
        System.out.println("비 번 = " + password);
        System.out.println("비번 확인 = " + passwordAgain);
        System.out.println("이름 = " + name);
        System.out.println("주민번호 = " + personId);
        System.out.println("전화번호 = " + phoneNumber);
        System.out.println("주 소 = " + address);
        System.out.println("직업 = " + job);


    }
}
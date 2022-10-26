import java.text.BreakIterator;
import java.util.Scanner;

public class hh {
    public static void main(String[] args) {
        // if (2 > 1) {
        // System.out.println(1);
        // System.out.println(1.5);
        // } else if (3 > 2) {
        // System.out.println(2);
        // System.out.println(3);
        // System.out.println(4);
        // }
        // }
        // if (2 > 4)
        // System.out.println(1);
        // else if (3 > 4)
        // System.out.println(2);
        // else if (2 > 1)
        // System.out.println(3);
        // else if (3 > 5)
        // System.out.println(4);
        // else if (3 > 1)
        // System.out.println(5);
        // char bar = 'a';
        // char foo = 'c';

        // // bar는 a이고 foo는 c 일때 참 그외는 것짓
        // // &&금지

        // if (bar == 'a') {
        // if (foo == 'c')
        // System.out.println("참");
        // } else
        // System.out.println("거짓");
        // char bar = 'a';
        // char foo = 'z';
        // char pos = 'p';
        // // 바가 a이고 푸가 c이고 pos가 d이면 q1 출력
        // // 바가 a이고 푸가 z이면 q2출력
        // // 바가 a이고 푸가 x이고 pos가 p이면 q3출력
        // if (bar == 'a') {
        // if (foo == 'c')
        // if (pos == 'd')
        // System.out.println("Q1");
        // }
        // if (bar == 'a') {
        // if (foo == 'z')
        // System.out.println("Q2");
        // }
        // if (bar == 'a') {
        // if (foo == 'x')
        // if (pos == 'p')
        // System.out.println("Q3");
        // }
        Scanner scn = new Scanner(System.in);
        // String inputValue = "";
        // boolean is = true;
        // while (true) {
        // // 아래 콘솔은한 번만 사용
        // char inputChar = scn.next().charAt(0);

        // if (is) {
        // if (inputChar == 'a')
        // is = false;
        // } else {
        // if (inputChar == 'b') {
        // System.out.println("참");
        // break;
        // }
        // is = true;
        // }
        // // 키보드로 부터 알파벳 한자씩 각각 입력 받는다
        // // 첫번째 입력값이 a 두번째값이 b면 "참"출력후종료
        // // 첫번째 또는 두번째 값이 틀리면 입력 횟수는 첫번째로 리셋

        // }
        // int value = 2;

        // switch (value) {
        // // else if 와 비슷하다
        // // case 값이랑 스위치 값이랑 같으면 맞는 case부터 끝까지 전부 출력
        // // 다 출력되는걸 막을려면 break를 붙인다
        // //char를 포함한 정수와 String만 switch 값에 넣을수 있다
        // //스위치는 같다 말고는 비교 불가능
        // case 1:
        // System.out.println(1);
        // case 2:
        // System.out.println(2);
        // case 3:
        // System.out.println(3);
        // default:
        // System.out.println(4);

        // }
        int coin = 10000;
        while (coin >= 0) {
            System.out.println("1.커피 1000");
            System.out.println("2.콜라 2000");
            System.out.println("3.주스 3000");
            int inputNum = scn.nextInt();
            switch (inputNum) {
                case 1:
                    System.out.println("커피가 나왔습니다");
                    coin -= 1000;
                    System.out.println("현재 소지 금액" + coin);
                    if (coin <= 0) {
                        System.out.println("돈을 다 쓰셨습니다");
                    }
                    break;
                case 2:
                    System.out.println("콜라가 나왔습니다");
                    coin -= 2000;
                    System.out.println("현재 소지 금액" + coin);
                    if (coin <= 0) {
                        System.out.println("돈을 다 쓰셨습니다");
                    }
                    break;
                case 3:
                    System.out.println("주스 나왔습니다");
                    coin -= 3000;
                    System.out.println("현재 소지 금액" + coin);
                    if (coin <= 0) {
                        System.out.println("돈을 다 쓰셨습니다");
                    }
                    break;
                default:
                    System.out.println("등록된 번호만 누르세요");
            }
        }
    }
}
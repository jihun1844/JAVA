import java.util.Scanner;

public class 야구게임 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int out = 0;
        int count = 1;
        //입력시 세로로 엔터키 입력 가능

        //게임 조건 확인후 그에 따른 결과 실행
        //1. 승리 = 랜덤값을 전부 맞출경우
        //2. 패배 = 게임횟수 5회 이상, 아웃2회 이상

        //0~9사이 중복 되지 않는 난수를 발생 하여, 배열에 저장
        final int rand_Num = 3;
        int computer_Num[] = new int[rand_Num];
        int user_Num[] = new int[rand_Num];
        int num = 0;

        for (int i = 0; i < computer_Num.length; i++) {
            num = (int) ((Math.random() * 9) + 1);
            for (int j = 0; j < computer_Num.length; j++) {
                if (computer_Num[j] == num) {
                    num = (int) ((Math.random() * 9) + 1);
                    j = -1;
                }
            }
            computer_Num[i] = num;
            System.out.println(num);
        }

        while (true) {
            int strike = 0;
            int ball = 0;
        
            System.out.println("시도횟수:" + count);
            System.out.println("정수 3개를 입력 하세요");
            //사용자로부터 0~9사이 값 입력
            for (int i = 0; i < user_Num.length; i++) {
                user_Num[i] = scn.nextInt();
            }
            count++;
            //볼 스트라잌 아웃 판별
            for (int i = 0; i < computer_Num.length; i++) {

                for (int j = 0; j < computer_Num.length; j++) {
                    if (i == j && computer_Num[i] == user_Num[j]) {
                        strike++;
                    } else if (computer_Num[i] == user_Num[j]) {
                        ball++;
                    }

                }
            }
            //결과 출력
            if (strike == 0 && ball == 0) {
                out++;
                System.out.println(out + "out");
            }
            if (strike > 0) {
                System.out.println(strike + "strike");
            }
            if (ball > 0) {
                System.out.println(ball + "ball");
            }
            
            //3스트라이크 승리 종료 
            if (strike == 3) {
                System.out.println("정답입니다~");
                System.out.print("정답은");
                    for (int i = 0; i < computer_Num.length; i++) {
                        System.out.print(computer_Num[i]);
                    }
                        System.out.println("입니다");
                        break;
                    }
            //2아웃 패배 종료
            if (out == 2) {
                System.out.println("패배!");
                System.out.print("정답은");
                for (int i = 0; i < computer_Num.length; i++) {
                    System.out.print(computer_Num[i]);
                }
                    System.out.println("입니다");
                    break;

                }
            //시도횟수 5회 패배 종료
            if (count == 5) {
                System.out.println("시도횟수 초과!");
                System.out.print("정답은");
                    for (int i = 0; i < computer_Num.length; i++) {
                        System.out.print(computer_Num[i]);
                    }
                    System.out.println("입니다");
                    break;
            }
        }

    }
}



import java.util.Scanner;
public class 구구단 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // 사용자가 1을 누르면 구구단 출력 2는 종료
        while (true) {
            System.out.println("----------------");
            System.out.println("1. 구구단 출력");
            System.out.println("2. 프로그램 종료");
            System.out.println("----------------");
            int game_start = scn.nextInt();
            if(game_start == 2){
                System.out.println("이용해주셔서 감사합니다");
                break;}
            if(game_start == 1){
            // 단을 사용자가 적음
                System.out.println("출력할 구구단의 단을 입력하세요. 구구단의 단은 2~9사이 입니다");
                int dan = scn.nextInt();

                // 구구단 출력
                if(dan >= 2 && dan <= 9){
                    for(int num = 1; num <=9; num++)
                        System.out.println(dan + "X" + num + "=" + dan*num);
                        }
                // dan이 2~9사이의 정수가 아니면 다시 입력
                else
                    while(true){
                    System.out.println("2~9 사이의 정수만 입력해주세요");
                    dan = scn.nextInt();
                    // dan 2~9 사이의 숫자면 구구단 출력
                    if(dan >= 2 && dan <= 9){
                        for(int num = 1; num <=9; num++)
                        System.out.println(dan + "X" + num + "=" + dan*num);
                        break;
                    }
                    }
                    
                    }
            // 프로그램 시작시 1이나 2를 안누르면 다시 입력
            if(game_start != 1 && game_start !=2)
                System.out.println("잘못입력했습니다. 다시입력 하세요");
        }
    }
}

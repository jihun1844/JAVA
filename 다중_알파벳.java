import java.util.Scanner;
import java.util.spi.CurrencyNameProvider;
public class 다중_알파벳 {
    public static void main(String[] args) {
        // 정수를 입력받고 입력받은 정수가 1 이면 소문자 a~z까지, 2면 대문자 A~Z까지 다중열로 출력
        Scanner scn = new Scanner(System.in);
        while (true) {
        
            System.out.println("정수를 입력 하세요");
            int inputNum = scn.nextInt();
            System.out.println("출력할 줄수");
            int lineNum = scn.nextInt();
            
            if (inputNum == 1) {
                for (int a = 0; a < lineNum; a++) {
                    System.out.println();
                    for (char i = 'a'; i <= 'z'; i++) {
                        System.out.print(i);
                    }
                }
                System.out.println();
            }
            if (inputNum == 2) {
                for (int a = 0; a < lineNum; a++) {
                    System.out.println();
                    for (char i = 'A'; i <= 'Z'; i++) {
                        System.out.print(i);
                    }
                }
                System.out.println();
            }
            // 다른값 입력시 재입력
            else {
                System.out.println("1이나 2의 정수만 입력");
                continue;
            }
        }
    }
    
}

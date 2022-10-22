import java.util.Scanner;
public class 연습 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = 1;
        while(true){
            
            String inputValru = "";
            try{   //try안에서 오류가 나면 catch로 이동
            // 키보드로 숫자 입력 받기
            inputValru = scn.nextLine();
            // 입력값이 q면 프로그램 종료
            if(inputValru.equals("q")){
                System.out.println("이용해주셔서 감사합니다");
                break;
            }
            // 받은 변수를 int로 바꿈
            int inputNum = Integer.parseInt(inputValru);
            // 숫자가 음수면 다시 적기
            if(inputNum <=0){
                System.out.println("1이상 자연수만 적으세요");
                continue;
            }
            // 홀수,짝수,3의배수,7의배수면 출력
            System.out.println(count +"번째 입력값은 = "+inputNum);
            if(inputNum%2 == 0){
                System.out.println("짝수입니다");
            }
            if(inputNum%2 != 0){
                System.out.println("홀수입니다");
            }
            if(inputNum%3 == 0){
                System.out.println("3의 배수입니다");
            }
            if(inputNum%7 == 0){
                System.out.println("7의 배수입니다");
            }

        }
        // catch가 끝나면 다시 while로 올라감
        catch(Exception e){
            System.out.println("다시입력해주세요");

        }

        }
    }

    }


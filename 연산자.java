import java.util.Scanner;
public class 연산자 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = 1;
        
        //키보드로 정수값 입력, 0이하면 다시입력
        while (true) { 
            // q입력시 종료
            String out = "q";
            String input = scn.nextLine();
            if(input.equals(out)){
                System.out.println("이용해주셔서 감사합니다");
                break;
            }
            // 종료문은 넘어갔으니 input을 int로 바꿈
            int inputNum = Integer.parseInt(input);
            
            if(inputNum <=0){
                System.out.println("1이상의 양수를 입력해주세요");
                continue;
            }
            if(inputNum >=1 ){
            System.out.println(count+"번째 입력값은 = "+inputNum);
            count++;
            if(inputNum%2 == 0){
                System.out.println("짝수입니다");
            }
            else if(inputNum%2 != 0){
                System.out.println("홀수입니다");
            }
            //3과 7의 배수면 출력
            if(inputNum %3 == 0){
                System.out.println("3의 배수입니다");
            }
            if(inputNum %7 == 0){
                System.out.println("7의 배수입니다");
            }


        }
        }
        //현재 입력 횟수 출력
        

    }
        
        
    }


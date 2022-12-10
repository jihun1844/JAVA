import java.util.Scanner;

public class 로또 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //1~45사이의 중복X의 랜덤값 6개 
        //math.random() 난수값 생성 0~1
        //(int)((Math.random()*45)+1)
        int num = 0;
        int random[] = new int[6];
        for (int i = 0; i < random.length; i++) {    //배열의 랜값은 선언할때 6으로 정해짐
            num = (int) ((Math.random() * 45) + 1);
            for (int a = 0; a < i; a++) {
                //중복 확인
                if (random[a] == num) {
                    num = (int) ((Math.random() * 45) + 1);
                    a = -1; // if 중복된 값을 발견하면 다시 랜덤값을 생성하고
                            // 다시 처음 자리부터 비교해야되서 a = -1로 바꾸면 for문이 끝날때 ++땜에 0이됨
                }
            }
            random[i] = num;
            System.out.println(random[i]);
            
            

        }
    }
}

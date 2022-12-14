import java.util.Scanner;

public class 기말고사1 {
    public static void main(String[] args) {
        //N개의 원소를 가지는 1차원 배열 생성
        System.out.println("1차 배열의 원소 개수를 입력");
        Scanner scn = new Scanner(System.in);
        int line = scn.nextInt();
        int array[] = new int[line];
        int num = 0;
        int index = 0;
        //원소를 지그재그로 배열에 넣기
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "번째 값을 입력 하세요");
            num = scn.nextInt();
            if (i % 2 == 0) {
                array[i - index] = num;
            } else {
                array[array.length - 1 - index] = num;
                index++;
            }
        }
        //출력
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"    ");
        }  
    }
    
}
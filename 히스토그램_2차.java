import java.util.Scanner;

public class 연습_히스토그램 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //사용자가 정수 N 입력, N개의 정수형 배열 선언, 입력값은 1~100
        System.out.println("배열의 개수를 입력 하세요");
        int user_Num = 0;
        while (true) {
            user_Num = scn.nextInt();
            if (user_Num >= 1 && user_Num <= 100) {
                break;
            }
            System.out.println("1~100사이의 값만 입력 하세요");
        }
        
        System.out.println("배열의 개수 : " + user_Num);
        System.out.print("배열 내 난수 값 : ");
        //중복X 난수 배열에 저장
        int rand_array[] = new int[user_Num];
        int rand = 0;
        for (int i = 0; i < user_Num; i++) {
            rand = (int) ((Math.random() * 101)) - 50;
            if (rand_array[i] == rand) {
                rand = (int) ((Math.random() * 101)) - 50;
                i = -1;
            }
            rand_array[i] = rand;
            System.out.print(rand_array[i] + ",");
        }
        System.out.println();
        

        //최대값
        int max = -51;
        for (int i = 0; i < rand_array.length; i++) {
            if (rand_array[i] > max) {
                max = rand_array[i];
            }
        }
        System.out.println("최대값 : " + max);
        //최소값
        int min = 51;
        for (int i = 0; i < rand_array.length; i++) {
            if (rand_array[i] < min) {
                min = rand_array[i];
            }
        }
        System.out.println("최소값 : " + min);

        //평균값 (실수)
        float avg = 0;
        for (int i = 0; i < rand_array.length; i++) {
            avg += rand_array[i];
        }
        avg = avg / user_Num;
        System.out.println("평균값 : " + avg);
        
        //히스토그램 작성
        int low_size = -50;
        int higt_size = -41;
        for (int i =0;i<10;i++) {
            System.out.print(low_size + "~" + higt_size + ":");
            for (int j = 0; j < rand_array.length; j++) {
                if (rand_array[j] >= low_size && rand_array[j] <= higt_size) {
                    System.out.print("*");
                }
            }
            System.out.println();
            low_size += 10;
            higt_size += 10;
            if (higt_size == 49) {
                higt_size++;
            }
        }
        
    }
    
}

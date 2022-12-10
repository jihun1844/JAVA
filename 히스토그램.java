import java.util.Scanner;
public class 히스토그램 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rand_value = 0;
        //int temporary = 0;
        int user_Num = 0;
        //사용자로 부터 1~100 사이의 N값 받기 아닐경우 다시입력
        System.out.println("1~100 사이의 배열의 개수를 입력 하세요");
        while (true) {
            user_Num = scn.nextInt();
            if (user_Num <= 100 && user_Num >= 1) {
                break;
            }
            System.out.println("다시입력 하시오");
        }
        //중복없는 난수 N개 배열에 받기
        int rand_array[] = new int[user_Num];
        for (int i = 0; i < rand_array.length; i++) {
            rand_value = (int) ((Math.random() * 101)) - 50;
            for (int j = 0; j < rand_array.length; j++) {
                if (rand_array[j] == rand_value) {
                    rand_value = (int) ((Math.random() * 101)) - 50;
                    j = -1;
                }
            }
            rand_array[i] = rand_value;
        }
        //나온 배열 출력하기
        System.out.println("배열의 개수:" + user_Num);
        System.out.print("배열 내 난수 값:");
        for (int i = 0; i < rand_array.length; i++) {
            System.out.print(rand_array[i] + ",");
        }
        System.out.println();
        //최대,최소 구하기
        int min_num = 51;
        int max_num = -51;
        for (int i = 0; i < rand_array.length; i++) {
            if (min_num > rand_array[i]) {
                min_num = rand_array[i];
            }
        }
        for (int i = 0; i < rand_array.length; i++) {
            if (max_num < rand_array[i]) {
                max_num = rand_array[i];
            }
        }

        //오름차순 정렬 
        // for (int i = 0; i < rand_array.length; i++) {
        //     int j = 0;
        //     for (j += i; j < rand_array.length; j++) {
        //         if (rand_array[i] < rand_array[j]) {
        //             temporary = rand_array[i];
        //             rand_array[i] = rand_array[j];
        //             rand_array[j] = temporary;
        //         }
        //     }
        // }

        //최대 최소 평균값 출력
        System.out.println("최대값:" + max_num);
        System.out.println("최소값:" + min_num);
        float avg = 0;

        for (int i = 0; i < rand_array.length; i++) {
            avg = avg + rand_array[i];
        }
        System.out.println(avg);
        float avg_num = avg / user_Num;
        System.out.println("평균값" + avg_num);

        //히스토그램 작성
        int min = -50;
        int max = -41;
        for (int i = 0; i < 10; i++) {
            System.out.print(min + "~" + max + ":");
            for (int j = 0; j < rand_array.length; j++) {
                if (rand_array[j] >= min && rand_array[j] <= max) {
                    System.out.print("*");
                }
            }
            System.out.println();
            min = min + 10;
            max = max + 10;
            if (i == 8) {
                max++;
            }

        }

    }
}

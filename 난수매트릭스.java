import java.util.Arrays;
import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class 난수매트릭스 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        final int line_matrix = 5;
        int rand_value = 0;
        int matrix[][] = new int[line_matrix][line_matrix];
        //중복X 랜덤값
        int rand_array[] = new int[line_matrix * line_matrix];
        for (int i = 0; i < rand_array.length; i++) {
            rand_value = (int) ((Math.random() * 50) + 1);
            for (int j = 0; j < rand_array.length; j++) {
                if (rand_array[j] == rand_value) {
                    rand_value = (int) ((Math.random() * 50) + 1);
                    j = -1;
                }
            }
            rand_array[i] = rand_value;
        }
        //1~50사이의 중복X 난수 25개 2차원 배열로 출력
        int rand_count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand_array[rand_count];
                rand_count++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // //버블소팅
        // int temporary = 0;
        // for (int i = 0; i < matrix.length; i++){
        //     for (int j = 0; j< matrix[i].length; j++){
        //         int k = 0;
        //         for (k += j; k< matrix[i].length; k++){
        //             if(matrix[i][j] < matrix[i][k]){
        //                 temporary = matrix[i][j];
        //                 matrix[i][j] = matrix[i][k];
        //                 matrix[i][k] = temporary;
        //             }
        //         }
        //         System.out.println(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        //열의 최대, 최소, 중간
        System.out.println("열");
        System.out.print("최소값    ");
        for (int i = 0; i < matrix.length; i++) {
            int min = 51;
            for (int j = 0; j < matrix.length; j++) {
                if (min > matrix[j][i]) {
                    min = matrix[j][i];
                }
            }
            System.out.print(min + "    ");
        }
        System.out.println();
        System.out.print("최대값    ");
        for (int i = 0; i < matrix.length; i++) {
            int max = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (max < matrix[j][i]) {
                    max = matrix[j][i];
                }
            }
            System.out.print(max + "    ");
        }
        System.out.println();
        System.out.print("중간값    ");
        int mid_row[] = new int[line_matrix];
        for (int i = 0;i < matrix.length;i++) {
            for (int j = 0; j < matrix.length; j++) {
                mid_row[j] = matrix[j][i];
            }
            Arrays.sort(mid_row);
            System.out.print(mid_row[2]+"     ");
        }
        
        //행의 최대, 최소, 중간
        System.out.println("행");
        System.out.println("최소값    최대값    중간값");
        for (int i = 0; i < matrix.length; i++) {
            int min = 51;
            for (int j = 0; j < matrix.length; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
            System.out.print("  " + min + "       ");
            int max = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
            System.out.print(max + "       ");
            //중간
            int mid = 0;
            Arrays.sort(matrix[i]);
            mid = matrix[i][2];
            
            System.out.println(mid);
            System.out.println();
        }
            //리스트 전체 대,소,중 값 찾기
            System.out.println("전체");
            System.out.print("최소값 : ");
            int min = 51;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (min > matrix[i][j]) {
                        min = matrix[i][j];
                    }
                }
            }
            System.out.println(min);
            System.out.print("최대값 : ");
            int max = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (max < matrix[i][j]) {
                        max = matrix[i][j];
                    }
                }
            }
            System.out.println(max);
            Arrays.sort(rand_array);
            System.out.print("중간값 : ");
            System.out.println(rand_array[(rand_array.length) / 2]);
        }
    }

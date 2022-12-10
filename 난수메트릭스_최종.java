import java.util.Scanner;
public class 연습_난수메트릭스 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //1~50사이의 중복x 난수 25개를 2차원에 넣음
        final int LINE = 5;
        int matrix[][] = new int[LINE][LINE];
        int rand = 0;
        //1,2 번째의 2중포문은 값을 배열에 넣을때 씀
        for (int i = 0; i < matrix.length; i++) {           
            for (int j = 0; j < matrix.length; j++) {
                rand = (int) ((Math.random() * 50) + 1);
                //3,4 번째의 2중포문은 랜덤하게 나온 값을 배열 첫째 자리부터 끝까지 검사할때 씀
                for (int k = 0; k < matrix.length; k++) {
                    for (int l = 0; l < matrix.length; l++) {
                        if (matrix[k][l] == rand) {
                            l = -1;
                            k = -1;
                            rand = (int) ((Math.random() * 50) + 1);
                            break;
                        }
                    }
                }
                matrix[i][j] = rand;
                System.out.print(matrix[i][j] + ",");
            }
            System.out.println();
        }
        //열의 최소,대,중 구하기
        int count = 0;
        int col_array[] = new int[matrix.length];
        int col_min = 51;
        int col_max = 0;
        System.out.println("열");
        System.out.print("최소값 : ");
        for (int i = 0; i < matrix.length; i++) {
            col_array[i] = matrix[i][count];
            if (i == 4) {
                for (int j = 0; j < col_array.length; j++) {
                    if (col_min > col_array[j]) {
                        col_min = col_array[j];
                    }
                }
                System.out.print(col_min + ",");
                count++;
                if (count == 5)
                    break;
                i = -1;
                col_min = 51;
            }
        }
        System.out.println();
        count = 0;
        System.out.print("최대값 : ");
        for (int i = 0; i < matrix.length; i++) {
            col_array[i] = matrix[i][count];
            if (i == 4) {
                for (int j = 0; j < col_array.length; j++) {
                    if (col_max < col_array[j]) {
                        col_max = col_array[j];
                    }
                }
                System.out.print(col_max + ",");
                count++;
                if (count == 5)
                    break;
                i = -1;
                col_max = 0;
            }
        }
        System.out.println();
        count = 0;
        System.out.print("중간값 : ");
        int temporary = 0;
        for (int i = 0; i < matrix.length; i++) {
            col_array[i] = matrix[i][count];
            if (i == 4) {
                //뽑아온 1차원 배열을 정렬시키고 중간값을 가져옴
                for (int j = 0; j < matrix.length; j++) {
                    for (int k = 0; k < matrix.length; k++) {
                        if (col_array[j] < col_array[k]) {
                            temporary = col_array[j];
                            col_array[j] = col_array[k];
                            col_array[k] = temporary;
                        }
                    }
                }
                System.out.print(col_array[2] + ",");
                count++;
                if (count == 5)
                    break;
                i = -1;
            }
        }
        count = 0;
        int row_min = 51;
        int row_max = 0;
        System.out.println();
        System.out.println("행");
        System.out.println("최소값     최대값      중간값");
        int row_array[] = new int[LINE];
        for (int i = 0; i < matrix.length; i++) {
            row_array[i] = matrix[count][i];
            if (i == 4) {
                row_min = 51;
                for (int j = 0; j < matrix.length; j++) {
                    if (row_array[j] < row_min) {
                        row_min = row_array[j];
                    }
                }
                row_max = 0;
                for (int j = 0; j < matrix.length; j++) {
                    if (row_array[j] > row_max) {
                        row_max = row_array[j];
                    }
                }
                //뽑아온 1차원 배열을 정렬시키고 중간값을 가져옴
                for (int j = 0; j < matrix.length; j++) {
                    for (int k = 0; k < matrix.length; k++) {
                        if (row_array[j] < row_array[k]) {
                            temporary = row_array[j];
                            row_array[j] = row_array[k];
                            row_array[k] = temporary;
                        }
                    }
                }
                System.out.println("  " + row_min + "        " + row_max + "       " + row_array[2]);
                count++;
                i = -1;
                if (count == 5)
                    break;
            }
        }
        System.out.println("전체");
        //1차원 배열을 하나 더 만들어서 matrix안의 값을 옮겨준다
        int rand_array[] = new int[LINE * LINE];
        count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                rand_array[count] = matrix[i][j];
                count++;
            }
        }
        //그리고 전부 오름차순으로 정렬시킴
        temporary = 0;
        for (int i = 0; i < rand_array.length; i++) {
            for (int j = 0; j < rand_array.length; j++) {
                if (rand_array[i] < rand_array[j]) {
                    temporary = rand_array[i];
                    rand_array[i] = rand_array[j];
                    rand_array[j] = temporary;
                }
            }
        }
        System.out.println("최소값 : " + rand_array[0]);
        System.out.println("최대값 : " + rand_array[rand_array.length-1]);
        System.out.println("중간값 : "+ rand_array[rand_array.length/2]);
    }
}

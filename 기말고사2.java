import java.util.Scanner;

public class 기말고사2 {
    public static void main(String[] args) {
        //NXN의 배열 만들고 그 안에 -20 ~20 사이의 정수를 배열로 넣기
        System.out.println("N X N 2차원 배열 생성을 위한, N값을 입력 하세요");
        Scanner scn = new Scanner(System.in);
        int line = scn.nextInt();
        int matrix[][] = new int[line][line];
        int rand = 0;
        //중복 확인과 2차 배열에 -20 ~20사이의 난수 넣기
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                rand = (int) (Math.random() * 41) - 20;
                for (int k = 0; k < matrix.length; k++) {
                    for (int l = 0; l < matrix.length; l++) {
                        if (matrix[k][l] == rand) {
                            rand = (int) (Math.random() * 41) - 20;
                            k = -1;
                            l = -1;
                            break;
                        }
                    }
                }
                matrix[i][j] = rand;
            }
        }
        while (true) {
            System.out.println("=================================");
            System.out.println("1. N X N 내 모든 원소에 대한 평균값");
            System.out.println("2. N X N 내 좌 ~ 우 대각선 원소 합계 값");
            System.out.println("3. N X N 내 모든 원소 출력");
            System.out.println("4. 프로그램 종료");
            System.out.println("=================================");
            int user = scn.nextInt();
            //1번 선택시 모든값의 평균
            float avg = 0.0f;
            if (user == 1) {
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        avg = avg + matrix[i][j];
                    }
                }
                avg = avg / (line * line);
                System.out.println(line + "X" + line + "매트릭스 내 모든 원소에 대한 평균 값 : " + avg);
            }
            //2번 선택시 좌에서 우로 대각선 원소 합계
            int sum = 0;
            if (user == 2) {
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        if (i == j) {
                            sum = sum + matrix[i][j];
                        }
                    }
                }
                System.out.println(line + "X" + line + "매트릭스 내 좌->우 원소에 대한 합계 값 : " + sum);
            }
            //3번 선택시 모든 원소값 출력
            if (user == 3) {
                System.out.println("-20 ~20 사이의 중복되지 않는 난수 발생 결과");
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        System.out.print(matrix[i][j] + "\t");
                    }
                    System.out.println();
                }
            }
            //4 선택시 종료
            if (user == 4) {
                break;
            }
        }
    }
}
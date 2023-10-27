import java.util.Scanner;

public class num5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int [][] mass = new int[n][n];
        int maxIdx = mass.length - 1;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("%3d", mass[j][i]);
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum1 += mass[i][j];
                }
            }
        }
        System.out.println("Сумма главной диагонали: " + sum1);

        for (int i = maxIdx; i >= 0; i--) {
            sum2 += mass[i][maxIdx - i];
        }
        System.out.println("Сумма побочной диагонали: " + sum2);

        if (sum1 > sum2){
            System.out.println("Сумма главной диагонали больше");
        }
        else if (sum1 < sum2){
            System.out.println("Сумма побочной диагонали больше");
        }
        else if (sum1 == sum2) {
            System.out.println("Суммы диагоналей равны");
        }
    }
}
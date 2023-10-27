import java.util.Scanner;

class num1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] mass = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mass[i][j] = n*i + j;
            }
        }

        for (int i = 0 ; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.println(mass[j][i]);
            }
            System.out.println();
        }
    }
}
public class num4 {
    public static void main (String[] args){
        int n = 3;
        int [][] mass = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = n*i + j;
            }
        }
        System.out.println("Обычная матрица:");
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", mass[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = mass[i][j];
                mass[i][j] = mass[j][i];
                mass[j][i] = temp;
            }
        }
        System.out.println();
        System.out.println("Транспонированная матрица:");
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", mass[i][j]);
            }
            System.out.println();
        }
    }
}

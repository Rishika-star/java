
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int rowIndex = sc.nextInt();
        int colIndex = sc.nextInt();

        int rowSum = 0;
        int colSum = 0;

        for (int j = 0; j < cols; j++) {
            rowSum += arr[rowIndex][j];
        }

        for (int i = 0; i < rows; i++) {
            colSum += arr[i][colIndex];
        }

        System.out.println(rowSum + colSum);
        sc.close();
    }
}

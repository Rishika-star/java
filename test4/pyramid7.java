
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int id = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(id + " ");
                id++;
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
1
2 3
4 5 6
 */
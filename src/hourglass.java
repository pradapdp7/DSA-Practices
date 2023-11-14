import java.util.Scanner;

public class hourglass {
    public static void main(String[] args) {
        int array[][] = new int[6][6];
//        int array2[][] = new int[4][4];
        Scanner ip = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = ip.nextInt();
            }
        }
        int R = 6, C = 6;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < R - 2; i++) {
            for (int j = 0; j < C - 2; j++) {
                // Considering mat[i][j] as top left cell of
                // hour glass.
                int sum = (array[i][j] + array[i][j + 1] + array[i][j + 2]) +
                        (array[i + 1][j + 1]) +
                        (array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2]);
                max_sum = Math.max(max_sum, sum);
            }
        }
        System.out.println(max_sum);
    }
}

package Tinkoff_Exam_QA;
import java.util.Scanner;

public class YezhikChallenge {
    private int n, m;
    public YezhikChallenge() {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
    }

    public void Count(){
        int[][] grid = new int[m][n];
        int currentNumber = 1;

        for (int diagonal = 0; diagonal < n + m - 1; diagonal++) {
            int startRow = Math.max(0, diagonal - n + 1);
            int endRow = Math.min(diagonal, m - 1);
            int startCol = Math.min(diagonal, n - 1);
            int endCol = Math.max(0, diagonal - m + 1);

            for (int i = startRow, j = startCol; i <= endRow && j >= endCol; i++, j--) {
                grid[i][j] = currentNumber++;
            }
        }

        // Выводим заполненную сетку на экран
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

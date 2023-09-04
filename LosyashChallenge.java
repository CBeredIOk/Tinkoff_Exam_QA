package Tinkoff_Exam_QA;
import java.util.Scanner;

public class LosyashChallenge {

    private String squads;

    public LosyashChallenge(){
        Scanner scanner = new Scanner(System.in);
        squads = scanner.nextLine(); // Например: "3 3 3 3"
    }

    // Квадрат - фигура с равными сторонами.
    // Если использовать только 4 квадрата для построения бОльшего квадрата,
    // то это получится сделать при условии, что все 4 квадрата равной длины
    // В другом случае большой квадрат не получится построить,
    // придется использовать прямоугольники

    public void Answer() {

        long x = 0;
        long y = 0;
        long z = 0;
        long u = 0;

        String[] array = squads.split(" ");

        // Запишем длину 4-х квадратов
        x = Long.parseLong(array[0]);
        y = Long.parseLong(array[1]);
        z = Long.parseLong(array[2]);
        u = Long.parseLong(array[3]);

        if (x == y && x == z && x == u) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

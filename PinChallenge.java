package Tinkoff_Exam_QA;
import java.util.Scanner;

public class PinChallenge {
    private int t;

    public PinChallenge(){
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
    }

    public void Count() {

        int moss = 0; // количество мха

        // Появление мха создает своеобразный ромб, длина которого
        // равняется количеству пройденных минут
        // Поэтому, чтобы узнать количество мха по прошествию n минут,
        // нужно посчитать количество мха на ромбе, со стороной n

        if (t == 1) {
            moss = 1;
        } else if (t > 1) {
            moss = 4 * t - 4; // 4*n - мы по два раза посчитали углы, поэтому вычитаем количество углов в ромбе
        }

        System.out.println(moss);
    }
}

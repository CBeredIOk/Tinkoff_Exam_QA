package Tinkoff_Exam_QA;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter one of task: 1, 2, 3, 4");
        int task = scanner.nextInt();

        if (task == 1){
            BarashChallenge Barash = new BarashChallenge();
            Barash.Count();
        } else if (task == 2) {
            YezhikChallenge Yezhik = new YezhikChallenge();
            Yezhik.Count();
        } else if (task == 3) {
            LosyashChallenge Losyash = new LosyashChallenge();
            Losyash.Answer();
        } else if (task == 4) {
            PinChallenge Pin = new PinChallenge();
            Pin.Count();
        }
        else System.out.println("You didn't enter one of 1, 2, 3, 4. Retry");
    }
}

package Tinkoff_Exam_QA;

import java.util.Scanner;

public class BarashChallenge {

    private String input;

    public BarashChallenge() {

        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine(); // Считываем строчку ввода

    }

    public void Count(){

        int counterNull = 0; // Коилчество нулей, которые не нравятся Барашу.

        String[] arrayString = input.split("");
        char[] arrayChar = new char[arrayString.length];

        for (int i = 0; i < arrayString.length; i++) {
            arrayChar[i] = arrayString[i].charAt(0);
        }

        int k = 0; // C какой позиции вначале начнем отсчет нулей
        int l = 0; // C какой позиции в конце начнем отсчет нулей

        boolean lets = false; // Показывает, начались ли значащий цифры вначале, false - нет

        for (int i = 0; i < arrayString.length; i++) {
            if (lets == false) {
                if (arrayChar[i] == '0') {
                    continue;
                } else {
                    lets = true;
                    k = i;
                }
            }
            break;
        }

        lets = false;
        for (int i = arrayString.length - 1; i >= 0; i--) {
            if (lets == false) {

                if (arrayChar[i] == '0') {
                    continue;
                } else {
                    lets = true;
                    l = i;
                }
            }
            break;
        }

        for (int i = k; i <= l; i++) {
            if (arrayChar[i] == '0') {
                counterNull++;
            }
        }
        System.out.println(counterNull);
    }
}
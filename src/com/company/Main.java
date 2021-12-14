package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int x = in.nextInt();
        if (x == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - пуд");
            int mass = in.nextInt();
            if (mass!=1&mass!= 2 & mass != 3) {
                System.out.println("начните заново и введидите 1, 2 или 3");
            } else {
                System.out.println("Введите количество выбранных единиц:");
                int amountm = in.nextInt();
                //float[] massrez = new float[3];
                float[] massrez = {1, 0.453F, 16.38F};
                float kg = amountm / massrez[mass - 1];
                System.out.printf("Результат: \n" +
                        "> Килограммы: %.0f\n" +
                        "> Фунты: %.2f\n" +
                        "> Пуды: %.2f\n", kg, kg * massrez[1], kg * massrez[2]);
            }
        }
        else if (x == 2.) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int dist = in.nextInt();
            if (dist!=1&dist!= 2 & dist != 3) {
                System.out.println("начните заново и введидите 1, 2, 3 или 4");
            }
                else {
                    System.out.println("Введите количество выбранных единиц:");
                    int amountd = in.nextInt();
                    float[] drez = {1, 0.0006F, 1.094F, 3.281F};
                    float m = amountd / drez[dist - 1];
                    System.out.printf("Результат: \n" +
                            "> Метры: %.0f\n" +
                            "> Мили: %.3f\n" +
                            "> Ярды: %.2f\n" +
                            "> Футы: %.2f\n", m, m * drez[1], m * drez[2], m * drez[3]);
                }
            }
        else System.out.println("начните заново и введите правильное число");
    }
}

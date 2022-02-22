package Nanosec160k;

import java.util.Random;

public class Nanosec160k {
    public static void main(String[] args) {
        int randomK = (int) (Math.random() * (100 + 1)) - 50;
        int[][] randomArrayAndHisCopy = getRandomArray();
        sorty(randomArrayAndHisCopy[0], randomArrayAndHisCopy[1]);
        System.out.println("Случайно сгенерированное число K = " + randomK + "\n");
        int[] sumTwoElementsArrayEqualsK = getTwoElementsArray(randomArrayAndHisCopy[0], randomK);
    }

    static int[][] getRandomArray() {
        int[] randomArray = new int[new Random().nextInt(25)];
        int[] randomArrayCopy = new int[randomArray.length];
        System.out.println("Случайно сгенерированный массив: ");

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * (100 + 1)) - 50;
            randomArrayCopy[i] = randomArray[i];
            System.out.print(randomArray[i] + " ");
        }
        System.out.println("" + "\n");
        return new int[][]{randomArray, randomArrayCopy};
    }

    static void sorty(int p[], int v[]) {
        System.out.println("Тот же массив, отсортированнный от меньшего элемента к большему: ");
        for (int j = 0; j < p.length; j++) {
            for (int i = j; i < p.length; i++) {
                if (p[i] < p[j]) {
                    p[j] = p[i];
                    p[i] = v[j];
                }

                for (int k = 0; k < p.length; k++) {
                    v[k] = p[k];
                }
            }
            System.out.print(p[j] + " ");
        }
        System.out.println(""  + "\n");
    }

    static int[] getTwoElementsArray(int[] x, int y) {
        int[] sumTwoElementsArrayEqualsK = new int[2];
        for (int j = 0; j < x.length; j++) {
            for (int i = 0; i < x.length; i++) {
                if (x[j] == (y - x[i]) && x[j] != x[i]) {
                    sumTwoElementsArrayEqualsK[0] = x[i];
                    sumTwoElementsArrayEqualsK[1] = x[j];

                }
            }
        }
        System.out.print("Эти два элемента массива дают в сумме значение числа  K (или два ноля если таковые отсутсвуют):" + "\n" + sumTwoElementsArrayEqualsK[0] + " " + sumTwoElementsArrayEqualsK[1] + " ");
        return sumTwoElementsArrayEqualsK;
    }
}

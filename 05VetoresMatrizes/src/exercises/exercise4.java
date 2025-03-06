package exercises;

import java.util.Arrays;
import java.util.Random;

public class exercise4 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] array = new Integer[15];
        Double[] arrayB = new Double[array.length];

        fillArray(array, random);
        sqrtArray(array, arrayB);

        System.out.println(Arrays.toString(array));
        showArrayB(arrayB);
    }

    public static void fillArray(Integer[] array, Random random) {
        int randomInt = random.nextInt(100);
        for (int i = 0; i < array.length; i++) {
            randomInt = random.nextInt(100);
            array[i] = randomInt;
        }
    }

    public static void sqrtArray(Integer[] array, Double[] arrayB) {
        for (int i = 0; i < array.length; i++) {
            arrayB[i] = Math.sqrt(array[i]);
        }
    }

    public static void showArrayB(Double[] array){
        for(double result: array){
            System.out.printf("%.2f ", result);
        }
    }
}

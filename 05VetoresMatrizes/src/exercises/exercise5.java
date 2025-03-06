package exercises;

import java.util.Arrays;
import java.util.Random;

public class exercise5 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] array = new Integer[5];
        Integer[] arrayB = new Integer[array.length];

        fillArray(array, random);
        calculateArray(array, arrayB);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayB));
    }

    public static void fillArray(Integer[] array, Random random) {
        int randomInt = random.nextInt(100);
        for (int i = 0; i < array.length; i++) {
            randomInt = random.nextInt(100);
            array[i] = randomInt;
        }
    }

    public static void calculateArray(Integer[] array, Integer[] arrayB) {
        for (int i = 0; i < array.length; i++) {
            arrayB[i] = array[i] * i;
        }
    }
}

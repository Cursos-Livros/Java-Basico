package exercises;

import java.util.Arrays;
import java.util.Random;

public class exercise7 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] array = new Integer[10];
        Integer[] arrayB = new Integer[array.length];
        Integer[] arrayC = new Integer[array.length];

        fillArrayRandomNumbers(array, random);
        fillArrayRandomNumbers(arrayB, random);
        calculateArray(array, arrayB, arrayC);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayB));
        System.out.println(Arrays.toString(arrayC));
    }

    public static void fillArrayRandomNumbers(Integer[] array, Random random) {
        int randomInt = random.nextInt(100);
        for (int i = 0; i < array.length; i++) {
            randomInt = random.nextInt(100);
            array[i] = randomInt;
        }
    }

    public static void calculateArray(Integer[] array, Integer[] arrayB, Integer[] arrayC) {
        for (int i = 0; i < array.length; i++) {
            arrayC[i] = array[i] - arrayB[i];
        }
    }

}

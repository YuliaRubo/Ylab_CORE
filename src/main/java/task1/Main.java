package task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] myArray = new int[5][5];
        addToArray(myArray);
        System.out.println(Arrays.deepToString(myArray));
        System.out.println(max(myArray));
        System.out.println(min(myArray));
        System.out.println(avg(myArray));
    }
    public static void addToArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = (int) (Math.random() * 100+1);
    }

    public static int max(int[][] arr) {
        var max = Integer.MIN_VALUE;
        for (int[] ints : arr)
            for (int anInt : ints)
                if (anInt > max)
                    max = anInt;
        return max;
    }

    public static int min(int[][] arr) {
        var min = Integer.MAX_VALUE;
        for (int[] ints : arr)
            for (int anInt : ints)
                if (anInt < min)
                    min = anInt;
        return min;
    }

    public static double avg(int[][] arr) {
        int sum = 0;
        var n = arr.length * arr[0].length;
        for (int[] i : arr)
            for (int a : i)
                sum += a;
        return (sum + 0.0) / n;
    }
}


package ru.ifellow.JSchool.introdution;

import java.util.Arrays;
import java.util.Collections;

public class FirstSteps {

    public int sum (int x, int y){
        return x + y;
    }

    public int mul (int x, int y){
        return x * y;
    }

    public int div (int x, int y){
        return x / y;
    }

    public int mod (int x, int y){
        return x % y;
    }

    public boolean isEqual (int x, int y){
        return x == y;
    }

    public boolean isGreater (int x, int y){
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){
        return xLeft <= x && x <= xRight && yTop <= y && y <= yBottom;
    }

    public int sum(int[] array){
        return array.length == 0 ? 0 : Arrays.stream(array).sum();
    }

    public int mul(int[] array){
        int mul = 1;
        for (int i : array){
            mul *= i;
        }
        return array.length == 0 ? 0 : mul;
    }

    public int min(int[] array){
        return array.length == 0 ? Integer.MAX_VALUE : Arrays.stream(array).min().getAsInt();
    }

    public int max(int[] array){
        return array.length == 0 ? Integer.MIN_VALUE : Arrays.stream(array).max().getAsInt();
    }

    public double average(int[] array){
        return array.length == 0 ? 0 : Arrays.stream(array).average().getAsDouble();
    }

    public boolean isSortedDescendant(int[] array){
        int[] sortedArray = Arrays.stream(array).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue).toArray();
        return array.length == 0 ? true : Arrays.equals(array,sortedArray);
    }

    public void cube(int[]array){
        array = Arrays.stream(array).map(x ->(int) Math.pow(x,3)).toArray();
    }

    public boolean find(int[]array, int value){
        return Arrays.asList(Arrays.stream(array).boxed().
                toArray()).contains(value);
    }

    public void reverse(int[]array) {
        array = Arrays.stream(array).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue).
                toArray();
    }

    public boolean isPalindrome(int[]array){
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return array.length == 0 ? true : Arrays.equals(array,reversed);
    }

    public int sum(int[][] matrix){
        int sum = 0;
        for(int[] i : matrix){
            sum += Arrays.stream(i).sum();
        }
        return sum;
    }

    public int max(int[][] matrix){
        int max = 0;
        for(int[] i : matrix){
            max = Math.max(Arrays.stream(i).max().getAsInt(), max);
        }
        return max == 0 ? Integer.MIN_VALUE : max;
    }

    public int diagonalMax(int[][] matrix){
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            max = Math.max(matrix[i][i], max);
        }
        return max == 0 ? Integer.MIN_VALUE : max;
    }

    public boolean isSortedDescendant(int[][] matrix){
        boolean result = false;
        for (int[] i : matrix){
            result = isSortedDescendant(i);
        }
        return result;
    }
}

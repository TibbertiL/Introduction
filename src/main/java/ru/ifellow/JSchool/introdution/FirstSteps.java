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
        if(array == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }

        return array.length == 0 ? 0 : Arrays.stream(array).sum();
    }

    public int mul(int[] array){
        if(array == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }

        int mul = 1;
        for (int i : array){
            mul *= i;
        }
        return array.length == 0 ? 0 : mul;
    }

    public int min(int[] array){
        if(array == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }

        return array.length == 0 ? Integer.MAX_VALUE : Arrays.stream(array).min().getAsInt();
    }

    public int max(int[] array){
        if(array == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }

        return array.length == 0 ? Integer.MIN_VALUE : Arrays.stream(array).max().getAsInt();
    }

    public double average(int[] array){
        if(array == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }

        return array.length == 0 ? 0 : Arrays.stream(array).average().getAsDouble();
    }

    public boolean isSortedDescendant(int[] array){
        if(array == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }

        int[] sortedArray = Arrays.stream(array).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue).toArray();
        return array.length == 0 ? true : Arrays.equals(array,sortedArray);
    }

    public void cube(int[]array){
        if(array == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }

        array = Arrays.stream(array).map(x ->(int) Math.pow(x,3)).toArray();
    }

    public boolean find(int[]array, int value){
        if(array == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }

        return Arrays.asList(Arrays.stream(array).boxed().
                toArray()).contains(value);
    }

    public void reverse(int[]array) {
        if(array == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }

        array = Arrays.stream(array).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue).
                toArray();
    }

    public boolean isPalindrome(int[]array){
        if(array == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }

        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return array.length == 0 ? true : Arrays.equals(array,reversed);
    }

    public int sum(int[][] matrix){
        if(matrix == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }

        int sum = 0;
        for(int[] i : matrix){
            sum += Arrays.stream(i).sum();
        }
        return sum;
    }

    public int max(int[][] matrix){
        if(matrix == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }

        int max = 0;
        for(int[] i : matrix){
            max = Math.max(Arrays.stream(i).max().getAsInt(), max);
        }
        return max == 0 ? Integer.MIN_VALUE : max;
    }

    public int diagonalMax(int[][] matrix){
        if(matrix == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }

        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            max = Math.max(matrix[i][i], max);
        }
        return max == 0 ? Integer.MIN_VALUE : max;
    }

    public boolean isSortedDescendant(int[][] matrix){
        if(matrix == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }

        boolean result = false;
        for (int[] i : matrix){
            result = isSortedDescendant(i);
        }
        return result;
    }
}

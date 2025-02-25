package ru.ifellow.JSchool.introdution;

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
        if(array.length == 0) return 0;
        int sum = 0;
        for (int i : array){
            sum += i;
        }
        return sum;
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

        int min = Integer.MAX_VALUE;
        for(int i : array){
            if (min > i){
                min = i;
            }
        }
        return array.length == 0 ? Integer.MAX_VALUE : min;
    }

    public int max(int[] array){
        if(array == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }

        int max = Integer.MIN_VALUE;
        for(int i : array){
            if (max < i){
                max = i;
            }
        }
        return array.length == 0 ? Integer.MAX_VALUE : max;
    }

    public double average(int[] array){
        if(array == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }

        int avg = 0;
        for(int i : array){
            avg += i;
        }

        return array.length == 0 ? 0 : (double) avg / array.length;
    }

    public boolean isSortedDescendant(int[] array){
        if(array == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }
        if (array.length < 2) {
            return true;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public void cube(int[]array){
        if(array == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }

        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            array[i] = num * num * num;
        }
    }

    public boolean find(int[]array, int value){
        if(array == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }

        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[]array) {
        if(array == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }

        int remember;
        for (int i = 0; i < array.length / 2; i++) {
            remember = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = remember;
        }
    }

    public boolean isPalindrome(int[]array){
        if(array == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }
        if (array.length == 0) {
            return true;
        }
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public int sum(int[][] matrix){
        if(matrix == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }

        int sum = 0;
        for (int[] row : matrix) {
            sum += sum(row);
        }
        return sum;
    }

    public int max(int[][] matrix){
        if(matrix == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }

        if (matrix.length == 0 || matrix[0].length == 0) return Integer.MIN_VALUE;

        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            int rowMax = max(row);
            if (rowMax > max) {
                max = rowMax;
            }
        }
        return max;
    }

    public int diagonalMax(int[][] matrix){
        if(matrix == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }

        if(matrix.length == 0 || matrix[0].length == 0) return Integer.MIN_VALUE;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > max) {
                max = matrix[i][i];
            }
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix){
        if(matrix == null){
            throw new IllegalArgumentException("Передан null вместо массива.");
        }

        for (int[] i : matrix){
            if (!isSortedDescendant(i)) {
                return false;
            }
        }
        return true;
    }
}

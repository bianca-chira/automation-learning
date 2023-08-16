package ArrayExercises;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       // Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
        System.out.println(ArrayExercises.firstLast6(new int[]{1,2,6}));


        // Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more
        System.out.println(ArrayExercises.commonEnd(new int []{1,2,3}, new int[] {7,3}));


       // Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
        System.out.println(Arrays.toString(ArrayExercises.reverse3(new int[]{1, 2, 3})));


       // Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
        System.out.println(Arrays.toString(ArrayExercises.middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
    }
}


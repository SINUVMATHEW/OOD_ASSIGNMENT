package com.ilp03.asspart1;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        String[] orgNames = {"minu", "zobe", "lala", "Dave", "Eve"};
        String[] names = orgNames;
        
        // Display original array
        System.out.println("Original array: " + Arrays.toString(names));
        
        // Sort the array in ascending order
        Arrays.sort(names);
        
        // Display sorted array
        System.out.println("Sorted array in ascending order: " + Arrays.toString(names));
    }
}

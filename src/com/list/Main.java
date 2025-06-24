// Java program to demonstrate LinkedList<>

package com.list;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import static javax.swing.SortOrder.*;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating LinkedList<>
        List<Integer> list = new ArrayList<>();

        // Adding elements to created list
        list.add(11);
        list.add(12);
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(90);
        list.add(52);
        list.add(83);
        list.add(81);

        // Printing fulfilled list to console
        System.out.println(list);

        for (SortOrder sorted: SortOrder.values()){
            System.out.println(sorted);
            if(sorted.equals(ASCENDING)){
                Collections.sort(list);
                System.out.print(list);
                System.out.println();
            }
            if(sorted.equals(DESCENDING)){
                Collections.sort(list, Comparator.reverseOrder());
                System.out.print(list);
                System.out.println();
            }
            if(sorted.equals(UNSORTED)){
                System.out.println(list);
            }
        }
    }
}
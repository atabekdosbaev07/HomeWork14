package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);  set2.add(0);
        set1.add(2);  set2.add(1);
        set1.add(3);  set2.add(2);

        System.out.print("Мисалы: "+set1);
        System.out.println(" жана "+set2);

        Set<Integer> set3 = symmetricDifference(set1,set2);
        System.out.println("Жооп: "+set3);

    }
    public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2){

        Set<Integer> arr = new HashSet<>(set1);
        arr.addAll(set2);

        Set<Integer> arr1 = new HashSet<>(arr);
        arr1.retainAll(set1);
        arr1.retainAll(set2);
        arr.removeAll(arr1);

        return arr;
    }
}
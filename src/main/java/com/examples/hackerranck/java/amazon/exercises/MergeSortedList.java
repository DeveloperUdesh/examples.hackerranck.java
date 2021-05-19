package com.examples.hackerranck.java.amazon.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MergeSortedList {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> sortedList1;
        sortedList1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        List<Integer> sortedList2;
        sortedList2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        System.out.println("Sorted List 1: " + sortedList1);
        System.out.println("Sorted List 2: " + sortedList2);

        List<Integer> mergedSortedList = new ArrayList<>();
        mergedSortedList.addAll(sortedList1);
        mergedSortedList.addAll(sortedList2);
        System.out.println(Arrays.toString(mergedSortedList.stream().sorted().toArray()));
        bufferedReader.close();
    }
}

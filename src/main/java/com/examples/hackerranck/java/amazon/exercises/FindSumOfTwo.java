package com.examples.hackerranck.java.amazon.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FindSumOfTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] a = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int n = Integer.parseInt(a[0]);
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        boolean result = findSumOfTwo(n, arr);
        System.out.println(result);
        bufferedReader.close();
    }

    private static boolean findSumOfTwo(int n, List<Integer> arr) {
        Set<Integer> foundValues = new HashSet<>();
        for (Integer in : arr) {
            if (foundValues.contains(n - in)) {
                return true;
            }
            foundValues.add(in);
        }
        return false;
    }
}

package com.examples.hackerranck.java.amazon.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FindMissing {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] a = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int n = Integer.parseInt(a[0]);
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = findMissing(n, arr);
        System.out.println(result);
        bufferedReader.close();
    }

    private static int findMissing(int i, List<Integer> arr) {
        int sum_of_elements = 0;
        for (Integer in : arr) {
            sum_of_elements += in;
        }
        int n = arr.size() + 1;
        int actual_sum = (n * (n + 1)) / 2;

        return actual_sum - sum_of_elements;
    }
}

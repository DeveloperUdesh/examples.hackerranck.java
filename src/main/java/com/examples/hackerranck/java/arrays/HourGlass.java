package com.examples.hackerranck.java.arrays;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class HourGlass {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/output.txt"));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = hourglassSum(arr);

        System.out.println("result :" + result);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    private static int hourglassSum(List<List<Integer>> arrList) {
        int temp = -1000;
        Integer[][] arr = arrList.stream()
                .map(l -> l.toArray(new Integer[0]))
                .toArray(Integer[][]::new);
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int top = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                int middle = arr[i + 1][j + 1];
                int bottom = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (top + middle + bottom > temp) {
                    temp = top + middle + bottom;
                }
            }
        }
        return temp;
    }

}


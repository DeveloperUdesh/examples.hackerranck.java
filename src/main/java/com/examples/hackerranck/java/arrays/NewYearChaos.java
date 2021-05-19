package com.examples.hackerranck.java.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class NewYearChaos {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().trim());
        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> q = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                minimumBribes(q);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    private static void minimumBribes(List<Integer> q) {
        Integer[] a = q.toArray(new Integer[q.size()]);
        int ans = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            int ch_pos = a[i] - (i + 1);
            if (ch_pos > 2) {
                System.out.println("Too chaotic");
                return;
            } else {
                int st = Math.max(0, a[i] - 2);
                for (int j = st; j < i; j++) {
                    if (a[j] > a[i]) ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

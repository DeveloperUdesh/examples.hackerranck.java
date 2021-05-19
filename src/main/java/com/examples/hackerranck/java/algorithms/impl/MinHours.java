package com.examples.hackerranck.java.algorithms.impl;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MinHours {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] mnr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int m = Integer.parseInt(mnr[0]);

		int n = Integer.parseInt(mnr[1]);

		List<List<Integer>> matrix = new ArrayList<>();

		getMatrix(bufferedReader, m, matrix);

		System.out.println(matrix.toString());
		bufferedReader.close();
	}

	private static void getMatrix(BufferedReader bufferedReader, int m, List<List<Integer>> matrix) {
		IntStream.range(0, m).forEach(i -> {
			try {
				matrix.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt).collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});
	}

}

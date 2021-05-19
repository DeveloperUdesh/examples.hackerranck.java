package com.examples.hackerranck.java.algorithms.impl;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LayerRotation {

	// Complete the matrixRotation function below.
	static void matrixRotation(List<List<Integer>> matrix, int r) {
		System.out.println(matrix.toString());

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/LayerRotationInput.txt"));

		String[] mnr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int m = Integer.parseInt(mnr[0]);

		int n = Integer.parseInt(mnr[1]);

		int r = Integer.parseInt(mnr[2]);

		List<List<Integer>> matrix = new ArrayList<>();

		IntStream.range(0, m).forEach(i -> {
			try {
				matrix.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt).collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		matrixRotation(matrix, r);

		bufferedReader.close();
	}
}

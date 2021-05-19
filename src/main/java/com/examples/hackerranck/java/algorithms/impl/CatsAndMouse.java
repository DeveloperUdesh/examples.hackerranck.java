package com.examples.hackerranck.java.algorithms.impl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * The Class CatsAndMouse.
 */
public class CatsAndMouse {

	/**
	 * Cat and mouse.
	 *
	 * @param x the x
	 * @param y the y
	 * @param z the z
	 * @return the string
	 */
	// Complete the catAndMouse function below.
	static String catAndMouse(int x, int y, int z) {
		if (x >= 1 && x <= 100 && y >= 1 && y <= 100 && z >= 1 && z <= 100) {
			int xDiff = Math.abs(x - z);
			int yDiff = Math.abs(y - z);

			if (xDiff == yDiff) {
				return "Mouse C";
			} else if (xDiff > yDiff) {
				return "Cat B";
			} else {
				return "Cat A";
			}
		}
		return null;
	}

	/** The Constant scanner. */
	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/output.txt"));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		if (q >= 1 && q <= 100) {
			for (int qItr = 0; qItr < q; qItr++) {
				String[] xyz = scanner.nextLine().split(" ");

				int x = Integer.parseInt(xyz[0]);

				int y = Integer.parseInt(xyz[1]);

				int z = Integer.parseInt(xyz[2]);

				String result = catAndMouse(x, y, z);

				bufferedWriter.write(result);
				bufferedWriter.newLine();
			}
		}

		bufferedWriter.close();

		scanner.close();
	}
}

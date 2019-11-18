package com.examples.hackerranck.java.warmupchallenges;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {

	private static final Scanner scanner = new Scanner(System.in);

	// Complete the countingValleys function below.
	static int countingValleys(int n, String s) {

		int level = 0;
		int valleys = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'U' || s.charAt(i) == 'u') {
				level++;
			} else if (s.charAt(i) == 'D' || s.charAt(i) == 'd') {
				if (level == 0) {
					valleys++;
				}
				level--;
			}
		}
		return valleys;
	}

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/output.txt"));
		int result = 0;
		System.out.println("Enter no of steps :");
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		if (n >= 2 && n <= 10000000) {
			System.out.println("Enter step details :");
			String s = scanner.nextLine();
			result = countingValleys(n, s);
		}
		System.out.println(result);
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

}

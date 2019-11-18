package com.examples.hackerranck.java.warmupchallenges;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {

		long countForSubstring = 0;
		long totalCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				countForSubstring++;
			}
		}
		// Determines how many complete substrings we will analyze
		long divisor = n / s.length();

		totalCount += divisor * countForSubstring;

		// Determines how many characters in we will analyze towards the end of our n
		// range
		long remainder = n % s.length();

		for (int i = 0; i < remainder; i++) {
			if (s.charAt(i) == 'a') {
				totalCount++;
			}
		}

		return totalCount;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/output.txt"));
		String s = scanner.nextLine();
		long n = scanner.nextLong();
		long result = 0;
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		int sLength = s.length();
		if (sLength > 0 && sLength < 101 && n > 0 && n < 1000000000001L) {
			result = repeatedString(s, n);
		}
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		bufferedWriter.close();
		scanner.close();
	}

}

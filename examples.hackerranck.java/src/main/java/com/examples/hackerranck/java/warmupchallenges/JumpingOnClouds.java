package com.examples.hackerranck.java.warmupchallenges;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JumpingOnClouds {

	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c) {
		int jumps = 0;
		int zero = 0;
		for (int i = 0; i < c.length; i++) {
			if(c[i]==1) {
	            jumps += zero/2+1;
	            zero = 0;
	        }
	        else
	            zero ++;
	    }
	    jumps += zero/2;
		return jumps;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/output.txt"));

		int result = 0;
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] c = new int[n];

		String[] cItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		if (cItems.length == n && cItems[0].equalsIgnoreCase("0") && cItems[n - 1].equalsIgnoreCase("0")) {
			for (int i = 0; i < n; i++) {
				int cItem = Integer.parseInt(cItems[i]);
				if (cItem == 1 || cItem == 0) {
					c[i] = cItem;
				} else {
					break;
				}
			}
			if (c.length == n)
				result = jumpingOnClouds(c);
		}
		System.out.println(result);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}

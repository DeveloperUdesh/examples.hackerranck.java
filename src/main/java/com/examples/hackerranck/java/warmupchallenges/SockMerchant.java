package com.examples.hackerranck.java.warmupchallenges;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SockMerchant {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, List<Integer> ar) {
		int pairs = 0;
		HashMap<Integer, Integer> colors = new HashMap<Integer, Integer>();
		if (n > 0 && n < 100 && ar.size() == n) {
			for (int i = 0; i < n; i++) {
				Integer key = ar.get(i);
				Integer frequency = colors.get(key);

				if (frequency == null) {
					colors.put(key, 1);
				} else {
					colors.put(key, frequency + 1);
				}
			}
			for (Integer frequency : colors.values()) {
				pairs += frequency >> 1;
			}
			System.out.println(pairs);
			return pairs;
		}
		return pairs;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/output.txt"));
		try {
			System.out.print("Enter No of Socks : ");
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			List<Integer> ar = new ArrayList<Integer>();
			System.out.print("Enter " + n + " Sock colors : ");
			String[] arItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			for (int i = 0; i < n; i++) {
				int arItem = Integer.parseInt(arItems[i]);
				ar.add(i, arItem);
			}
			int result = sockMerchant(n, ar);
			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
		} finally {
			bufferedWriter.close();
			scanner.close();
		}
	}
}

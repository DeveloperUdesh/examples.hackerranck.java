package com.examples.hackerranck.java.algorithms.impl;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class LastStone {
	LastStone lastStoneWeight;


	public static int lastStoneWeight(List<Integer>  stones) {
		if (stones == null)
			return 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (Integer stone : stones) {
			pq.offer(stone);
		}
		while (pq.size() > 1) {
			int first = pq.poll();
			int second = pq.poll();
			if (first != second) {
				int rem = Math.abs(first - second);
				pq.offer(rem);
			}
		}
		return pq.size() == 1 ? pq.poll() : 0;
	}
	
	public static void main(String[] args) {
		List<Integer> stones = null;
		int weight = lastStoneWeight(stones);
	}

}
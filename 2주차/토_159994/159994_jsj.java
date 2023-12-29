package com.example.algorithm.programmers.level_1;

public class 카드_뭉치 {
	public static void main(String[] args) {
		String[] cards1 = {"i", "water", "drink"};
		String[] cards2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};

		print(cards1, cards2, goal);
	}

	private static void print(String[] cards1, String[] cards2, String[] goal) {
		String solution = solution(cards1, cards2, goal);
		System.out.println("solution = " + solution);
	}

	public static String solution(String[] cards1, String[] cards2, String[] goal) {
		int idx1 = 0;
		int idx2 = 0;
		for (int i = 0; i < goal.length; i++) {
			if (goal[i].equals(cards1[idx1])) {
				idx1 = idx1 < cards1.length - 1 ? idx1+1 : idx1;
			} else if (goal[i].equals(cards2[idx1])) {
				idx2 = idx2 < cards2.length - 1 ? idx2 + 1 : idx2;
			} else {
				return "No";
			}
		}
		return "Yes";
	}
}

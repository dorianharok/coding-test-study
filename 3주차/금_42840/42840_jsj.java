import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사 {
	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};

		print(answers);
	}

	private static void print(int[] answers) {
		int[] solution = solution(answers);
		System.out.println("solution = " + Arrays.toString(solution));
	}

	public static int[] solution(int[] answers) {
		int[] person1 = {1,2,3,4,5};
		int[] person2 = {2,1,2,3,2,4,2,5};
		int[] person3 = {3,3,1,1,2,2,4,4,5,5};
		int[] score = {0,0,0};

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == person1[i % person1.length])score[0]++;
			if (answers[i] == person2[i % person2.length])score[1]++;
			if (answers[i] == person3[i % person3.length])score[2]++;
		}

		int maxScore = Math.max(score[0],Math.max(score[1],score[2]));

		ArrayList<Integer> list = new ArrayList<>();
		if(maxScore ==score[0])list.add(1);
		if(maxScore ==score[1])list.add(2);
		if(maxScore ==score[2])list.add(3);

		int[] answer = new int[list.size()];

		for(int i=0;i<answer.length;i++) {
			answer[i]=list.get(i);
		}

		return answer;
	}
}

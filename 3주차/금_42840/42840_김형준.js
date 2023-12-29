function solution(answers) {
  let answer = [];

  let man1 = [1,2,3,4,5];
  let man2 = [2,1,2,3,2,4,2,5];
  let man3 = [3,3,1,1,2,2,4,4,5,5];
  let score = [0, 0, 0];

  answers.forEach( (answer, i) => {
      if(answer == man1[i % 5]) score[0]++;
      if(answer == man2[i % 8]) score[1]++;
      if(answer == man3[i % 10]) score[2]++;
  })
  
  let max = Math.max(...score);
  score.forEach((score, i) => {
      if(score === max) answer.push(i+1)
  });
  
  return answer;
  }
function solution(N, stages) {
  let answer = [];
  for(let i=1; i<=N; i++){
      let success = stages.filter((x) => x >= i).length;
      let current = stages.filter((x) => x == i).length;
      answer.push([i, current/success]);
  }
  answer.sort((a,b) => b[1] - a[1]);
  return answer.map((x) => x[0]);
}
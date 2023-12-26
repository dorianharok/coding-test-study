function solution(k, m, score) {
  let answer = 0;
  let sorted = score.sort((a,b) => (b - a));
  for(let i = m; i <= sorted.length; i = i + m){
      answer += sorted[i - 1] * m;
  }
  return answer;
}
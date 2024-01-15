function solution(n) {
  let answer = 0; 
      let sol1 = 0;
      let sol2 = 1;
  for(let i = 2 ; i <= n + 1 ; i++) {
      answer = sol1 + sol2 % 1234567;
      sol1 = sol2;
      sol2 = answer;
  }
  return answer % 1234567;
}
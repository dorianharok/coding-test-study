function solution(s) {
  let arr = s.split("");
  let answer = arr.sort((a, b) => a > b ? -1 : 1).join("");
  return answer;
}
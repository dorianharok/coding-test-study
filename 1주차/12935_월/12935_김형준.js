function solution(arr) {
  let answer = [];
  if(arr.length === 1) return [-1];
  if(arr.length > 1) {
      arr.splice(arr.indexOf(Math.min(...arr)),1);
      answer = arr;
  }
  return answer;
}
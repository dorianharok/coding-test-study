function solution(x) {
  let str = x + "";
  let arr = str.split("");
  let sum = 0;
  for(let i=0; i<arr.length; i++) {
      sum += Number(arr[i]);
  }
  if(x % sum === 0) return true;
  else return false;
}
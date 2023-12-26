function solution(a, b, n) {
  let changeCoke = 0
  while(n >= a) {
      changeCoke += Math.floor(n/a)*b
      n = Math.floor(n/a)*b + n%a
  }
  return changeCoke
}
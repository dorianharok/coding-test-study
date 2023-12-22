function solution(n, m) {
  let mn = (a, b) => a % b === 0 ? b : mn(b, a % b);
  let mx = (a, b) => a * b / mn(a, b);
  return [mn(n, m), mx(n, m)];
}
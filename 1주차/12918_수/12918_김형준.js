function solution(s) {
  if((s.length === 4 || s.length === 6) && s.match(/[a-zA-Z]/g) === null) return true;
  else return false;
}
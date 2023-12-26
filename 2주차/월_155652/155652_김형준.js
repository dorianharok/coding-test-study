function solution(s, skip, index) {
  let answer = '';
  const alphabet = new Set('abcdefghijklmnopqrstuvwxyz');
  [...skip].forEach(value => alphabet.delete(value));

  const arr = [...alphabet];

  for (const el of s) {
    let idx = arr.indexOf(el) + index;
    answer += arr[idx % arr.length];
  }

  return answer;
}
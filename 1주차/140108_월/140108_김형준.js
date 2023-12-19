function solution(s) {
  let answer = 0;
let fixedChar = "";
let cnt1 = 0;
let cnt2 = 0;

for (let i=0; i<s.length; i++) {

  if (!fixedChar) fixedChar = s[i];
  
  if(fixedChar === s[i]) cnt1++;
  else cnt2++;

  if (cnt1 === cnt2) {
      answer++;
      cnt1 = 0;
      cnt2 = 0;
      fixedChar = "";
  }
}
if (fixedChar) answer++;
return answer;
}
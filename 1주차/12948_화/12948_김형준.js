function solution(phone_number) {
  
  let arr = phone_number.split("");
  let reverseArr = arr.reverse();
  let num = reverseArr.length - 4;
  reverseArr.splice(4, num);
  for(let i=0; i<num; i++) {
      reverseArr.push("*");
  }
  
  let answerArr = reverseArr.reverse();
  let answer = answerArr.join("");
  
  return answer;
}
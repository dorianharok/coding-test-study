function solution(proto, add) {
  let answerArr = [];
  let protoArr = proto.split("");
  for(let i=0; i<protoArr.length; i++) {
      
      let lower = "abcdefghijklmnopqrstuvwxyz";
      let upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      let lowerArr = lower.split("");
      let upperArr = upper.split("");
      
      if(protoArr[i] === " ") answerArr.push(" ");
      else if(protoArr[i].toUpperCase() !== protoArr[i]) {
          let lowerPoint = (lowerArr.indexOf(protoArr[i]) + add) % 26;
          answerArr.push(lowerArr[lowerPoint]);
      } else {
          let upperPoint = (upperArr.indexOf(protoArr[i]) + add) % 26;
          answerArr.push(upperArr[upperPoint]);
      }
  }
  let answer = answerArr.join("");
  return answer;
}
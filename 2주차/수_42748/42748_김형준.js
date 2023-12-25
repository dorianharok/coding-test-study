function solution(array, commands) {
  let answer = [];
  for(let i=0; i<commands.length; i++) {
     let arr = array.slice(commands[i][0] - 1, commands[i][1]);
      arr.sort((a, b) => a > b ? 1 : -1);
      let key = arr[commands[i][2] - 1];
      answer.push(key);
  }
  return answer;
}
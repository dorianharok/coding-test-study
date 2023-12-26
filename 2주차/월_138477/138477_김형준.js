function solution(k, score) {
  let answer = [];
  let oner = [];

  score.forEach((v,i)=>{

  oner.sort((a, b)=> b - a);

   if(i < k) oner.push(v)
   else{
    if(Math.min(...oner) < v){
     oner.pop()
     oner.push(v)
     }
    }
   answer.push(Math.min(...oner))
})
  
  return answer
}
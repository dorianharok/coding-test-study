function solution(babbling) {
  const src = ['aya','ye','woo','ma'];
  let count = 0;
  
  for(let i = 0; i < babbling.length; i++){
      let babble = babbling[i];
      
      for(let j = 0; j < src.length; j++){
          if(babble.includes(src[j].repeat(2))){
              break;
          }
          
          babble = babble.split(src[j]).join(" ");
      }
      
      if(babble.split(" ").join("").length === 0){
          count += 1;
      }
  }
  
  return count;
}
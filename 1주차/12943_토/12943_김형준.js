function solution(num) {
  let cnt = 0;
  if(num === 1) return 0;
  else {
      while(true) {
          if(num % 2 === 0) {
              num = parseInt(num / 2);
              cnt++;
          }
          else {
              if(num === 1) break;
              else {
                  num = num * 3 + 1;
                  cnt++;
              }
          } 
      } 
      if (cnt > 500) return -1;
      return cnt;
  }
  
}
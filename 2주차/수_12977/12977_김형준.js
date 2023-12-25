function solution(nums) {
  let cnt = 0;
  
  for(i=0; i<nums.length - 2; i++) {
      for(j=i+1; j<nums.length - 1; j++) {
          for(k=j+1; k<nums.length; k++) {
              let sum = nums[i] + nums[j] + nums[k]; 
              cnt++;
              
              for (let n = 2; n<=Math.sqrt(sum); n++) {
               
              if (sum % n === 0) {
                      cnt--;
                      break;
                  }
              }
          }
      }
  }
  return cnt;
}
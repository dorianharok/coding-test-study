function solution(nums) {
  let answer = 0;
  
  let Bag = [...new Set(nums)];
  let limit = nums.length / 2;
  
  return Bag.length > limit ? limit : Bag.length;
}
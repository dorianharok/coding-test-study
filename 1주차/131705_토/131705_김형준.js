function solution(numbers) {
  let arr = []

  for(let i=0; i<numbers.length; i++){
    for(let j=i+1; j<numbers.length; j++){
      for (let k=j+1; k<numbers.length; k++){
        arr.push(numbers[i]+numbers[j]+numbers[k])
      }
    }
  }
  let result = arr.filter((el) => el === 0).length;
  return result;
}
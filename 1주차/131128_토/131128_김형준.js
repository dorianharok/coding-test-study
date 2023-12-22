function solution(X, Y) {
  let arr = [];
  let arrX = X.split("");
  let arrY = Y.split("");
  for(let i=9; i>=0; i--) {
      let together = 0;
      let numX = 0;
      let numY = 0;
      for(let j=0; j<arrX.length; j++) {
          if(arrX[j] == i) numX++;
      }
      for(let k=0; k<arrY.length; k++) {
          if(arrY[k] == i) numY++;
      }
      for(let l=0; l<Math.min(numX, numY); l++) {
          arr.push(i);
      }
  }
  if (arr.length === 0) return "-1";
  if(Number(arr.join("")) === 0) return "0";
  else return arr.join("");
}
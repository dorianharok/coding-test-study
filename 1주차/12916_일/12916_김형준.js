function solution(s){
  let changed = s.toLowerCase();
  let arr = changed.split("");
  let arrP = arr.filter((el) => el === "p");
  let arrY = arr.filter((el) => el === "y");
  if(arrP.length === arrY.length) return true;
  else return false;
}
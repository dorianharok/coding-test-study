function solution(want, number, discount) {
  let cnt = 0;
  let cntArr = new Array(number.length).fill(0);

  const equals = (a, b) => JSON.stringify(a) === JSON.stringify(b);

  for (let i = 0; i < discount.length; i++) {
    let thing = discount[i];

    if (want.includes(thing)) {
      cntArr[want.indexOf(thing)]++;
    }

    if (i >= 9) {
      if (want.includes(discount[i - 10]))
        cntArr[want.indexOf(discount[i - 10])]--;
      if (equals(number, cntArr)) cnt++;
    }
  }
  return cnt;
}
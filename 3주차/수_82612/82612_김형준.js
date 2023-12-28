function solution(price, money, count) {
  let count_price = price * (count * (count + 1) / 2) - money;
      return count_price > 0 ? count_price : 0;
  }
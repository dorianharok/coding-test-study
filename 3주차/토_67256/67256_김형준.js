function solution(numbers, hand) {

  function findKey(key) {
      let phone = [[1, 2, 3], [4, 5, 6], [7, 8, 9], ['*', 0, '#']];
      for (let i = 0; i < 4; i++) {
          for (let j = 0; j < 3; j++) {
              if (phone[i][j] === key) {
                  return [i, j];
              }
          }
      }
  }
}
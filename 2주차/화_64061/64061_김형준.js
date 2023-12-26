function solution(board, moves) {
  let count = 0;
  let goal = [];

  let newBoard = Array.from(Array(board.length), () => Array());

  for (let i = 0; i < board.length; i++) {
    for (let j = 0; j < board.length; j++) {
      newBoard[j].push(board[i][j]);
    }
  }

  let filterBoard = [];

  for (let i = 0; i < board.length; i++) {
    filterBoard.push(newBoard[i].filter((v) => v !== 0));
  }

  for (let i = 0; i < moves.length; i++) {
    if (goal.length === 0) {
      goal.push(filterBoard[moves[i] - 1].shift());
    } else {

      let latestPick = goal[goal.length - 1];
      let newPick = filterBoard[moves[i] - 1].shift();

      if (latestPick === newPick && newPick !== undefined) {
        count++;
        goal.pop();
      } else {
        goal.push(newPick);
      }
    }
  }
  return count * 2;
}
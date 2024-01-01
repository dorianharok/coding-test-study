function solution(park, routes) {
  const hLimit = park.length - 1;
  const wLimit = park[0].length - 1;
    
  let s = [0, 0]; 
    
  for (let i = 0; i < park.length; i++) {
    for (let j = 0; j < park[0].length; j++) {
      if (park[i][j] === "S") {
        s[0] = i;
        s[1] = j;
      }
    }
  }
  for (let i = 0; i < routes.length; i++) {
    const dir = routes[i].split(" ")[0];
    const amount = Number(routes[i].split(" ")[1]);
    let flag = true;

    switch (dir) {
      case "N":
        if (s[0] - amount >= 0) {
          for (let h = s[0] - 1; h >= s[0] - amount; h--) {
            if (park[h][s[1]] === "X") {
              flag = false;
              break;
            }
          }
          if (flag) s[0] -= amount;
        }
        break;
      case "S":
        if (s[0] + amount <= hLimit) {
          for (let h = s[0] + 1; h <= s[0] + amount; h++) {
            if (park[h][s[1]] === "X") {
              flag = false;
              break;
            }
          }
          if (flag) s[0] += amount;
        }
        break;
      case "E":
        if (s[1] + amount <= wLimit) {
          for (let w = s[1] + 1; w <= s[1] + amount; w++) {
            if (park[s[0]][w] === "X") {
              flag = false;
              break;
            }
          }
          if (flag) s[1] += amount;
        }
        break;
      case "W":
        if (s[1] - amount >= 0) {
          for (let w = s[1] - 1; w >= s[1] - amount; w--) {
            if (park[s[0]][w] === "X") {
              flag = false;
              break;
            }
          }
          if (flag) s[1] -= amount;
        }
        break;
      default:
        break;
    }
  }

  return s;
}
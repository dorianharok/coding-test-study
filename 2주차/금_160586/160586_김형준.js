function solution(keymap, targets) {
  const map = new Map()
  let answer = []
  for(let i = 0 ; i < keymap.length ; i++) {
      for(let j = 0 ; j < keymap[i].length ; j++) {
          if(!map.has(keymap[i][j])) {
              map.set(keymap[i][j] , j+1)
          }
          else {
          map.set(keymap[i][j] , j < map.get(keymap[i][j]) ? j+1 : map.get(keymap[i][j]))    
          }
      }
  }
  
  for(let i = 0 ; i<targets.length ; i++) {
      let result = 0
      for(let j = 0 ; j < targets[i].length ; j++) {
          if(!map.has(targets[i][j]) ) {
              result = -1
              break
          }
          else {
              result += map.get(targets[i][j])
          }
      }
      answer.push(result)
  }
  
  return answer
}
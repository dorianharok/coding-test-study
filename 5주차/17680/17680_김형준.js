function solution(cacheSize, cities) {
  const cache = [];
  let time = 0;
  
  if (!cacheSize) return cities.length * 5;
  
  for (let city of cities) {
      let upperCase = city.toUpperCase();
      if (cache.includes(upperCase)) {
          time += 1;
          cache.splice(cache.indexOf(upperCase), 1);
          cache.push(upperCase);
          continue;
      } 
      
      if (cache.length === cacheSize) {
          cache.shift();
          cache.push(upperCase);
          time += 5;
          continue;
      }
      
      cache.push(upperCase);
      time += 5;
  }
  return time;
}
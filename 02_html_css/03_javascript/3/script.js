function modifyString(str) {
  let res = "";
  let modStr = str.toLowerCase();

  for (let i = 0; i < modStr.length; i++) {
    const c = modStr[i].toLowerCase();

    if (c === " ") continue;
    res += c;
  }

  return res;
}

function uniqueCharacters(str) {
  let arr = {};

  let modStr = modifyString(str);

  let res = "";

  for (let i = 0; i < modStr.length; i++) {
    const c = modStr[i];

    if (arr[c] == null) {
      arr[c] = c;
      res += c;
    }
  }
  return res;
}


console.log(uniqueCharacters("Welcome to the Javascript course"));
// console.log(uniqueCharacters("welcome[to]java"));
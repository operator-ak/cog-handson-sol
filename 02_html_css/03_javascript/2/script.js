function wordPlay(number) {
  let n = Number(number);

  if (n > 50) {
    return "Range is High";
  }

  if (n < 1) {
    return "Not Valid";
  }

  let res = "";

  for (let i = 1; i <= n; i++) {
    res += " ";
    if (i % 3 == 0 && i % 5 == 0) res += "Jump";
    else if (i % 3 == 0) res += "Tap";
    else if (i % 5 == 0) res += "Clap";
    else res += String(i);

  }

  return res;
}

console.log(wordPlay(10));

function validateEmail(email) {
  let reg = RegExp("[a-z0-9._]+@[a-z]+\.[a-z]{2,3}");

  return reg.test(email) ? "Valid email address!" : "Invalid email address!";
}

console.log(validateEmail("akshay?2104.singh@gmail.com"));


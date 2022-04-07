function display() {
  const _sname = document.getElementById("sname");
  const _course = document.getElementById("course");
  const _greet = document.getElementById("greet");

  const name = _sname.value;
  const courseName = _course.value;

  if (name === "") {
    _greet.innerHTML = "Name cannot be empty";
    return;
  }

  _greet.innerHTML = "Hi, " + name + ". You have successfully registered for the " + courseName + " course.";
}
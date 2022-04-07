$(function () {
  $("#btnId")[0].addEventListener("click", function () {
    const name = $("#txt")[0].value;
    $("#address")[0].textContent = "\"Welcome " + name + "!\"";
  });
});
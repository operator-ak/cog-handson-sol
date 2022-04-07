$(function () {
  $("table caption").css("background-color", "lightblue");

  $("tr").each(function (idx, element) {
    $(element).css("background-color", idx % 2 === 0 ? "lightpink" : "lightblue");
  });
});
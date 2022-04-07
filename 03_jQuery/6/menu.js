$(function () {
  $("#each_ex").click(function (event) {
    var res = "";
    $("li a").map(function (index, element) {
      res = res + "<br>" + $(element).text();
      return element;
    }).css("background-color", "red");

    $("#msg_ex").html(res);
  });
});
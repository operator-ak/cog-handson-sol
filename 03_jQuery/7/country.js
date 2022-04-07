$(function () {
  $("#btn-id").click(function () {
    var url = "https://reqres.in/api/users?page=2";

    $.getJSON(url, function (res) {

      var output = "";
      $.each(res.data, function (idx, item) {
        var text = item.id + " -- " + item.email;
        output = output + "<br>" + text;
      });

      $("#data-id").html(output);
    });
  });
});

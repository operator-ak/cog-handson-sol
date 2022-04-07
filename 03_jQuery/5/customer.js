$(function () {
  $(".add-row").click(function (event) {
    $("table").find("tbody").append(function () {
      const name = $("#name").val();
      return '<tr><td><input type="checkbox" name="record"></td><td>' + name + '</td></tr>';
    });
  });

  $(".delete-row").click(function (event) {
    $("tr").filter(function (idx, e) {
      return $(e).find("input:checkbox").is(":checked");
    }).remove();
  });
});
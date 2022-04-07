$(function () {
  $("input[type='checkbox']").change(function () {
    var count = ($("input[type='checkbox']:checked")).length;
    $("#result").text(count + " box" + (count === 1 ? " is" : "es are") + " checked");
  });
});
$(() => {
  $("#btn-id").click(() => {
    $.ajax({
      url: "employee.json",
      error: (error) => {
        if (error.status === 404) $("#err-id").html("Error Message: Not found");
      }
    });
  });
});
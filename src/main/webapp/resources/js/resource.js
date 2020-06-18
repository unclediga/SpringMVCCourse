$(document).ready(function () {
   $("#request-link").click(function (e) {
      e.preventDefault();
      var p = $.post(ctx + "/resource/request", $("form").serialize(), function (data) {
         alert("Request data:" + data);
      });
      return false;
   })
});

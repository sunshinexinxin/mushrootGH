/**
 * Created by anke on 2017/10/11.
 */


$(document).ready(function () {
    var stat = $("#role").val();
    if (stat == 2 || stat == 0) {
        $("#left5").show();
        $("#left4").show();
    } else {
        $("#left5").hide();
        $("#left4").hide();
    }

    $("#homePage>p").trigger("click");

});
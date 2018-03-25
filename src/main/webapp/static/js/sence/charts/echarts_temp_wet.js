/**
 * Created by anke on 2018/3/25.
 */
window.onload = function () {
    $.ajax({
        url: "/mushRoomGH/echarts_temp_wetData",
        type: "GET",
        dataType: "JSON",
        data: {},
        success: function (data, flag) {
            console.log(data.data);
        },
        error: function (data) {
            console.log(data);
            alert("error");
        }
    });



}
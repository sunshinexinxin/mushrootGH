/**
 * Created by anke on 2017/10/11.
 */


$(document).ready(function () {
    var stat = $("#status").val();
    if (stat == 2 | stat == 0) {
        $("#left5").show();
        $("#left3").show();
    } else {
        $("#left5").hide();
        $("#left3").hide();
    }

    $("#homePage>p").trigger("click");

});


// var dd = (function () {
// document.getElementById("homePage").onclick = function () {
//     //发送 ajax 请求并处理
//     var request = new XMLHttpRequest();
//     request.open("GET", "/mushroomGreenHouseGraduateDesign/user/mushRoomMap.action");
//
// // }
// $("#homePage").on("click", function () {
//     var userId = "aa";
//     var password = "11";
// $.ajax({
//     url: "/mushroomGreenHouseGraduateDesign/user/mushRoomMap.action",
//     type: "GET",
//     // dataType: "JSON",
//     data: {
//         // userId: userId,
//         // password: password
//     },
//     success: function (data) {
//         console.log(data);
//     }
// })
// })
// $.ajax({
//     url: "/mushroomGreenHouseGraduateDesign/user/mushRoomMap.action",
//     type: "GET",
//     dataType: "HTML",
//     data: {},
//     success: function (data) {
//         // $("#homePage").html(data);
//         var resuData=$("#resuData").val();
//         $("#Conframe").attr('src',"/mushroomGreenHouseGraduateDesign/user/mushRoomMap.action");
//         console.log(data);
//     },
//     error: function (data) {
//         console.log(data);
//     }
// });
// $("#Conframe").attr('src',"/mushroomGreenHouseGraduateDesign/user/mushRoomMap.action");
// }
// })()


// $("#homePage").on("click", function () {
//     var userId = "aa";
//     var password = "11";
// $.ajax({
//     url: "/mushroomGreenHouseGraduateDesign/user/mushRoomMap.action",
//     type: "GET",
//     // dataType: "JSON",
//     data: {
//         // userId: userId,
//         // password: password
//     },
//     success: function (data) {
//         console.log(data);
//     }
// })
// }
// }
// })()
/**
 * Created by anke on 2017/11/9.
 */
/**
 * Created by anke on 2017/9/11.
 */
window.onload = function () {
    $.ajax({
        url: "/mushRoomGH/baseManage",
        type: "GET",
        dataType: "JSON",
        data: {},
        success: function (data, flag) {
            // console.log(data.data);
            // console.log(data.data.typeof);
            $.each(data.data, function (index, value) {
                var url1 = "/mushRoomGH/chartsPage?lat=" + value.mushroomLat + "&lng=" + value.mushroomLong;
                var url2 = "/mushRoomGH/chartsPage?userId=" + value.userId;
                if (value.mushroomStatus == 1) {
                    var eyePath = "/static/image/eye-open.png";
                } else {
                    var eyePath = "/static/image/eye-close.png";
                }
                var tab =
                    '<tr>'
                    + "<td>" + value.mushroomPointid + "</td>"
                    + "<td>" + value.mushroomName + "</td>"
                    + '<td><a href=' + url2 + '>' + value.userId + '</a></td>'
                    + "<td>" + value.mushroomDesc + "</td>"
                    + "<td><a href='/mushRoomGH/updateMonitorStatus?pointid=" + value.mushroomPointid + "&status=" + value.mushroomStatus + "' ><img src=" + eyePath + "></a></td>"
                    + "<td>" + value.mushroomLong + "</td>"
                    + "<td>" + value.mushroomLat + "</td>"
                    + "<td>" + value.delFlag + "</td>"
                    + "<td>" + value.ctime + "</td>"
                    + '<td><a href=' + url1 + '>详情</a></td>'
                    + '</tr>';
                $('#table').append(tab);
            });
        },
        error: function (data) {
            console.log(data);
            alert("error");
        }
    });


}
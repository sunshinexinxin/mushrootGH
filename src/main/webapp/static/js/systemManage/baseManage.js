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
            render(data);
            $(".getDetailById").on("click", function () {
                $.ajax({
                    url: $(this).data("type"),
                    data: {
                        userId: $(this).text()
                    },
                    error: function (XMLHttpRequest, textStatus, errorThrown) {
                        // alert(XMLHttpRequest.responseText);
                    },
                    success: function (data) {
                        if (data && data.code == '1000') {
                            $('#table').empty();
                            render(data);
                        }
                    }
                });
            }).css({"cursor": "pointer", "color": "#36c"});

            //更细监控装填-眼睛图表
            $(".upEye").on("click", function () {
                var $this = $(this);
                var pointid = $this.data("param1"),
                    status = $this.data("param2");
                $.ajax({
                    url: $(this).data("type"),
                    data: {
                        pointid: pointid,
                        status: status
                    },
                    error: function (XMLHttpRequest, textStatus, errorThrown) {
                        // alert(XMLHttpRequest.responseText);
                    },
                    success: function (data) {
                        if (data && data.code == '1000') {
                            if (status == '1') {
                                $this.data("param2", 0);
                                var path = "/static/image/eye-close.png";
                            } else if (status == '0') {
                                $this.data("param2", 1);
                                var path = "/static/image/eye-open.png";
                            }
                            $this.find("img").attr("src", path);
                        }
                    }
                });
            }).css({"cursor": "pointer", "color": "#36c"});
        },
        error: function (data) {
            console.log(data);
            alert("error");
        }
    });
}

function render(data) {
    $.each(data.data, function (index, value) {
        var urlPointid = "/mushRoomGH/chartsPage?lat=" + value.mushroomLat + "&lng=" + value.mushroomLong;
        var urlOperation = "/mushRoomGH/chartsPage?lat=" + value.mushroomLat + "&lng=" + value.mushroomLong;
        var urlUserId = "/mushRoomGH/usersMushroom";
        // var urlUpMonitorStatus = "/mushRoomGH/updateMonitorStatus?pointid=" + value.mushroomPointid + "&status=" + value.mushroomStatus;
        var urlUpEye = "/mushRoomGH/updateMonitorStatus";
        if (value.mushroomStatus == 1) {
            var eyePath = "/static/image/eye-open.png";
        } else {
            var eyePath = "/static/image/eye-close.png";
        }
        var tab =
            '<tr>'
            + '<td><a href=' + urlPointid + '>' + value.mushroomPointid + '</a></td>'
            + "<td>" + value.mushroomName + "</td>"
            + '<td><span class="getDetailById" data-type=' + urlUserId + '>' + value.userId + '</span></td>'
            + "<td>" + value.mushroomDesc + "</td>"
            // + "<td><a href='" + urlUpMonitorStatus + "' ><img src=" + eyePath + "></a></td>"
            + '<td><span class="upEye" data-type=' + urlUpEye + ' data-param1= ' + value.mushroomPointid + ' data-param2=' + value.mushroomStatus + '><img src=' + eyePath + '></span></td>'
            + "<td>" + value.mushroomLong + "</td>"
            + "<td>" + value.mushroomLat + "</td>"
            + "<td>" + value.delFlag + "</td>"
            + "<td>" + value.ctime + "</td>"
            + '<td><a href=' + urlOperation + '>详情</a></td>'
            + '</tr>';
        $('#table').append(tab);
    });

};
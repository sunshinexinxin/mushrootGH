/**
 * Created by anke on 2017/11/22.
 */
window.onload = function () {
    // $(document).ready(function () {
    $("#selectReport").live('click', function () {
        var pointId = $("#pointId").val();
        var beginDate = $("#beginDate").val();
        var endDate = $("#endDate").val();
        // 清空表格
        // $("#top_table tr:not(:first)").html("");
        $.ajax({
            url: "/mushRoomGH/dataReport",
            type: "GET",
            dataType: "JSON",
            data: {
                pointId: pointId,
                beginDate: beginDate,
                endDate: endDate
            },
            success: function (data, flag) {
                if (data.code == 1000 && data.data.length > 0) {
                    var id = 1;
                    $.each(data.data, function (index, value) {
                        var tab =
                            '<tr>'
                            + "<td>" + id + "</td>"
                            + "<td>" + value.mushroomPointid + "</td>"
                            + "<td>" + value.mushroomAirtemp + "</td>"
                            + "<td>" + value.mushroomAirhumidity + "</td>"
                            + "<td>" + value.mushroomSoiltemp + "</td>"
                            + "<td>" + value.mushroomSoilmoisture + "</td>"
                            + "<td>" + value.mushroomIghtintensity + "</td>"
                            + "<td>" + value.mushroomCo2densuty + "</td>"
                            + "<td>" + value.ctime.substring(0, 4) + '-' + value.ctime.substring(4, 6) + '-' + value.ctime.substring(6, 8) + "</td>"
                            + "<td>" + value.ctime.substring(8, 10) + ':' + value.ctime.substring(10, 12) + ':' + value.ctime.substring(12, 14) + "</td>"
                            + '</tr>';
                        $('#top_table').append(tab);
                        id++;
                    });
                } else if (data.data.length === 0) {
                    var tab = '<tr align="center"><td>查询数据为空</td></tr>';
                    $('#top_table').append(tab);
                } else if (data.code == 2002) {
                    alert(data.message)
                }
            },
            error: function (data, flag) {
                console.log(data);
            }
        });
    });
}

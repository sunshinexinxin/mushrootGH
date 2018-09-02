/**
 * Created by anke on 2018/4/20.
 */

window.onload = function () {
    $(document).ready(function () {
// 查看历史照片
        var userId = $('#userId').val();
        $.ajax({
            type: 'GET',
            url: "/mushRoomGH/seeHistorImages",
            data: {
                userId: userId
            },
            dataType: "JSON",
            async: false,
            success: function (data) {
                $.each(data.data, function (index, value) {
                    $('#img1').attr('src', value.imgContent);
                });
            },
            error: function (data) {
                console.log(data);
                alert("error");
            }
        });
    });
}


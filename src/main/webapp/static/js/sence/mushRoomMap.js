/**
 * Created by anke on 2017/9/11.
 */

// 百度地图API功能
window.onload = function () {
    var map;
    var pointCent;

    $.ajax({
        url: "/mushRoomGH/mushRoomMapData",
        type: "GET",
        dataType: "JSON",
        data: {
            // userId: userId,
            // password: password
        },
        success: function (data, flag) {
            // console.log(data.data);
            map = new BMap.Map("allmap");    // 创建Map实例
            pointCent = new BMap.Point(114.2009851142, 38.8555280387);  //创建地图中心点位置，写死即可
            map.centerAndZoom(pointCent, 17);
            map.setCurrentCity("阜平县");          // 设置地图显示的城市 此项是必须设置的
            map.enableScrollWheelZoom(true);     //开启鼠标滚轮缩放
            var obj1 = eval("(" + data.data + ")");
            $.each(obj1, function (index, value) {
                // console.log("lat:" + value[1] + "\tlng:" + value[0]);
                addMarker(new BMap.Point(value[1], value[0]), value[2]);
            });

        },
        error: function (data, flag) {
            console.log(flag);
            alert("error");
        }
    });

    //创建标注
    function addMarker(point, content) {
        //地图标注icon
        var myIcon = new BMap.Icon("/static/image/mushroom.ico", new BMap.Size(24, 24));
        var marker = new BMap.Marker(point, {icon: myIcon});  // 创建标注
        marker.setAnimation(BMAP_ANIMATION_DROP); //跳动的动画
        map.addOverlay(marker);// 将标注添加到地图中

        addClickHandler(content, marker);
    }

    var opts = {
        width: 250,     // 信息窗口宽度
        height: 80,     // 信息窗口高度
        title: "基地信息", // 信息窗口标题
        enableMessage: true//设置允许信息窗发送短息
    };


    function addClickHandler(content, marker) {
        marker.addEventListener("mouseover", function (e) {
            openInfo(content, e)
        });
        marker.addEventListener("mouseout", function () {
            map.closeInfoWindow();
        });
    }

    function openInfo(content, e) {
        var p = e.target;
        var point = new BMap.Point(p.getPosition().lng, p.getPosition().lat);
        var infoWindow = new BMap.InfoWindow(content, opts);  // 创建信息窗口对象
        map.openInfoWindow(infoWindow, point); //开启信息窗口
    }

}
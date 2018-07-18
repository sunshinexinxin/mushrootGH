/**
 * Created by anke on 2018/3/25.
 */
$(document).ready(function () {
    $("#hrefFoldLineDiagram>p").trigger("click");
});


function foldLineDiagram() {
    $.ajax({
        url: "/mushRoomGH/foldLineDiagram",
        type: "GET",
        dataType: "JSON",
        data: {},
        success: function (data, flag) {
            var airTempList = [], //空气温度
                airhumidityList = [],//空气湿度
                soiltempList = [],//土壤温度
                soilmoistureList = [],//土壤湿度
                ightintensityList = [],//光照强度
                co2densutyList = [],//二氧化碳浓度
                ctimeList = [];//时间
            $.each(data.data, function (index, value) {
                airTempList.push(value.mushroomAirtemp);
                airhumidityList.push(value.mushroomAirhumidity);
                soiltempList.push(value.mushroomSoiltemp);
                soilmoistureList.push(value.mushroomSoilmoisture);
                ightintensityList.push(value.mushroomIghtintensity);
                co2densutyList.push(value.mushroomCo2densuty);
                ctimeList.push(value.ctime.substr(8, 2) + ":" + value.ctime.substr(10, 2));
            });
            var myChart1 = echarts.init(document.getElementById('foldLineDiagram'));
            option1 = {
                title: {
                    text: '折线图堆叠'
                },
                tooltip: {
                    trigger: 'axis'
                },
                legend: {
                    data: ['空气温度', '空气湿度', '土壤温度', '土壤湿度', '光照强度', '二氧化碳浓度']
                },
                grid: {
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    containLabel: true
                },
                toolbox: {
                    feature: {
                        saveAsImage: {}
                    }
                },
                xAxis: {
                    type: 'category',
                    boundaryGap: false,
//            data: ['周一', '周二', '周三', '周四', '周五', '周六', '周日', 'test']
                    data: ctimeList
                },
                yAxis: {
                    type: 'value'
                },
                series: [
                    {
                        name: '空气温度',
                        type: 'line',
                        stack: '总量',
//                data: [120, 132, 101, 134, 90, 230, 230, 210]
                        data: airTempList
                    },
                    {
                        name: '空气湿度',
                        type: 'line',
                        stack: '总量',
//                data: [99, 182, 191, 234, 290, 330, 310, 330]
                        data: airhumidityList
                    },
                    {
                        name: '土壤温度',
                        type: 'line',
                        stack: '总量',
//                data: [150, 232, 201, 154, 190, 330, 410, 330]
                        data: soiltempList
                    },
                    {
                        name: '土壤湿度',
                        type: 'line',
                        stack: '总量',
//                data: [320, 332, 301, 334, 390, 330, 320, 330]
                        data: soilmoistureList
                    },
                    {
                        name: '光照强度',
                        type: 'line',
                        stack: '总量',
//                data: [80, 92, 91, 94, 190, 130, 320, 330]
                        data: ightintensityList
                    },
                    {
                        name: '二氧化碳浓度',
                        type: 'line',
                        stack: '总量',
//                data: [80, 92, 91, 94, 190, 130, 320, 330]
                        data: co2densutyList
                    }
                ]
            };
            myChart1.setOption(option1);

            $('#panel-652223').removeClass("active").addClass("tab-content");
            $('#panel-849551').removeClass("tab-content").addClass("active");
            $('#id2').removeClass("active").addClass("tab-content");
            $('#id1').removeClass("tab-content").addClass("active");
        },
        error: function (data) {
            console.log(data);
            alert("error");
        }
    });
}

function pieChart() {
    $.ajax({
        url: "/mushRoomGH/pieChart",
        type: "GET",
        dataType: "JSON",
        data: {},
        success: function (data2, flag) {
            // console.log("lat" + GetRequest().lat);
            // console.log("lng" + GetRequest().lng);
            console.log(data2);
            function GetRequest() {
                var url = location.search; //获取url中"?"符后的字串
                var theRequest = new Object();
                if (url.indexOf("?") != -1) {
                    var str = url.substr(1);
                    strs = str.split("&");
                    for (var i = 0; i < strs.length; i++) {
                        theRequest[strs[i].split("=")[0]] = unescape(strs[i].split("=")[1]);
                    }
                }
                return theRequest;
            }

            // 基于准备好的dom，初始化echarts实例
            var myChart2 = echarts.init(document.getElementById('pieChart'));
            // 指定图表的配置项和数据
            /* myChart.showLoading(); */
            var base = +new Date(1968, 9, 3);
            var oneDay = 24 * 3600 * 1000;
            var date = [];
            var data = [Math.random() * 300];
            for (var i = 1; i < 20000; i++) {
                var now = new Date(base += oneDay);
                date.push([now.getFullYear(), now.getMonth() + 1, now.getDate()].join('-'));
                data.push(Math.round((Math.random() - 0.5) * 20 + data[i - 1]));
            }
            option2 = {
                title: {
                    text: '大棚作物分布',
                    subtext: '饼图',
                    x: 'center'
                },
                tooltip: {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient: 'vertical',
                    left: 'left',
                    data: ['花卉', '农业服务', '市场零售', '种植加工', '农副产品加工']
                },
                series: [
                    {
                        name: '访问来源',
                        type: 'pie',
                        radius: '55%',
                        center: ['50%', '60%'],
                        data: [
                            {value: 335, name: '畜牧服务'},
                            {value: 310, name: '农业服务'},
                            {value: 234, name: '市场零售'},
                            {value: 135, name: '种植加工'},
                            {value: 1548, name: '农副产品加工'}
                        ],
                        itemStyle: {
                            emphasis: {
                                shadowBlur: 10,
                                shadowOffsetX: 0,
                                shadowColor: 'rgba(0, 0, 0, 0.5)'
                            }
                        }
                    }
                ]
            };
            // 使用刚指定的配置项和数据显示图表。
            myChart2.setOption(option2);

            $('#panel-849551').removeClass("active").addClass("tab-content");
            $('#panel-652223').removeClass("tab-content").addClass("active");
            $('#id1').removeClass("active").addClass("tab-content");
            $('#id2').removeClass("tab-content").addClass("active");
        },
        error: function (data) {
            console.log(data);
            alert("error");
        }
    });
}
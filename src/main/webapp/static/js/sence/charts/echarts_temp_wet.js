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
            //console.log(data.data);
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
            // console.log(airTempList);
            // console.log(airhumidityList);
            // console.log(soiltempList);
            // console.log(soilmoistureList);
            // console.log(ightintensityList);
            // console.log(co2densutyList);
            // console.log(ctimeList);


            var myChart = echarts.init(document.getElementById('main_echarts_temp_wet'));

            option = {
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
            myChart.setOption(option);


        },
        error: function (data) {
            console.log(data);
            alert("error");
        }
    });


}
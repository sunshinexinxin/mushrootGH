$(function () {
    $('#dowebok1').waterbubble({
        txt: '74.8%',
        data: 0.748,
        // textColor: 'rgba(0, 0, 0, 0.8)',
        waterColor: '#EEAD0E',
        animation: true

    });
});


$(function () {
    $('#dowebok2').waterbubble({
        txt: '36.8%',
        data: 0.368,
        waterColor: '#2fee37',
        animation: true

    });
});

$(function () {
    $('#dowebok3').waterbubble({
        txt: '84.3%',
        data: 0.843,
        waterColor: '#CD2626',
        animation: true

    });
});

$(function () {
    $('#dowebok4').waterbubble({
        txt: '54.2%',
        data: 0.542,
        textColor: 'rgba(0, 0, 0, 0.8)',
        animation: true

    });
});

$(function () {
    $('#dowebok5').waterbubble({
        txt: '38.4%',
        data: 0.384,
        waterColor: '#2fee37',
        animation: true

    });
});


var myChart1 = echarts.init(document.getElementById('myChart1s'));
option1 = {
    title: {
        text: '培植指标'
    },
    legend: {
        data: ['空气温度','空气湿度', '土壤温度', '土壤湿度', '光照强度']
    },
    radar: [
        {
            indicator: [
                { text: '空气温度' },
                { text: '空气湿度' },
                { text: '土壤温度' },
                { text: '土壤湿度' },
                { text: '光照强度' }
            ],
            center: ['50%', '50%'],
            radius: 110,
            startAngle: 90,
            splitNumber: 4,
            shape: 'circle',
            name: {
                formatter:'【{value}】',
                textStyle: {
                    color:'#72ACD1'
                }
            },
            splitArea: {
                areaStyle: {
                    color: ['rgba(114, 172, 209, 0.2)',
                        'rgba(114, 172, 209, 0.4)', 'rgba(114, 172, 209, 0.6)',
                        'rgba(114, 172, 209, 0.8)', 'rgba(114, 172, 209, 1)'],
                    shadowColor: 'rgba(0, 0, 0, 0.3)',
                    shadowBlur: 10
                }
            },
            axisLine: {
                lineStyle: {
                    color: 'rgba(255, 255, 255, 0.5)'
                }
            },
            splitLine: {
                lineStyle: {
                    color: 'rgba(255, 255, 255, 0.5)'
                }
            }
        }
    ],
    series: [
        {
            name: '雷达图',
            type: 'radar',
            itemStyle: {
                emphasis: {
                    // color: 各异,
                    lineStyle: {
                        width: 4
                    }
                }
            },
            data: [
                {
                    value: [100, 8, 0.40, -80, 2000],
                    name: '图一',
                    symbol: 'rect',
                    symbolSize: 5,
                    lineStyle: {
                        normal: {
                            type: 'dashed'
                        }
                    }
                },
                {
                    value: [60, 5, 0.30, -100, 1500],
                    name: '图二',
                    areaStyle: {
                        normal: {
                            color: 'rgba(255, 255, 255, 0.5)'
                        }
                    }
                }
            ]
        },
        {
            name: '成绩单',
            type: 'radar',
            radarIndex: 1,
            data: [
                {
                    value: [120, 118, 130, 100, 99, 70],
                    name: '张三',
                    label: {
                        normal: {
                            show: true,
                            formatter:function(params) {
                                return params.value;
                            }
                        }
                    }
                },
                {
                    value: [90, 113, 140, 30, 70, 60],
                    name: '李四',
                    areaStyle: {
                        normal: {
                            opacity: 0.9,
                            color: new echarts.graphic.RadialGradient(0.5, 0.5, 1, [
                                {
                                    color: '#B8D3E4',
                                    offset: 0
                                },
                                {
                                    color: '#72ACD1',
                                    offset: 1
                                }
                            ])
                        }
                    }
                }
            ]
        }
    ]
}
myChart1.setOption(option1);

//
//
// var myChart2 = echarts.init(document.getElementById('myChart2s'));
//
//
// function randomData() {
//     now = new Date(+now + oneDay);
//     value = value + Math.random() * 21 - 10;
//     return {
//         name: now.toString(),
//         value: [
//             [now.getFullYear(), now.getMonth() + 1, now.getDate()].join('/'),
//             Math.round(value)
//         ]
//     }
// }
//
// var data = [];
// var now = +new Date(2018, 6, 26);
// var oneDay = 3600 * 1000;
// var value = Math.random() * 100;
// for (var i = 0; i < 1000; i++) {
//     data.push(randomData());
// }
//
// option2 = {
//     title: {
//         text: '实时指数走势'
//     },
//     tooltip: {
//         trigger: 'axis',
//         formatter: function (params) {
//             params = params[0];
//             var date = new Date(params.name);
//             return date.getDate() + '/' + (date.getMonth() + 1) + '/' + date.getFullYear() + ' : ' + params.value[1];
//         },
//         axisPointer: {
//             animation: false
//         }
//     },
//     xAxis: {
//         type: 'time',
//         splitLine: {
//             show: false
//         }
//     },
//     yAxis: {
//         type: 'value',
//         boundaryGap: [0, '100%'],
//         splitLine: {
//             show: false
//         }
//     },
//     series: [{
//         name: '模拟数据',
//         type: 'line',
//         showSymbol: false,
//         hoverAnimation: false,
//         data: data
//     }]
// };
//
// setInterval(function () {
//
//     for (var i = 0; i < 5; i++) {
//         data.shift();
//         data.push(randomData());
//     }
//
//     myChart2.setOption({
//         series: [{
//             data: data
//         }]
//     });
// }, 1000);
// myChart2.setOption(option2);

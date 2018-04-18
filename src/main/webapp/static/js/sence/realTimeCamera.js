/**
 * Created by anke on 2018/4/16.
 */
var promisifiedOldGUM = function (constraints) {

    // 第一个拿到getUserMedia，如果存在
    var getUserMedia = (navigator.getUserMedia || navigator.webkitGetUserMedia || navigator.mozGetUserMedia);

    // 有些浏览器只是不实现它-返回一个不被拒绝的承诺与一个错误保持一致的接口
    if (!getUserMedia) {
        return Promise.reject(new Error('getUserMedia is not implemented in this browser-getUserMedia是不是在这个浏览器实现'));
    }

    // 否则，调用包在一个旧navigator.getusermedia承诺
    return new Promise(function (resolve, reject) {
        getUserMedia.call(navigator, constraints, resolve, reject);
    });

}

// 旧的浏览器可能无法实现mediadevices可言，所以我们设置一个空的对象第一
if (navigator.mediaDevices === undefined) {
    navigator.mediaDevices = {};
}

// 一些浏览器部分实现mediadevices。我们不能只指定一个对象
// 随着它将覆盖现有的性能getUserMedia。.
// 在这里，我们就要错过添加getUserMedia财产。.
if (navigator.mediaDevices.getUserMedia === undefined) {
    navigator.mediaDevices.getUserMedia = promisifiedOldGUM;
}

// Prefer camera resolution nearest to 1280x720.
var constraints = {
    audio: true,
    video: {
        width: 1280,
        height: 720
    }
};

navigator.mediaDevices.getUserMedia(constraints)
    .then(function (stream) {
        var video = document.querySelector('video');
        video.src = window.URL.createObjectURL(stream);
        video.onloadedmetadata = function (e) {
            video.play();
        };
    }).catch(function (err) {
    console.log(err.name + ": " + err.message);
});

// var video = document.getElementById("video");
var context = canvas.getContext("2d");

//利用canvas 将当前video的画面画到canvas标签节点中
document.getElementById("paizhao").addEventListener("click", function () {
    context.drawImage(video, 0, 0, 640, 480);
    $("#downImg").show();
});


// 下载Canvas元素的图片
function downloadCanvasIamge() {
    // 通过选择器获取canvas元素
    var canvas = document.querySelector('canvas');
    // 使用toDataURL方法将图像转换被base64编码的URL字符串
    var url = canvas.toDataURL('image/png');
    // 生成一个a元素
    var a = document.createElement('a');
    // 创建一个单击事件
    var event = new MouseEvent('click');

    // 将a的download属性设置为我们想要下载的图片名称，若name不存在则使用‘下载图片名称’作为默认名称
    a.download = '图片_' + Date.parse(new Date());
    // 将生成的URL设置为a.href属性
    a.href = url;

    // 触发a的单击事件
    a.dispatchEvent(event);
}

// 调用方式
// 参数一： 选择器，代表canvas
// 参数二： 图片名称，可选
// downloadCanvasIamge('canvas', '图片名称');


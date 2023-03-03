//发送ajax请求，获取系统时间
function get_sys_time() {
    //发送请求
    $.ajax({
        //发送请求的url地址
        url:"/get_time",
        type:"post",
        success:function (data) {
            //显示响应过来的数据
            // console.log(data)
            $("#time").html(data)
        },
        error:function () {
            //输出
            console.log("获取系统时间失败！")
        }
    })
}

//发送ajax请求获取left1中的数据
function get_left1() {
    $.ajax({
        url:"/get_left1",
        type:"post",
        success:function (data) {
            var data = $.parseJSON(data);
            // console.log(data[0])
            ec_left1_Option.xAxis[0].data=data[0]['ds']
            ec_left1_Option.series[0].data=data[0]['confirm']
            ec_left1_Option.series[1].data=data[0]['suspect']
            ec_left1_Option.series[2].data=data[0]['heal']
            ec_left1_Option.series[3].data=data[0]['dead']
            ec_left1.setOption(ec_left1_Option)
        },
        error:function () {
            console.log("获取left1中的数据失败！")
        }
    })
}

//left2折线图
function get_left2(){
    $.ajax({
        url:"/get_left2",
        type:"post",
        success: function(data) {
            var data = $.parseJSON(data);
            // console.log(data[0])
            ec_left2_Option.xAxis[0].data=data[0]['ds']
            ec_left2_Option.series[0].data=data[0]['confirm_add']
            ec_left2_Option.series[1].data=data[0]['suspect_add']
            ec_left2.setOption(ec_left2_Option)
        },
        error:function () {
            console.log("获取left2中的数据失败！")
        }
    })
}

function get_right1(){
    $.ajax({
        url:"/get_right1",
        type:"post",
        success: function(data) {
            var data = $.parseJSON(data);
            ec_right1_option.xAxis.data=data[0]['city'];
            ec_right1_option.series[0].data=data[0]['confirm'];
            ec_right1.setOption(ec_right1_option);

        },
        error:function () {
            console.log("获取right1中的数据失败！")
        }
    })
}

function get_right2(){
    $.ajax({
        url:"/get_right2",
        type:"post",
        success: function(data) {
            var data = $.parseJSON(data);
            console.log(data)
            //ec_right2_option.series[0].data=data
            ec_right2_option.series[0].data=data
            ec_right2.setOption(ec_right2_option);
        },
        error:function () {
            console.log("获取right2中的数据失败！")
        }

    })
}

function get_center1(){
    $.ajax({
        url: "/get_center1",
        type: "post",
        success: function(data) {
            //console.log(data)
            var data = $.parseJSON(data);
            $(".num h3").eq(0).text(data[0]['confirm']);
            $(".num h3").eq(1).text(data[0]['suspect']);
            $(".num h3").eq(2).text(data[0]['heal']);
            $(".num h3").eq(3).text(data[0]['dead']);
        },
        error:function () {
            console.log("获取center1中的数据失败！")
        }
    })
}

   //中国地图数据获取
function get_center2(){
        $.ajax({
		url: "/get_center2",
        type: "post",
		success: function(data) {
            var data = $.parseJSON(data);
            ec_center_option.series[0].data=data
            ec_center.setOption(ec_center_option)
		},
        error:function () {
            console.log("获取center2中的数据失败！")
        }
	})
}

//开启定时器，每隔一秒钟发送一次请求
setInterval(get_sys_time,1000)
setInterval(get_center1,1000)
setInterval(get_center2,1000)
setInterval(get_left1,1000)
setInterval(get_left2,1000)
setInterval(get_right1,1000)
setInterval(get_right2,1000)



<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <%@include file="/resources/common/cs_js.jsp" %>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>信息管理系统界面</title>

    <script type="text/javascript" src="${pro}/resources/lib/jquery/1.9.1/jquery.min.js"></script>
    <script language="JavaScript" src="${pro }/resources/lib/echarts.js"></script>
    <script type="text/javascript">
        $(function(){
            //$("#chart").click(function(){

            var myChart = echarts.init(document.getElementById('main'));
            //图表显示提示信息
            myChart.showLoading();
            //定义图表options
            var options = {
                title: {
                    text: "",
                    subtext: "",
                    sublink: "http://www.stepday.com/myblog/?Echarts"
                },
                tooltip: {
                    trigger: 'axis'
                },
                legend: {
                    data: []
                },
                toolbox: {
                    show: true,
                    feature: {
                        mark: false
                    }
                },
                calculable: true,
                xAxis: [
                    {
                        type: 'category',
                        data: []
                    }
                ],
                yAxis: [
                    {
                        type: 'value',
                        splitArea: { show: true }
                    }
                ],
                series: []
            };

            //通过Ajax获取数据
            $.ajax({
                type : "post",
                async : false, //同步执行
                url : "${pro}/clazz/getEcharsByZhe",
                dataType : "json", //返回数据形式为json
                success : function(result) {
                    if (result) {
                        //将返回的category和series对象赋值给options对象内的category和series
                        //因为xAxis是一个数组 这里需要是xAxis[i]的形式
                        options.xAxis[0].data = result.category;
                        options.series = result.series;
                        options.legend.data = result.legend;
                        myChart.hideLoading();
                        myChart.setOption(options);
                    }
                },
                error : function(errorMsg) {
                    alert("图表请求数据失败啦!");
                }
            });



        //});

        });

    </script>

</head>
<body>

<!--<p>
    <input class="common_button" type="button" value="柱状图" id="chart">
</p>-->
<div id="main" style="width: 500px;height:500px;"></div>
</body>
</html>



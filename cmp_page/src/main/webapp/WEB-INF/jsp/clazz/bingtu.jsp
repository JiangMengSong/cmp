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
           // $("#chartBing").click(function(){
                var myChart = echarts.init(document.getElementById('main'));
                //图表显示提示信息
                myChart.showLoading();
                //定义图表options
                var options = {
                    title : {
                        text : ' ',
                        subtext : ' ',
                        x : 'center'
                    },
                    tooltip : {
                        trigger : 'item',
                        formatter : "{a} <br/>{b} : {c} ({d}%)"
                    },
                    legend : {
                        orient : 'vertical',
                        left : 'left',
                        data : []
                    },
                    series : [ {
                        name : '访问来源',
                        type : 'pie',
                        data : []
                    } ]
                };
                var myChart = echarts.init(document.getElementById('main'));
                //图表显示提示信息
                myChart.showLoading();
                //定义图表options
                var options = {
                    title : {
                        text : ' ',
                        subtext : ' ',
                        x : 'center'
                    },
                    tooltip : {
                        trigger : 'item',
                        formatter : "{a} <br/>{b} : {c} ({d}%)"
                    },
                    legend : {
                        orient : 'vertical',
                        left : 'left',
                        data : []
                    },
                    series : [ {
                        name : '访问来源',
                        type : 'pie',
                        data : []
                    } ]
                };
                //通过Ajax获取数据
                $.ajax({
                    type : "post",
                    async : false, //同步执行
                    url : "${pro}/clazz/getEcharsByBing",
                    dataType : "json", //返回数据形式为json
                    success : function(result) {
                        if (result) {
                            options.legend.data = result.legend;

                            //将返回的category和series对象赋值给options对象内的category和series
                            //因为xAxis是一个数组 这里需要是xAxis[i]的形式
                            options.series[0].name = result.series[0].name;
                            options.series[0].type = result.series[0].type;
                            var serisdata = result.series[0].data;
                            var value = [];
                            $.each(serisdata, function(i, p) {
                                value[i] = {
                                    'name' : p['name'],
                                    'value' : p['value']
                                };
                            });
                            options.series[0]['data'] = value;

                            myChart.hideLoading();
                            myChart.setOption(options);
                        }
                    },
                    error : function(errorMsg) {
                        alert("图表请求数据失败啦!");
                    }
                });

          //  });
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


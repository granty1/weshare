<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8"><link rel="icon" href="https://static.jianshukeji.com/highcharts/images/favicon.ico">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <style>
        </style>
        <script src="https://img.hcharts.cn/jquery/jquery-1.8.3.min.js"></script>
        <script src="https://img.hcharts.cn/highcharts/highcharts.js"></script>
        <script src="https://img.hcharts.cn/highcharts/modules/exporting.js"></script>
        <script src="https://img.hcharts.cn/highcharts-plugins/highcharts-zh_CN.js"></script>
    </head>
    <body>
        <div id="container" style="min-width:400px;height:650px"></div>
        <script>
          $.getJSON('/weshare/webcount/zhiye', function (csv) { 
            var chart = Highcharts.chart('container', {
    title: {
        text: 'weshare资源共享社区用户职业占比'
    },
    tooltip: {
        headerFormat: '{series.name}<br>',
        pointFormat: '{point.name}: <b>{point.percentage:.1f}%</b>'
    },
    plotOptions: {
        pie: {
            allowPointSelect: true,  // 可以被选择
            cursor: 'pointer',       // 鼠标样式
            dataLabels: {
                enabled: true,
                format: '<b>{point.name}</b>: {point.percentage:.1f} %',
                style: {
                    color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
                }
            }
        }
    },
    series: [{
        type: 'pie',
        name: '用户职业占比',
        data: csv.data
    }]
});}); 
        </script>
    </body>
</html>
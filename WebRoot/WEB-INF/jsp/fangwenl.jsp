<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8"><link rel="icon" href="https://static.jianshukeji.com/highcharts/images/favicon.ico">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <style>
            /* css 代码  */
        </style>
        <script src="https://img.hcharts.cn/jquery/jquery-1.8.3.min.js"></script>
        <script src="https://img.hcharts.cn/highcharts/highcharts.js"></script>
        <script src="https://img.hcharts.cn/highcharts/modules/exporting.js"></script>
        <script src="https://img.hcharts.cn/highcharts/modules/series-label.js"></script>
        <script src="https://img.hcharts.cn/highcharts/modules/oldie.js"></script>
        <script src="https://img.hcharts.cn/highcharts-plugins/highcharts-zh_CN.js"></script>
        <script src="https://img.hcharts.cn/highcharts/themes/sand-signika.js"></script>
    </head>
    <body>
        <div id="container" style="max-width:1250px;height:700px"></div>
        <script>
        
        $.getJSON('/weshare/webcount/fangwen', function (csv) {
            var chart = Highcharts.chart('container', {
		title: {
				text: 'WeShare网站统计'
		},
		subtitle: {
				text: '数据来源：weshare'
		},
		yAxis: {
				title: {
						text: '访问量/次'
				}
		},
		legend: {
				layout: 'vertical',
				align: 'right',
				verticalAlign: 'middle'
		},
		plotOptions: {
				series: {
						pointStart: Date.UTC(csv.year, csv.mouth-1, csv.day), // 开始值
						pointInterval: 24 * 3600 * 1000 // 间隔一天
				}
		},
		xAxis: {
				type: 'datetime',
				dateTimeLabelFormats: {
						day: '%Y-%m-%d'
				}
		},
		series: csv.datas,
		responsive: {
				rules: [{
						condition: {
								maxWidth: 500
						},
						chartOptions: {
								legend: {
										layout: 'horizontal',
										align: 'center',
										verticalAlign: 'bottom'
								}
						}
				}]
		}
});
});
        </script>
    </body>
</html>
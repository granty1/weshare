<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>用户管理</title>
<meta
	content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"
	name="viewport">
<link rel="stylesheet" href="${ctx }/css/bootstrap.min.css">
<link rel="stylesheet" href="${ctx }/css/AdminLTE.css">
<link rel="stylesheet"
	href="${ctx }/css/_all-skins.min.css">
<link rel="stylesheet" href="${ctx }/css/style.css">
<script src="${ctx }/js/jquery-2.2.3.min.js"></script>
<script src="${ctx }/js/bootstrap.min.js"></script>

<script type="text/javascript" src="${ctx }/js/angular.min.js"></script>

<!-- 分页组件开始 -->
<script src="${ctx }/js/pagination.js"></script>
<link rel="stylesheet" href="${ctx }/css/pagination.css">
<!-- 分页组件结束 -->



<script type="text/javascript">
	//创建模块
	var app = angular.module('weshare',['pagination']);
	//创建控制器
	app.controller('userController', function($scope, $http) {
		
		
		//分页控件配置    currentPage:当前页码  totalItems:总记录数  itemsPerPage:每页记录数 perPageOptions:分页选项 onChange:触发函数
		$scope.paginationConf = {
			currentPage : 1,
			totalItems : 10,
			itemsPerPage : 10,
			perPageOptions : [ 10, 20, 30, 40, 50 ],
			onChange : function() {
				$scope.reloadList();
			}
		};


		$scope.search = {};
		//条件查询
		$scope.findByTj = function(page,size){
			$http.get('/weshare/frozen/removefrozenusers?page='+page+'&size='+size).success(
				function(response){
					//显示当前页数据 
					$scope.frozenList=response.rows;	
					//更新总记录数 
					$scope.paginationConf.totalItems=response.total;
				}			
			);
		}
		
		$scope.removefrozen = function(id){
			$http.get('/weshare/frozen/removefrozen?uId='+id).success(
				function(response){
					if(response.status==200){
						//执行成功，刷新页面
						$scope.reloadList();
					}else{
						//执行失败，报错误信息
						alert(response.msg);
					}
				}
			);
		}
		
		//刷新页面
		$scope.reloadList = function(){
			$scope.findByTj( $scope.paginationConf.currentPage , $scope.paginationConf.itemsPerPage);
			$scope.selectIds = [];
		}
	});
</script>

</head>
<body class="hold-transition skin-red sidebar-mini" ng-app="weshare"
	ng-controller="userController">
	<!-- .box-body -->
	<div class="box-header with-border">
		<h3 class="box-title">用户解封</h3>
	</div>

	<div class="box-body">

		<!-- 数据表格 -->
		<div class="table-box">

			<!--工具栏-->
			<div class="pull-left">
				<div class="form-group form-inline">
					<div class="btn-group">
						<JButton type="JButton" class="btn btn-default" title="刷新"
							onclick="window.location.reload();">
							<i class="fa fa-refresh"></i> 刷新
						</JButton>
					</div>
				</div>
			</div>
			<div class="box-tools pull-right">
			</div>
			<!--工具栏/-->

			<!--数据列表-->
			<table id="dataList"
				class="table table-bordered table-striped table-hover dataTable">
				<thead>
					<tr>
						<!-- <th class="" style="padding-right: 0px"><input id="selall"
							type="checkbox" class="icheckbox_square-blue"></th> -->
						<th class="sorting_asc">用户名</th>
						<th class="sorting">封禁时间</th>
						<th class="sorting">封禁理由</th>
						<th class="text-center">操作</th>
					</tr>
				</thead>
				<tbody>
					<tr  ng-repeat="user in frozenList">
						<td>{{user.username}}</td>
						<td>{{user.frozentime}}</td>
						<td>{{user.frozencause}}</td>
						<td class="text-center">
							<JButton type="JButton" class="btn bg-olive btn-xs"
								data-toggle="modal" data-target="#editModal"
								ng-click='removefrozen(user.id)'>解 封</JButton>
						</td>
					</tr>
				</tbody>
			</table>
			<!--数据列表/-->
			<!-- 分页 -->
			<tm-pagination conf="paginationConf"></tm-pagination>
		</div>

</body>
</html>
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

		$scope.submit = function(){
			$scope.usersub.uId = $scope.id;		
			$http.post('/weshare/frozen/addfrozen',$scope.usersub).success(
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
		
		//查询单个用户
		$scope.setuserid = function(id){
			$scope.id = id;
		}
		
		$scope.selectIds = [];
		//更新要删除的id的数组
		$scope.updateSelection = function($event,id){
			if($event.target.checked){
				//如果被选中，则往数组中添加该id
				$scope.selectIds.push(id);
			}else{
				//否则，则从数组中去掉该id
				//先得到该id在数组中对应的下标
				var index = $scope.selectIds.indexOf(id);
				//根据下表删除该元素                     参数一：要删除的元素的下表  参数二：要删除元素的个数
				$scope.selectIds.splice(index,1);
			}
		}
		$scope.search = {};
		//条件查询
		$scope.findByTj = function(page,size){
			$http.post('/weshare/user/search?page='+page+'&size='+size,$scope.search).success(
				function(response){
					//显示当前页数据 
					$scope.userList=response.rows;	
					//更新总记录数 
					$scope.paginationConf.totalItems=response.total;
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
		<h3 class="box-title">用户管理</h3>
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
				<div class="has-feedback">
					用户名称：<input ng-model="search.username" type="text" /> 
					<JButton class="btn bg-olive btn-xs" data-toggle="modal"
						ng-click="reloadList()">查询</JButton>
				</div>
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
						<th class="sorting">用户上传资源数</th>
						<th class="sorting">用户首发表动态数量</th>
						<th class="sorting">用户剩余积分</th>
						<th class="text-center">操作</th>
					</tr>
				</thead>
				<tbody>
					<tr  ng-repeat="user in userList">
						<td>{{user.username}}</td>
						<td>{{user.filenum}}</td>
						<td>{{user.articlenum}}</td>
						<td>{{user.integral}}</td>
						<td class="text-center">
							<JButton type="JButton" class="btn bg-olive btn-xs"
								data-toggle="modal" data-target="#editModal"
								ng-click='setuserid(user.id)'>封 号</JButton>
						</td>
					</tr>
				</tbody>
			</table>
			<!--数据列表/-->
			<!-- 分页 -->
			<tm-pagination conf="paginationConf"></tm-pagination>
		</div>
		<!-- 数据表格 /-->




	</div>
	<!-- /.box-body -->

	<!-- 编辑窗口 -->
	<div class="modal fade" id="editModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<JButton type="JButton" class="close" data-dismiss="modal"
						aria-hidden="true">×</JButton>
					<h3 id="myModalLabel">用户封禁</h3>
				</div>
				<div class="modal-body">
					<table class="table table-bordered table-striped" width="800px">
						<tr>
							<td>账号id：</td>
							<td><a ng-model="uId">{{id}}</a>
						</tr>
						<tr>
							<td>封号原因：</td>
							<td><input class="form-control" placeholder="封禁原因"
								ng-model="usersub.fCause"></td>
						</tr>
					</table>
				</div>
				<div class="modal-footer">
					<JButton class="btn btn-success" data-dismiss="modal"
						aria-hidden="true" ng-click="submit()">提交</JButton>
					<JButton class="btn btn-default" data-dismiss="modal"
						aria-hidden="true">关闭</JButton>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
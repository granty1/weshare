<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>WeShare后台管理系统</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">
  

    <link rel="stylesheet" media="screen" href="${ctx }/css/bootstrap.min.css">
    <link rel="stylesheet" media="screen" href="${ctx }/css/AdminLTE.min.css">
    <link rel="stylesheet" media="screen" href="${ctx }/css/_all-skins.min.css">
    <link rel="stylesheet" media="screen" href="${ctx }/css/style.css">
    
    <script type="text/javascript" src="${ctx }/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${ctx }/js/jquery.min.js"></script>
    <script type="text/javascript" src="${ctx }/js/app.min.js"></script>
    
    <script type="text/javascript">   
		 function SetIFrameHeight(){
		  	  var iframeid=document.getElementById("iframe"); //iframe id
		  	  if (document.getElementById){
		  		iframeid.height =document.documentElement.clientHeight;			   	   
			  }
		 }
    
	</script>    
 
</head>

<body class="hold-transition skin-green sidebar-mini" >

    <div class="wrapper">

        <!-- 页面头部 -->
        <header class="main-header">
            <!-- Logo -->
            <a href="index.html" class="logo">
                <!-- mini logo for sidebar mini 50x50 pixels -->
                <span class="logo-mini"><b>WeShare</b></span>
                <!-- logo for regular state and mobile devices -->
                <span class="logo-lg"><b>WeShare管理后台</b></span>
            </a>
            <!-- Header Navbar: style can be found in header.less -->
            <nav class="navbar navbar-static-top">
                <!-- Sidebar toggle JButton-->
                <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="JButton">
                    <span class="sr-only">Toggle navigation</span>
                </a>

                
            </nav>
        </header>
        <!-- 页面头部 /-->

        <!-- 导航侧栏 -->
        <aside class="main-sidebar">
            <!-- sidebar: style can be found in sidebar.less -->
            <section class="sidebar">
                <!-- Sidebar user panel -->
                <div class="user-panel">
                    <div class="pull-left image">
                        <img src="${ctx }/img/user2-160x160.jpg" class="img-circle" alt="User Image">
                    </div>
                    <div class="pull-left info">
                        <p> 系统管理员</p>
                        <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
                    </div>
                </div>
              
                <!-- /.search form -->


                <!-- sidebar menu: : style can be found in sidebar.less -->
                <ul class="sidebar-menu"  >
                    <li class="header">菜单</li>
                    
                    <li class="treeview">
				        <a href="#">
				            <i class="fa fa-folder"></i> 
				            <span>网站统计</span>
				            <span class="pull-right-container">
				       			<i class="fa fa-angle-left pull-right"></i>
				   		 	</span>
				        </a>
				        <ul class="treeview-menu">
				
				            <li id="admin-login">
				                <a href="/weshare/fangwenl" target="iframe">
				                    <i class="fa fa-circle-o"></i>访问量统计
				                </a>
				                <a href="/weshare/zhucel" target="iframe">
				                    <i class="fa fa-circle-o"></i>注册量统计
				                </a>
				                <a href="/weshare/zhiye" target="iframe">
				                    <i class="fa fa-circle-o"></i>用户职业占比
				                </a>
				                <a href="/weshare/filekind" target="iframe">
				                    <i class="fa fa-circle-o"></i>资源种类占比
				                </a>
				            </li>
				        </ul>                        
				    </li>

				    <!-- 菜单 -->
				    <li class="treeview">
				        <a href="#">
				            <i class="fa fa-folder"></i> 
				            <span>用户管理</span>
				            <span class="pull-right-container">
				       			<i class="fa fa-angle-left pull-right"></i>
				   		 	</span>
				        </a>
				        <ul class="treeview-menu">
				
				            <li id="admin-login">
				                <a href="/weshare/usermanager" target="iframe">
				                    <i class="fa fa-circle-o"></i>用户管理
				                </a>
				                <a href="/weshare/removefrozen" target="iframe">
				                    <i class="fa fa-circle-o"></i>用户解封
				                </a>
				            </li>
				        </ul>                        
				    </li>
					<li class="treeview">
				        <a href="#">
				            <i class="fa fa-folder"></i> 
				            <span>资源管理</span>
				            <span class="pull-right-container">
				       			<i class="fa fa-angle-left pull-right"></i>
				   		 	</span>
				        </a>
				        <ul class="treeview-menu">
							<li id="admin-login">
				                <a href="/weshare/filepass" target="iframe">
				                    <i class="fa fa-circle-o"></i>资源审核
				                </a>
				            </li>	
				            <li id="admin-login">
				                <a href="/weshare/filemanager" target="iframe">
				                    <i class="fa fa-circle-o"></i>资源管理
				                </a>
				            </li>							
				        </ul>                        
				    </li>
					
					<li class="treeview">
				        <a href="#">
				            <i class="fa fa-folder"></i> 
				            <span>动态管理</span>
				            <span class="pull-right-container">
				       			<i class="fa fa-angle-left pull-right"></i>
				   		 	</span>
				        </a>
				        <ul class="treeview-menu">
				
				            <li id="admin-login">
				                <a href="/weshare/articlemanager" target="iframe">
				                    <i class="fa fa-circle-o"></i>动态管理
				                </a>
				            </li>
				        </ul>                        
				    </li>
				    <!-- 菜单 /-->

                </ul>
            </section>
            <!-- /.sidebar -->
        </aside>
        <!-- 导航侧栏 /-->

        <!-- 内容区域 -->
        <div class="content-wrapper">
			<iframe width="100%" id="iframe" name="iframe"	onload="SetIFrameHeight()" 
					frameborder="0" src="/weshare/fangwenl"></iframe>
 
        </div>
        <!-- 内容区域 /-->

        <!-- 底部导航 -->
        <footer class="main-footer">
            <div class="pull-right hidden-xs">
                <b>Version</b> 1.0.0
            </div>
            <strong> &copy; 2018 <a href="#">淮海工学院  印国林</a>.</strong>
        </footer>
        <!-- 底部导航 /-->

    </div>

</body>

</html>
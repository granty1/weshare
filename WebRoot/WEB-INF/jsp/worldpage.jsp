<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="zh">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
<link rel="stylesheet" media="screen" href="${ctx }/css/frameworks.css">
<link rel="stylesheet" media="screen" href="${ctx }/css/site.css">
<link rel="stylesheet" media="screen" href="${ctx }/css/github.css">
<link rel="stylesheet" media="screen" href="${ctx }/css/weshare.css">
<link rel="stylesheet" type="text/css"
	href="${ctx }/css/font-awesome.css">
<link rel="stylesheet" type="text/css" href="${ctx }/css/world.css">
<link rel="stylesheet" href="${ctx }/css/style.css">
<link rel="stylesheet" href="${ctx }/css/other.css">
<script type="text/javascript" src="${ctx }/js/jquery-1.6.4.js"></script>

</head>
<body>
	<div class="position-relative js-header-wrapper ">
		<div id="js-pjax-loader-bar" class="pjax-loader-bar">
			<div class="progress"></div>
		</div>
		<header class="Header  f5" role="banner">
			<div class="d-flex px-3 flex-justify-between container-lg">
				<div class="d-flex flex-justify-between ">
					<div class="">
						<h4 class="myfont5">◎WeShare</h4>
					</div>
				</div>
				<div
					class="HeaderMenu d-flex flex-justify-between flex-auto myfloat2">
					<div class="d-flex">
						<ul
							class="d-flex pl-2 flex-items-center text-bold list-style-none myfloat"
							role="navigation">
							<li><a href="/weshare/file/itempage"
								aria-label="Pull requests you created"
								class="js-selected-navigation-item HeaderNavlink px-2"
								data-ga-click="Header, click, Nav menu - item:pulls context:user"
								data-hotkey="g p"
								data-selected-links="/pulls /pulls/assigned /pulls/mentioned /pulls">
									我的主页 </a></li>
							<li><a href="/weshare/friendscircle/select" aria-label="Issues you created"
								class="js-selected-navigation-item HeaderNavlink px-2"
								data-ga-click="Header, click, Nav menu - item:issues context:user"
								data-hotkey="g i"
								data-selected-links="/issues /issues/assigned /issues/mentioned /issues">
									朋友圈 </a></li>
							<li><a href="/weshare/file/select/all"
								class="js-selected-navigation-item selected HeaderNavlink px-2"
								data-ga-click="Header, click, Nav menu - item:marketplace context:user"
								data-selected-links=" /marketplace"> 世界 </a></li>
						</ul>
					</div>
				</div>
				          <div class="d-flex">

          <ul class="user-nav d-flex flex-items-center list-style-none" id="user-links">
             <li class="dropdown js-menu-container" style="margin-top:7px;">
              <span class="d-inline-block  px-2">
              <a aria-label="你还没有任何消息" class="notification-indicator tooltipped tooltipped-s float-right js-socket-channel js-notification-indicator" href="/weshare/priletter/selectpriletter">
                <span class="mail-status "></span>
                <svg class="octicon octicon-bell" viewBox="0 0 14 16" version="1.1" width="14" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M14 12v1H0v-1l.73-.58c.77-.77.81-2.55 1.19-4.42C2.69 3.23 6 2 6 2c0-.55.45-1 1-1s1 .45 1 1c0 0 3.39 1.23 4.16 5 .38 1.88.42 3.66 1.19 4.42l.66.58H14zm-7 4c1.11 0 2-.89 2-2H5c0 1.11.89 2 2 2z"></path></svg>
              </a>
              </span>
              <c:if test="${haveNewLetter eq 'yes' }">
              <span class="repo-language-color float-right" style="background-color:red;margin-top:2px;width:7px;height:7px;position:relative;bottom:10px;right:6px;"></span>
              </c:if>
            </li>

            <li class="dropdown js-menu-container">

              <div id="xiala" class="dropdown-details details-reset js-dropdown-details d-flex pl-2 flex-items-center">
                <div id="dianji" class="HeaderNavlink name mt-1">
                  <img alt="@Yuhn-z" class="avatar float-left mr-1" src="${ctx }/static/${user.uHead }" width="20" height="20">
                  <span class="dropdown-caret"></span>
                </div>

                <ul class="dropdown-menu dropdown-menu-sw">

                  <li><a class="dropdown-item" href="/weshare/file/itempage">
                    我的主页
                  </a></li>

                  <li>
                    <a class="dropdown-item" href="/weshare/user/updateinformation">
                    个人设置
                    </a>
                  </li>
                  <li>
                  <form class="logout-form" action="/logout">
                      <JButton type="submit" class="dropdown-item dropdown-signout">
                      帮助
                      </JButton>
                  </form>
                 </li>
                  <li class="dropdown-divider"></li>


                  <li>
                    <form class="logout-form" action="/weshare/user/logout" accept-charset="UTF-8" method="post">

                      <JButton type="submit" class="dropdown-item  dropdown-signout">
                        退出
                      </JButton>
                    </form>
                  </li>

                </ul>
              </div>
            </li>
          </ul>
        </div>

			</div>

		</header>
	</div>
	<div class="content">
		<div id="wrapper">
			<div id="slider-wrap">
				<ul id="slider">
					<li>
					<img   height="100%" width="100%" src="${ctx }/static/lunbo2.jpg">
						<%-- <div>
							<!-- <h3>js</h3>
							<span>2018最流行的编程语言</span> -->
							
						</div> <!-- <i class="fa fa-image"></i> --> --%>
					</li>

					<li >
					<img   height="100%" width="100%" src="${ctx }/static/lunbo4.jpg">
						<!-- <div>
							<h3>github</h3>
							<span>开源的软件托管平台</span>
						</div> <i class="fa fa-gears"></i> -->
					</li>

					<li >
					<img   height="100%" width="100%" src="${ctx }/static/lunbo3.jpg">
						<!-- <div>
							<h3>网易云</h3>
							<span>网易之最，评论总有精彩</span>
						</div> <i class="fa fa-sliders"></i> -->
					</li>

					<li >
					<img   height="100%" width="100%" src="${ctx }/static/lunbo1.jpg">
						<!-- <div>
							<h3>Slide #4</h3>
							<span>Sub-title #4</span>
						</div> <i class="fa fa-code"></i> -->
					</li>

					<li>
					<img   height="100%" width="100%" src="${ctx }/static/lunbo5.jpg">
						<!-- <div>
							<h3>Slide #5</h3>
							<span>Sub-title #5</span>
						</div> <i class="fa fa-microphone-slash"></i> -->
					</li>

				</ul>

				<!--controls-->
				<div class="btns" id="next">
					<i class="fa fa-arrow-right"></i>
				</div>
				<div class="btns" id="previous">
					<i class="fa fa-arrow-left"></i>
				</div>
				<div id="counter"></div>

				<div id="pagination-wrap">
					<ul>
					</ul>
				</div>
				<!--controls-->
			</div>
		</div>
		<div class="mymain">
			<div
				class="explore-pjax-container container-lg p-responsive clearfix" >
				<div class="gutter-md pt-6">
					<div class="col-md-9 float-md-left">
						<div class="tabnav">
							<div class="float-sm-right mb-2 mb-sm-0">
								<div
									class="select-menu js-menu-container js-select-menu select-menu-modal-right">
									<div class="float-right">
										<!-- <form accept-charset="UTF-8" id="searchform" class="subnav-search float-left myfloat6" autocomplete="off"> -->
										<!-- <div style="margin:0;padding:0;display:inline"><input name="utf8" value="✓" type=""></div> -->
										<svg aria-hidden="true" id="searchIcon"
											class="octicon octicon-search subnav-search-icon float-right"
											height="16" version="1.1" viewBox="0 0 16 16" width="16">
                 						 <path fill-rule="evenodd"
												d="M15.7 13.3l-3.81-3.83A5.93 5.93 0 0 0 13 6c0-3.31-2.69-6-6-6S1 2.69 1 6s2.69 6 6 6c1.3 0 2.48-.41 3.47-1.11l3.83 3.81c.19.2.45.3.7.3.25 0 .52-.09.7-.3a.996.996 0 0 0 0-1.41v.01zM7 10.7c-2.59 0-4.7-2.11-4.7-4.7 0-2.59 2.11-4.7 4.7-4.7 2.59 0 4.7 2.11 4.7 4.7 0 2.59-2.11 4.7-4.7 4.7z"></path>
                </svg>
										<input name="keyWord" size="30" autocomplete="off" value=""
											id="keyWord"
											class="form-control subnav-search-input subnav-search-input-wide input-contrast"
											placeholder="搜你想搜" type="text"/>

										<!-- </form> -->
									</div>
								</div>

							</div>
							<nav class="tabnav-tabs" id="naveach">
								<li
									class="js-selected-navigation-item selected tabnav-tab mousecursor"
									data-id="source">共享资源</li>
								<li class="js-selected-navigation-item tabnav-tab mousecursor"
									data-id="people">贡献者</li>
							</nav>

						</div>
						<div class="explore-content" id="explore"></div>
					</div>

					<!-- 右边 -->

					<div class="col-md-3 float-md-left mt-3 mt-md-0">


						<div class="top-15">
							<header>
								<h2 class="title">热门话题</h2>
								<hr />
							</header>

							<div
								style="width: 320px; height: 150px; background-color: transparent; position: relative; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);">
								<span
									style="position: absolute; display: block; font-style: normal; font-variant: normal; font-weight: normal; font-stretch: normal; font-size: 30px; line-height: 30px; font-family:  微软雅黑, sans-serif; left: 100px; top: 63px; width: 120px; height: 30px; white-space: nowrap; transform: rotate(0deg); transform-origin: 50% 40% 0px; color: rgba(50, 58, 69, 0.9);">
									${top3WorldFileList[0].fTitle } </span> <span
									style="position: absolute; display: block; font-style: normal; font-variant: normal; font-weight: normal; font-stretch: normal; font-size: 28.5px; line-height: 28.5px; font-family:  微软雅黑, sans-serif; left: 79.6085px; top: 23.6px; width: 180.783px; height: 28.5px; white-space: nowrap; transform: rotate(0deg); transform-origin: 50% 40% 0px; color: rgba(50, 58, 69, 0.85);">
									${top3WorldFileList[1].fTitle } </span> <span
									style="position: absolute; display: block; font-style: normal; font-variant: normal; font-weight: normal; font-stretch: normal; font-size: 27px; line-height: 27px; font-family:  微软雅黑, sans-serif; left: 131px; top: 104.2px; width: 108px; height: 27px; white-space: nowrap; transform: rotate(0deg); transform-origin: 50% 40% 0px; color: rgba(50, 58, 69, 0.8);">
									${top3WorldFileList[2].fTitle } </span> <span
									style="position: absolute; display: block; font-style: normal; font-variant: normal; font-weight: normal; font-stretch: normal; font-size: 25.5px; line-height: 25.5px; font-family:  微软雅黑, sans-serif; left: 49.5px; top: 69.8px; width: 51px; height: 25.5px; white-space: nowrap; transform: rotate(0deg); transform-origin: 50% 40% 0px; color: rgba(50, 58, 69, 0.75);">
									${top3WorldFileList[3].fTitle } </span> <span
									style="position: absolute; display: block; font-style: normal; font-variant: normal; font-weight: normal; font-stretch: normal; font-size: 19.5px; line-height: 19.5px; font-family:  微软雅黑, sans-serif; left: 29.9824px; top: 102.2px; width: 90.0352px; height: 19.5px; white-space: nowrap; transform: rotate(0deg); transform-origin: 50% 40% 0px; color: rgba(50, 58, 69, 0.6);">
									${top3WorldFileList[4].fTitle } </span> <span
									style="position: absolute; display: block; font-style: normal; font-variant: normal; font-weight: normal; font-stretch: normal; font-size: 18px; line-height: 18px; font-family:  微软雅黑, sans-serif; left: 229px; top: 72.8px; width: 72px; height: 18px; white-space: nowrap; transform: rotate(0deg); transform-origin: 50% 40% 0px; color: rgba(50, 58, 69, 0.6);">
									${top3WorldFileList[5].fTitle } </span> <span
									style="position: absolute; display: block; font-style: normal; font-variant: normal; font-weight: normal; font-stretch: normal; font-size: 16.5px; line-height: 16.5px; font-family:  微软雅黑, sans-serif; left: 119.85px; top: 8.4px; width: 40.2993px; height: 16.5px; white-space: nowrap; transform: rotate(0deg); transform-origin: 50% 40% 0px; color: rgba(50, 58, 69, 0.6);">
									${top3WorldFileList[6].fTitle } </span> <span
									style="position: absolute; display: block; font-style: normal; font-variant: normal; font-weight: normal; font-stretch: normal; font-size: 15px; line-height: 15px; font-family: , 微软雅黑, sans-serif; left: 17.5px; top: 49px; width: 75px; height: 15px; white-space: nowrap; transform: rotate(0deg); transform-origin: 50% 40% 0px; color: rgba(50, 58, 69, 0.6);">
									${top3WorldFileList[7].fTitle } </span> <span
									style="position: absolute; display: block; font-style: normal; font-variant: normal; font-weight: normal; font-stretch: normal; font-size: 13.5px; line-height: 13.5px; font-family:;, &quot;Helvetica Neue&quot;, &quot;Hiragino Sans GB&quot;, &quot;Segoe UI&quot;, &quot;Microsoft YaHei&quot;, 微软雅黑, sans-serif; left: 176.25px; top: -0.4px; width: 67.5px; height: 13.5px; white-space: nowrap; transform: rotate(0deg); transform-origin: 50% 40% 0px; color: rgba(50, 58, 69, 0.6);">
									${top3WorldFileList[8].fTitle } </span> <span
									style="position: absolute; display: block; font-style: normal; font-variant: normal; font-weight: normal; font-stretch: normal; font-size: 21px; line-height: 10.5px; font-family:  微软雅黑, sans-serif; left: 23.5577px; top: 35.8px; width: 52.8845px; height: 10.5px; white-space: nowrap; transform: rotate(0deg) translateX(-13.2211px) scale(0.5); transform-origin: 50% 40% 0px; color: rgba(50, 58, 69, 0.6);">
									${top3WorldFileList[9].fTitle } </span> <span
									style="position: absolute; display: block; font-style: normal; font-variant: normal; font-weight: normal; font-stretch: normal; font-size: 20px; line-height: 10px; font-family:  微软雅黑, sans-serif; left: 160px; top: 81px; width: 20px; height: 10px; white-space: nowrap; transform: rotate(0deg) translateX(-5px) scale(0.5); transform-origin: 50% 40% 0px; color: rgba(50, 58, 69, 0.6);">
									${top3WorldFileList[10].fTitle } </span> <span
									style="position: absolute; display: block; font-style: normal; font-variant: normal; font-weight: normal; font-stretch: normal; font-size: 20px; line-height: 10px; font-family:  微软雅黑, sans-serif; left: 13.6304px; top: 131px; width: 102.739px; height: 10px; white-space: nowrap; transform: rotate(0deg) translateX(-25.6848px) scale(0.5); transform-origin: 50% 40% 0px; color: rgba(50, 58, 69, 0.6);">
									${top3WorldFileList[11].fTitle } </span> <span
									style="position: absolute; display: block; font-style: normal; font-variant: normal; font-weight: normal; font-stretch: normal; font-size: 20px; line-height: 10px; font-family:  微软雅黑, sans-serif; left: 30px; top: 1px; width: 80px; height: 10px; white-space: nowrap; transform: rotate(0deg) translateX(-20px) scale(0.5); transform-origin: 50% 40% 0px; color: rgba(50, 58, 69, 0.6);">
									${top3WorldFileList[12].fTitle } </span> <span
									style="position: absolute; display: block; font-style: normal; font-variant: normal; font-weight: normal; font-stretch: normal; font-size: 20px; line-height: 10px; font-family:  微软雅黑, sans-serif; left: 171.001px; top: 51px; width: 67.998px; height: 10px; white-space: nowrap; transform: rotate(0deg) translateX(-16.9995px) scale(0.5); transform-origin: 50% 40% 0px; color: rgba(50, 58, 69, 0.6);">Clojure
									meetup </span> <span
									style="position: absolute; display: block; font-style: normal; font-variant: normal; font-weight: normal; font-stretch: normal; font-size: 20px; line-height: 10px; font-family:  微软雅黑, sans-serif; left: 250px; top: 101px; width: 40px; height: 10px; white-space: nowrap; transform: rotate(0deg) translateX(-10px) scale(0.5); transform-origin: 50% 40% 0px; color: rgba(50, 58, 69, 0.6);">
									${top3WorldFileList[13].fTitle } </span>
							</div>
							<!-- react-empty: 1681 -->
						</div>







						<div class="top-man" >
							<header>
								<h2 class="title" style="margin-right:90px;">热门用户</h2>
								<hr />
							</header>


							<div class="box" id="" style="">

								<ul>
									<div class="d-table col-12 width-full">




										<c:forEach items="${top8User }" var="topuser">
											<%-- //图片 --%>
											<div class="py-4" style="float:left;margin-right:30px;">
												<div class="d-table-cell col-1 v-align-top">
													<a
														href="/weshare/file/otherFile?author=${topuser.username }">
														<img class="avatar" src="${ctx }/static/${topuser.uHead }"
														alt="" width="80" height="80">
													</a>
												</div>
												<%-- //人名 --%>
												<div>
													<a
														href="/weshare/file/otherFile?author=${topuser.username }"
														class=""> <span class="link-gray-dark"
														style="width: 200px;font-weight:300; font-size:15px; ">${topuser.username }</span>

													</a>

												</div>
											</div>
										</c:forEach>




									</div>





								</ul>
							</div>
						</div>

					</div>
					<!-- 右边 -->
				</div>
			</div>
		</div>
	</div>
	
		<div class="footer container-lg px-3" role="contentinfo">
	<div
			class="position-relative d-flex flex-justify-between py-6 mt-6 f6  ">
			
		</div> 
	</div>
	
	<!------------------------------------------------------------------- 这是一个积分啊隐藏域啊------------------------------------------------------------>
	<input type="hidden" id="integral" value=${user.uIntegral }/>

	<script src="${ctx }/js/jquery.min.js"></script>
	<script type="text/javascript" src="${ctx }/js/slide.js"></script>
	<script type="text/javascript" src="${ctx }/js/world.js"></script>
    <script type="text/javascript" src="${ctx }/js/weshare.js"></script>
     <script type="text/javascript">

        /* 滚动效果
        函数startmarquee的参数：
        lh：文字一次向上滚动的距离或高度； (样式高度也要修改)（可配置样式高度和这里一样来显示一次滚动几条）
        speed：滚动速度；
        delay：滚动停顿的时间间隔；
        index：可以使封装后的函数应用于页面当中不同的元素；
         */
        function startmarquee(lh, speed, delay, index) {

            var t;
            var p = false; //p是true还是false直接影响到下面start()函数的执行
     
     		//获取文档中的滚动区域对象 (DIV)
     		var o = document.getElementById("marqueebox" + index);
     		o.innerHTML += o.innerHTML; //对象中的实际内容被复制了一份，复制的目的在于给文字不间断向上滚动提供过渡。
     
     		//鼠标滑过，停止滚动；
     		o.onmouseover = function() {
     			p = true;
     		}
     
     		//鼠标离开，开始滚动；
     		o.onmouseout = function() {
     			p = false;
     		}
     
     		//文字内容顶端与滚动区域顶端的距离，初始值为0；
     		o.scrollTop = 0;
     
     		function start() {
     			t = setInterval(scrolling, speed); //每隔一段时间，setInterval便会执行一次
     
     			//滚动停止或开始，取决于p传来的布尔值；
     			if (!p) {
     				o.scrollTop += 1;
     			}
     		}
     
     		function scrolling() {
     
     			//如果不被整除，即一次上移的高度达不到lh，则内容会继续往上滚动；
     			if (o.scrollTop % lh != 0) {
     				o.scrollTop += 1;
     				//对象o中的内容之前被复制了一次，所以它的滚动高度，其实是原来内容的两倍高度；
     				//当内容向上滚动到scrollHeight/2的高度时，全部3行文字已经显示了一遍，至此整块内容
     				//scrollTop归0；再等待下一轮的滚动，从而达到文字不间断向上滚动的效果；
     				if (o.scrollTop >= o.scrollHeight / 2)
     					o.scrollTop = 0;
     			} else {
     				//否则清除t，暂停滚动
     				clearInterval(t);
     				//经过delay间隔后，启动start() 再连续滚动
     				setTimeout(start, delay);
     			}
     		}
     
     		//第一次启动滚动；setTimeout会在一定的时间后执行函数start()，且只执行一次
     		setTimeout(start, delay);
     	}
     
     
     	//带停顿效果
     	startmarquee(90, 0, 800, 0);
     	//不间断连续
     	//startmarquee(25,40,0,1);
     </script>

</body>
</html>

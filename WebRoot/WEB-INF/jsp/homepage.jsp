<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DODTYPE html>
<html lang="en">
<head>
<title>WeShare 个人主页</title>
<meta charset="utf-8">
<link rel="stylesheet" media="screen" href="${ctx }/css/frameworks.css">
<link rel="stylesheet" media="screen" href="${ctx }/css/site.css">
<link rel="stylesheet" media="screen" href="${ctx }/css/github.css">
<link rel="stylesheet" media="screen" href="${ctx }/css/weshare.css">

<script type="text/javascript" src="${ctx }/js/jquery-1.6.4.js"></script>
</head>

<body class="logged-in env-production page-profile intent-mouse">
	<!-- 头 -->
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
								class="js-selected-navigation-item selected HeaderNavlink px-2"
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
								class="js-selected-navigation-item HeaderNavlink px-2"
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
                  <span class="dropdown-caret" style="margin-top:5px;"></span>
                </div>

                <ul class="dropdown-menu dropdown-menu-sw">

                  <li><a class="dropdown-header header-nav-current-user css-truncate" href="/weshare/file/itempage">
                    我的主页
                  </a></li>

                  <li>
                    <a class="dropdown-item" href="/weshare/user/updateinformation">
                    个人设置
                    </a>
                  </li>
                  <li>
                  <form class="logout-form" action="####">
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
            
<!-- ------------------------------------------ -->

            
            
            
            
            
          </ul>
        </div>

			</div>
		</header>
	</div>
	<div role="main" class="application-main ">
		<div id="js-pjax-container">
			<div class="container-lg clearfix px-3 mt-4">
				<div id="myfloat-left" class="h-card col-3 float-left pr-3">
					
					<div id="myinfo2" class="top-0"
						style="display: none; width:245px;height: 55px;z-index:999;background-color:#fff;">
	
						<div class="user-profile-mini-vcard d-table">
							<span
								class="user-profile-mini-avatar d-table-cell v-align-middle lh-condensed-ultra pr-2">
								<img alt="....." class="rounded-1"
								src="${ctx }/static/${user.uId }.jpg" width="32" height="32" />
							</span> <span
								class="d-table-cell v-align-middle lh-condensed js-user-profile-following-mini-toggle">
								<strong>${user.username}</strong> <span style="font-size:10px;">积分：</span><strong>${user.uIntegral}</strong>
							</span>
						</div>
					</div>
					<!-- 头像 -->
					<a href="#" aria-hidden="true"
						class="u-photo d-block position-relative" itemprop="image"> <img
						alt="" class="avatar width-full rounded-2"
						src="${ctx }/static/${user.uHead }" width="230" height="230">

					</a>

					<div
						class="vcard-names-container py-3 js-sticky js-user-profile-sticky-fields"
						style="position: static; top: 0px; left: 20px; height:70px;width: 229px;">
						<h1 class="vcard-names">
							<span
								class="p-name vcard-fullname d-block overflow-hidden float-left"
								itemprop="name">${user.username}</span>&nbsp;
							<c:if test="${user.uSex eq '男'}">
								<img width="20" height="24" alt="男" src="${ctx }/images/man.png" />
							</c:if>
							<c:if test="${user.uSex eq '女'}">
								<img width="20" height="24" alt="女"
									src="${ctx }/images/woman.png" />
							</c:if>
						</h1>
						<div
							style="position:relative;right:0px;font-size:4px;width:300px;top:6px;"
							class="user-profile-bio">
							<span class="p-nickname vcard-username myfont1"
								itemprop="additionalName">关注: </span> <span
								class="p-nickname vcard-username myfont1"
								itemprop="additionalName">${focusNum }</span><span class="myfont1"
								style="font-weight:600;"> | </span> <span
								class="p-nickname vcard-username myfont1"
								itemprop="additionalName">粉丝: </span> <span
								class="p-nickname vcard-username myfont1"
								itemprop="additionalName">${beFocusNum }</span><span class="myfont1"
								style="font-weight:600;"> | </span> <span
								class="p-nickname vcard-username myfont1"
								itemprop="additionalName">积分: </span><span class="myfont1">${user.uIntegral}</span>
						</div>
					</div>
					<br />
					<div class="p-note user-profile-bio">
					    <c:if test="${empty user.uSignature }">
						<div>这个人很懒，什么也没留下。。。</div>
						</c:if>
						<c:if test="${ not empty user.uSignature}">
						<div>${user.uSignature }</div>
						</c:if>
					</div>
						<!-- ------------------------------------------------------1111111111111111111111111111111111 -->
				<!-- 	<ul class="vcard-details border-top border-gray-light py-3">
						<li aria-label="Home location"
							class="vcard-detail pt-1 css-truncate css-truncate-target"
							itemprop="homeLocation" show_title="false"><svg
								aria-hidden="true" class="octicon octicon-location" height="16"
								version="1.1" viewBox="0 0 12 16" width="12">
                  <path fill-rule="evenodd"
									d="M6 0C2.69 0 0 2.5 0 5.5 0 10.02 6 16 6 16s6-5.98 6-10.5C12 2.5 9.31 0 6 0zm0 14.55C4.14 12.52 1 8.44 1 5.5 1 3.02 3.25 1 6 1c1.34 0 2.61.48 3.56 1.36.92.86 1.44 1.97 1.44 3.14 0 2.94-3.14 7.02-5 9.05zM8 5.5c0 1.11-.89 2-2 2-1.11 0-2-.89-2-2 0-1.11.89-2 2-2 1.11 0 2 .89 2 2z"></path>
                </svg> <span class="p-label">中国江苏</span></li>
						<li aria-label="Email"
							class="vcard-detail pt-1 css-truncate css-truncate-target"
							itemprop="email"><svg aria-hidden="true"
								class="octicon octicon-mail" height="16" version="1.1"
								viewBox="0 0 14 16" width="14">
								<path fill-rule="evenodd"
									d="M0 4v8c0 .55.45 1 1 1h12c.55 0 1-.45 1-1V4c0-.55-.45-1-1-1H1c-.55 0-1 .45-1 1zm13 0L7 9 1 4h12zM1 5.5l4 3-4 3v-6zM2 12l3.5-3L7 10.5 8.5 9l3.5 3H2zm11-.5l-4-3 4-3v6z"></path></svg>
							<a href="#" class="u-email">chao@hust.edu.cn</a></li>
						<li aria-label="Blog or website"
							class="vcard-detail pt-1 css-truncate css-truncate-target"
							itemprop="url"><svg aria-hidden="true"
								class="octicon octicon-link" height="16" version="1.1"
								viewBox="0 0 16 16" width="16">
                  <path fill-rule="evenodd"
									d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path>
                </svg> <a href="#" class="u-url" rel="nofollow me">http://www.zhangyuhong.com</a>
						</li>
					</ul> -->
					<!-- ------------------------------------------------------1111111111111111111111111111111111 -->
				</div>

				<div id="myfix" class="col-9 float-left pl-2">
					<div id="mynav1"
						style="visibility: hidden; display: none; height: 55px;"
						class="UnderlineNav user-profile-nav top-0 is-placeholder"></div>
					<div id="mynav2"
						class="UnderlineNav user-profile-nav js-sticky top-0"
						style="position:static; top: 0px; width: 727px;z-index:999;">
						<nav class="UnderlineNav-body" >
							<a href="/weshare/file/itempage"
								class="UnderlineNav-item selected"> 我的资源 <span class="Counter">
									${fileNumByUserId } </span>
									<a href="/weshare/article/findmyarticle"
								class="UnderlineNav-item" > 我的动态 <span class="Counter">
									${articleNumByUserId } </span>
							</a> <a href="/weshare/collect/mycollect" class="UnderlineNav-item "
								 > 我的收藏<span
								class="Counter"> ${collectNum } </span>
							</a> <a href="/weshare/focus/myfocus" class="UnderlineNav-item "
								> 我的关注 <span
								class="Counter"> ${focusNum } </span>
							</a>  <a href="/weshare/focus/myfans" class="UnderlineNav-item "
								> 我的粉丝 <span
								class="Counter"> ${beFocusNum } </span>
							</a>
							<a href="/weshare/priletter/selectpriletter" class="UnderlineNav-item  ">
								我的私信 <span class="Counter"> ${lettersNum } </span>
							</a>
						</nav>
					</div>
					<div class="myJButton border-bottom">
						<div id="upload">
							<a href="javascript:;" class="btn btn-color1 btn-large btn-size4"
								data-ga-click=""> 上传资源 </a>
						</div>
						
						<div id="upload1">
							<a href="javascript:;" class="btn btn-color1 btn-large btn-size4"
								data-ga-click=""> 发表动态 </a>
						</div>						
					</div>
					<div class="position-relative">
						<div id="user-repositories-list">
							<ul id="ul_se" data-filterable-for="your-repos-filter"
								data-filterable-type="substring">
								


								<c:if test="${empty fileListByUserId }">
									<div id="user-repositories-list">
										<div class="blankslate mt-5">
											<h4 style="font-weight:500;font-size:15px;">你还没上传任何资源哦!</h4>
										</div>
									</div>
								</c:if>

								<c:forEach items="${fileListByUserId }" var="file">


									<li
										class="col-12 d-block width-full py-4 border-bottom public source"
										itemprop="owns" itemscope="" itemtype="">
										<div id="showinfo" class="d-inline-block mb-1 showinfo1">
											<h3>
												<a href="javascript:;" itemprop="name codeRepository"
													style="float:left;">${file.fTitle} - ${file.fName }</a><a
													href="javascript:void(0);"
													style="display:block;float:left;margin-left:8px;padding-top:10px;"><span
													id="sanjiao" class="item dot-bottom"
													style="display:block;width:3px;height:3px;"></span></a>
											</h3>
											
											
											
											
											
										</div>
<!--  ----------------------------------------------------------------------------------  -->

										<div class="float-right">

											<div
											<c:url value="/file/homedownload" var="downurl">
											<c:param name="fileName" value="${file.fName }"></c:param>
										</c:url> <c:url value="/file/del" var="deleteurl">
											<c:param name="fileId" value="${file.fId }"></c:param>
										</c:url>
												class="js-toggler-container js-social-container starring-container ">
												<a href="${downurl }"><img
												src="${ctx }/images/download.png" height="20" width="17"
												alt="下载" title="下载" /></a>&emsp; <a href="${deleteurl }"><img
												src="${ctx }/images/deletefile.png" height="20" width="17"
												alt="删除" title="删除" /></a>

											</div>

										</div> 
										<div class="fileinfo" style="display:none;">
											<p class="col-9 d-inline-block text-gray mb-2 ml"
												style="width:660px;" itemprop="description">${file.fDesc}</p>
										</div>
										<div class="f6 mt-2 text-gray">

											<c:if test="${file.fKind  eq '哲学'}">
												<span class="repo-language-color ml-0 float-left"
													style="background-color:#8785a2;margin-top:2px;"></span>
												<span class="mr-3 float-left" style="margin-left:3px;" itemprop="programmingLanguage">${file.fKind }</span>
											</c:if>
											<c:if test="${file.fKind  eq '科学'}">
												<span class="repo-language-color ml-0 float-left"
													style="background-color:#0b8457;margin-top:2px;"></span>
												<span class="mr-3 float-left"style="margin-left:3px;" itemprop="programmingLanguage">${file.fKind }</span>
											</c:if>
											<c:if test="${file.fKind  eq '工学'}">
												<span class="repo-language-color ml-0 float-left"
													style="background-color:#70d4b4;margin-top:2px;"></span>
												<span class="mr-3 float-left"style="margin-left:3px;"itemprop="programmingLanguage">${file.fKind }</span>
											</c:if>
											<c:if test="${file.fKind  eq '其他'}">
												<span class="repo-language-color ml-0 float-left"
													style="background-color:#f34b7d;margin-top:2px;"></span>
												<span class="mr-3 float-left" style="margin-left:3px;"itemprop="programmingLanguage">${file.fKind }</span>
											</c:if>



											<div class="float-left" style="width:140px;">
												资源大小：<span> <a> <c:if
															test="${file.fSize > 1024 }">
															<fmt:formatNumber type="number"
																value="${file.fSize/1024 }" maxFractionDigits="1" /> Mb</c:if>
														<c:if test="${file.fSize <= 1024 }">${file.fSize } Kb</c:if>
												</a>
												</span>
											</div>
											&emsp; 上传时间：
											<relative-time datetime="" title="">${file.fCreat }</relative-time>
											&emsp; 下载次数：<span>${file.fDownnum}</span><span style="margin-left:220px;">所需积分：<strong
												class="myfont4" style="color:#EC610A;">${file.fIntegral}</strong></span>
										</div>
									</li>

								</c:forEach>



							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


<div class="footer container-lg px-3" role="contentinfo">
    <div class="position-relative d-flex flex-justify-between py-6 mt-6 f6 text-gray border-top border-gray-light ">
      <ul class="list-style-none d-flex flex-wrap ">
        <li class="mr-3">@ WeShare.com</li>
          <li class="mr-3"><a href="####">使用条款</a></li>
          <li class="mr-3"><a href="####">帮助文档</a></li>
          <li class="mr-3"><a href="####">更新日志</a></li>
          <li class="mr-3"><a href="####">意见和建议</a></li>
      </ul>


      <ul class="list-style-none d-flex flex-wrap ">
          <li class="mr-3">联系我们：</li>
        <li class="mr-3"><a href="####">QQ:1029363172</a></li>
        <li class="mr-3"><a href="####">客服tel：18361489220</a></li>
        <%-- <li class="mr-3"><a href="####">Shop</a></li>
          <li class="mr-3"><a href="####">Blog</a></li> --%>
          <li><a href="####">关于</a></li>

      </ul>
    </div>
  </div>

	<!-- 文件上传弹框div -->
	<div id="theme-popover" class="theme-popover" style="display: none;">
		<div class="theme-poptit">
			<a href="javascript:;" title="关闭" class="close">×</a>
			<h3>weshare-上传文件</h3>
		</div>
		<div class="theme-main">
			<form id="formuploadfile" action="" method="post"
				enctype="multipart/form-data" autocomplete="off">
				<!-- 文件上传 -->
				<div class="report-file">
					<input tabindex="3" size="3" tabindex="2" name="file"
						id="selectfile" class="file-prew myfont2" type="file"
						onchange="uploadfile(event)"><span>上传资源</span>
				</div>
				
				<input type="text" id="textName"
					style="height: 28px;border:1px solid #f1f1f1" autocomplete="off"
					readonly /><br />
				<br />
				<!--文件名  -->
				<span>资源名称</span>
				<div>
					<div>
						<input type="text" id="fileName" name="fTitle" tabindex="1"
							autoComplete="off" class="form-control" size="30"
							onpaste="return false;" value=""
							onfocus="if(this.value=='') this.value='';this.style.color='#333'"
							onblur="if(this.value=='') {this.value='';this.style.color='#999999'}" />
						<i class="i-name"></i>
						<ul id="intelligent-regName" class="hide"></ul>
						<label id="regName_succeed" class="blank"></label> <label
							id="regName_error" class="hide"></label>
					</div>
				</div>
				<br />
				<script type="text/javascript">
            setTimeout(function () {
                if (!$("#fileName").val()) {
                    $("#fileName").get(0).focus();
                }
            }, 0);
        </script>
				<!--资源类型  -->
				<span>资源类型</span><br /> <select name="fKind" class="form-control"
					tabindex="3" style='width:110px;'>
					<option value="哲学">哲学</option>
					<option value="科学">科学</option>
					<option value="工学">工学</option>
					<option value="其他">其他</option>
				</select><br />
				<br />
				<!--资源分  -->
				<span>资源分</span><br /> <select name="fIntegral" class="form-control"
					tabindex="4" style='width:110px;'>
					<option value="0">0</option>
					<option value="2">2</option>
					<option value="4">4</option>
					<option value="6">6</option>
					<option value="8">8</option>
				</select> <br />
				<br />
				<!-- 资源描述 -->
				<span class="">资源描述：</span>
				<textarea id="filetext" name="fDesc" class="form-control form-size1"
					tabindex="5" row="4" col="4"></textarea>
				<br />
				<br /> <input class="btn btn-color1 btn-large btn-size4"
					type="JButton" id="loginsubmit" tabindex="6" value="提交" />
			</form>
		</div>
	</div>
	
	
	<!-- 文章上传窗口 -->
	<!-- 文件上传弹框div -->
	<div id="theme-popover1" class="theme-popover" style="height:400px;display: none;">
		<div class="theme-poptit">
			<a href="javascript:;" title="关闭" class="close">×</a>
			<h3>weshare-发表动态</h3>
		</div>
		<div class="theme-main">
			<form id="formarticle" action="" method="post"
				enctype="multipart/form-data" autocomplete="off">
				
				<br />
				<!--文章标题  -->
				<span>动态主题</span>
				<div>
					<div>
						<input type="text" id="aName" name="aName" tabindex="1"
							autoComplete="off" class="form-control" size="30"
							onpaste="return false;" value=""
							onfocus="if(this.value=='') this.value='';this.style.color='#333'"
							onblur="if(this.value=='') {this.value='';this.style.color='#999999'}" />
						<i class="i-name"></i>
						<ul id="intelligent-regName" class="hide"></ul>
						<label id="regName_succeed" class="blank"></label> <label
							id="regName_error" class="hide"></label>
					</div>
				</div>
				<br />

				<!-- 文章正文 -->
				<span class="">动态内容：</span>
				<textarea id="aText" name="aText" class="form-control form-size1"
					tabindex="10" row="5" col="5"></textarea>
				<br />
				<br /> <input class="btn btn-color1 btn-large btn-size4"
					type="JButton" id="articlesubmit" tabindex="6" value="发表" />
			</form>
		</div>
	</div>
	
	
	
	<div id="theme-popover-mask" class="theme-popover-mask"
		style="display: none;"></div>

</body>
<script type="text/javascript" src="${ctx }/js/weshare.js"></script>
</html>

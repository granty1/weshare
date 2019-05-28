<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
  <head lang="en">
    <meta charset="utf-8">
    <link rel="stylesheet" media="screen" href="${ctx }/css/frameworks.css">
    <link rel="stylesheet" media="screen" href="${ctx }/css/site.css">
    <link rel="stylesheet" media="screen" href="${ctx }/css/github.css">
    <link rel="stylesheet" media="screen" href="${ctx }/css/weshare.css">
      <link rel="stylesheet" media="screen" href="${ctx }/css/friend.css">
      <link rel="stylesheet" media="screen" href="${ctx }/css/world.css">
    <script type="text/javascript" src="${ctx }/js/jquery-1.6.4.js"></script>

  </head>
  <body>
    <div class="position-relative js-header-wrapper ">
      <div id="js-pjax-loader-bar" class="pjax-loader-bar"><div class="progress"></div></div>
      <header class="Header  f5" role="banner">
        <div class="d-flex px-3 flex-justify-between container-lg">
          <div class="d-flex flex-justify-between ">
            <div class="">
              <h4 class="myfont5">◎WeShare</h4>
            </div>
          </div>
          <div class="HeaderMenu d-flex flex-justify-between flex-auto myfloat2">
            <div class="d-flex">
              <ul class="d-flex pl-2 flex-items-center text-bold list-style-none myfloat" role="navigation">
                <li>
                  <a href="/weshare/file/itempage"  class="js-selected-navigation-item HeaderNavlink px-2" >
                    我的主页
                  </a>
                </li>
                <li>
                  <a href="/weshare/friendscircle/select"  class="js-selected-navigation-item selected HeaderNavlink px-2" >
                    朋友圈
                  </a>
                </li>
                <li>
                  <a href="/weshare/file/select/all" class="js-selected-navigation-item HeaderNavlink px-2">
                    世界
                  </a>
                </li>
              </ul>
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
                    <img alt="${user.username }" class="avatar float-left mr-1" src="${ctx }/static/${ user.uHead}" width="20" height="20">
                    <span class="dropdown-caret"style="margin-top:6px;"></span>
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
      </div>
      </header>
    </div>

    <div class="content">




  				<div class="gutter-md pt-6">
            <div class="mymain">
              <div	class="explore-pjax-container container-lg p-responsive clearfix" style="border-right:1px solid;border-color: #cccccc">
                <div class="main-top" style="margin-bottom:150px;">
                  <img alt="${user.username }" class="avatar float-left mr-1" src="${ctx }/static/${user.uHead }" width="50" height="50"/>

                  <div class="mybubble float-left" style="width:65%;position:relative;left:40px;bottom:5px;">
                    <div class="test1"></div>
                    <div style="position:relative;left:20px;">想要更新你的动态吗?<a href="/weshare/file/itempage">返回</a>上传你的文件吧！</div>
                  </div>
                </div>
                

  					<div class="col-md-9 float-left">
  						<div class="tabnav" style="margin-top:20px;">
  							<div class="float-sm-right mb-2 mb-sm-0">

                  <a href="/weshare/friendscircle/select"><svg fill="currentColor" preserveAspectRatio="xMidYMid meet" height="1em" width="1em" viewBox="0 0 40 40" class="cuk-icon cuk-icon-refresh " style="margin-top:20px;margin-right: 8px;vertical-align: middle;">
                    <g><path d="m36.7 23.6q0 0.1 0 0.1-1.4 6-6 9.7t-10.6 3.7q-3.3 0-6.4-1.2t-5.4-3.5l-2.9 2.9q-0.4 0.4-1 0.4t-1-0.4-0.4-1v-10q0-0.6 0.4-1t1-0.4h10q0.6 0 1 0.4t0.5 1-0.5 1l-3 3q1.6 1.5 3.6 2.3t4.1 0.8q3 0 5.6-1.4t4.2-4q0.2-0.4 1.2-2.6 0.1-0.5 0.6-0.5h4.3q0.3 0 0.5 0.2t0.2 0.5z m0.6-17.9v10q0 0.6-0.4 1t-1 0.4h-10q-0.6 0-1-0.4t-0.5-1 0.5-1l3-3.1q-3.3-3-7.8-3-2.9 0-5.5 1.4t-4.2 4q-0.2 0.4-1.2 2.6-0.2 0.5-0.6 0.5h-4.5q-0.3 0-0.5-0.2t-0.2-0.5v-0.1q1.5-6 6-9.7t10.7-3.7q3.3 0 6.4 1.2t5.4 3.5l3-2.9q0.4-0.4 1-0.4t1 0.4 0.4 1z"></path></g>
                  </svg></a>

  							</div>
  							<nav class="tabnav-tabs" id="naveach">
  								<li
  									class="js-selected-navigation-item selected tabnav-tab mousecursor"
  									data-id="source">最新动态</li>
  							</nav>

  						</div>
  						<div class="explore-content" id="explore">
                <ul class="repo-list">
               <!-- ------------------------------------动态---------- --> 
               <c:forEach var="article" items="${friendArticles }">
                <li class="col-12 d-block width-full" style="padding-top: 24px;padding-bottom:20px;">
                    <div class="main-top" style="margin-bottom:150px;">
                      <img alt="${article.authorname }" class="avatar float-left mr-1" src="${ctx }/static/${article.authorhead }" width="50" height="50"/>

                      <div class="mybubble float-left" style="width:87%;position:relative;left:40px;bottom:5px;margin-bottom:20px;">
                        <div class="test1"></div>
                        <div style="position:relative;left:20px;">
                          <head>												
                            <a>#${article.aName }#</a>&nbsp;&nbsp;&nbsp;

                            <svg fill="currentColor" preserveAspectRatio="xMidYMid meet" height="1em" width="1em" viewBox="0 0 40 40" class="cuk-icon cuk-icon-clock-o null" style="vertical-align: middle;"><g><path d="m23 12.1v10q0 0.4-0.2 0.6t-0.5 0.2h-7.2q-0.3 0-0.5-0.2t-0.2-0.6v-1.4q0-0.3 0.2-0.5t0.5-0.2h5v-7.9q0-0.3 0.2-0.5t0.6-0.2h1.4q0.3 0 0.5 0.2t0.2 0.5z m9.3 7.9q0-3.3-1.6-6.1t-4.5-4.4-6.1-1.6-6.1 1.6-4.4 4.4-1.6 6.1 1.6 6.1 4.4 4.4 6.1 1.6 6.1-1.6 4.5-4.4 1.6-6.1z m5 0q0 4.7-2.3 8.6t-6.3 6.2-8.6 2.3-8.6-2.3-6.2-6.2-2.3-8.6 2.3-8.6 6.2-6.2 8.6-2.3 8.6 2.3 6.3 6.2 2.3 8.6z"></path></g></svg>
                            <time>
                              ${article.aCtime }
                            </time>
                            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;							             
                          </head>
                          <div style="position: relative;padding-top:10px; padding-right:40px;padding-bottom:15px;">
                          <articles >${article.aText }</articles>
                          </div>
                          <div style="">

                            from:&nbsp;&nbsp;<a>${article.authorname }</a>   
                           
                         </div>
                        </div>
                      </div>
                    </div>
                  </li>
              </c:forEach>  
                
                
                
              <!-- ----------------------------------------资源 -->                  
                <c:forEach items="${friendsCircleShows }" var="file">
                
                  <li class="col-12 d-block width-full" style="padding-top: 24px;padding-bottom:20px;">
                    <div class="main-top" style="margin-bottom:150px;">
                      <img alt="${file.authorName }" class="avatar float-left mr-1" src="${ctx }/static/${file.authorHead }" width="50" height="50"/>

                      <div class="mybubble float-left" style="width:87%;position:relative;left:40px;bottom:5px;margin-bottom:20px;">
                        <div class="test1"></div>
                        <div style="position:relative;left:20px;">
                          <head>
                                                    <c:url value="/file/worlddownload" var="downurl">
							<c:param name="fileName" value="${file.fName }"></c:param>
							<c:param name="fAuthor" value="${file.authorName }"></c:param>
						</c:url>
						
						<c:url value="/file/checkintegral" var="checkurl">
							<c:param name="fileId" value="${file.fId }"></c:param>
						</c:url>
                            <a>#${file.fTitle }#</a>&nbsp;&nbsp;&nbsp;

                            <svg fill="currentColor" preserveAspectRatio="xMidYMid meet" height="1em" width="1em" viewBox="0 0 40 40" class="cuk-icon cuk-icon-clock-o null" style="vertical-align: middle;"><g><path d="m23 12.1v10q0 0.4-0.2 0.6t-0.5 0.2h-7.2q-0.3 0-0.5-0.2t-0.2-0.6v-1.4q0-0.3 0.2-0.5t0.5-0.2h5v-7.9q0-0.3 0.2-0.5t0.6-0.2h1.4q0.3 0 0.5 0.2t0.2 0.5z m9.3 7.9q0-3.3-1.6-6.1t-4.5-4.4-6.1-1.6-6.1 1.6-4.4 4.4-1.6 6.1 1.6 6.1 4.4 4.4 6.1 1.6 6.1-1.6 4.5-4.4 1.6-6.1z m5 0q0 4.7-2.3 8.6t-6.3 6.2-8.6 2.3-8.6-2.3-6.2-6.2-2.3-8.6 2.3-8.6 6.2-6.2 8.6-2.3 8.6 2.3 6.3 6.2 2.3 8.6z"></path></g></svg>
                            <time>
                              ${file.fCreat }
                            </time>
                            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;

                            &emsp;&emsp;&emsp;&emsp;&emsp;   &emsp;  &emsp; &emsp;    &emsp;
                            <%-- <svg fill="currentColor" preserveAspectRatio="xMidYMid meet" height="1em" width="1em" viewBox="0 0 40 40" class="cuk-icon cuk-icon-heart-o null" style="vertical-align: middle;"><g><path d="m37.1 13.3q0-1.8-0.4-3.2t-1.3-2.2-1.8-1.3-2.1-0.7-2.2-0.2-2.5 0.6-2.4 1.4-2 1.6-1.3 1.4q-0.4 0.5-1.1 0.5t-1.1-0.5q-0.5-0.6-1.3-1.4t-2-1.6-2.4-1.4-2.5-0.6-2.2 0.2-2.1 0.7-1.8 1.3-1.3 2.2-0.4 3.2q0 3.8 4.1 7.9l13 12.5 12.9-12.4q4.2-4.2 4.2-8z m2.9 0q0 4.9-5.1 10l-13.9 13.4q-0.4 0.4-1 0.4t-1-0.4l-13.9-13.4q-0.2-0.2-0.6-0.6t-1.3-1.4-1.5-2.2-1.2-2.7-0.5-3.1q0-4.9 2.8-7.7t7.9-2.7q1.4 0 2.8 0.4t2.7 1.3 2.1 1.6 1.7 1.5q0.8-0.8 1.7-1.5t2.1-1.6 2.7-1.3 2.8-0.4q5 0 7.9 2.7t2.8 7.7z"></path></g></svg>
                            ${file.collectNum } --%>
                            <a href="####" class="downurl" style="position:relative;top:6px;margin-left:60px;" data-check="${checkurl }" data-url="${downurl }" ><img src="${ctx }/images/download.png"
							height="20" width="17" alt="下载" title="下载" /></a>
							               <%-- 这里是收藏-！！！！！------------------------------------------------------------------------------------------------- --%>
                            <%-- <span onclick="coll(this)"   style="position:relative;top:6px;margin-left:5px;" data-id="${file.fName }"  class="coll1"><img class="mylight" weight="20"height="20" src="${ctx }/img/coll-1.png" style="margin-top:5px;"></img></span> --%>

                          </head>
                          <div style="position: relative;padding-top:10px; padding-right:40px;padding-bottom:15px;">
                          <articles >${file.fDesc }</articles>
                          </div>
                          <div style="">

                            From:&nbsp;&nbsp;<a>${file.authorName }</a>&nbsp;&nbsp;&nbsp;&nbsp;File-name:&nbsp;&nbsp;<a>${file.fName }</a>&nbsp;&nbsp;file-size:&nbsp;
                            <a>
                                <c:if test="${file.fSize > 1024 }"><fmt:formatNumber type="number" value="${file.fSize/1024 }" maxFractionDigits="1"/> Mb</c:if>
                                <c:if test="${file.fSize <= 1024 }">${file.fSize } Kb</c:if>
                            </a>
                           <div style="position:relative;left:500px;bottom:21px;">
                                                                              所需积分：<strong class="myfont4" style="color:#EC610A;">${file.fIntegral}</strong>&emsp;
                           
                          </div>
                         </div>
                        </div>
                      </div>
                    </div>
                  </li>



                 </c:forEach>



                  

                </ul>



              </div>
  					</div>

  					<!-- 右边 -->
  									<!-- 右边 -->

					<%-- <div class="col-md-3  mt-3 mt-md-0" style="position:relative;left:80%;bottom:400px;">


						<div class="top-15">
							<header>
								<h2 class="title">热门话题</h2>
								<hr />
							</header>

							<div
								style="width:290px; height: 150px; background-color: transparent; position: relative; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);">
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







						<div class="top-man">
							<header>
								<h2 class="title" style="margin-right:90px;">关注你的人</h2>
								<hr />
							</header>


							<div class="box" id="marqueebox0" style="background-color: #f4f4f4;">

								<ul>
									<div class="d-table col-12 width-full">




										<c:forEach items="${top8User }" var="topuser">
											//图片
											<div class="py-4">
												<div class="d-table-cell col-1 v-align-top">
													<a
														href="/weshare/file/otherFile?author=${topuser.username }">
														<img class="avatar" src="${ctx }/static/${topuser.uHead }"
														alt="" width="80" height="80">
													</a>
												</div>
												//人名
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

					</div> --%>
					<!-- 右边 -->
  					<!-- 右边 -->
  				</div>
  			</div>
  		</div>
  	</div>





  </body>
       <!-- <script type="text/javascript">

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
     </script> -->
   <%-- <script type="text/javascript" src="${ctx }/js/world.js"></script> --%>
  <script type="text/javascript" src="${ctx }/js/weshare.js"></script>
  <script type="text/javascript" src="${ctx }/js/jifen.js"></script>
</html>

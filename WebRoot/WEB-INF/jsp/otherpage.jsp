<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">
    <link rel="stylesheet" media="screen" href="${ctx }/css/frameworks.css">
    <link rel="stylesheet" media="screen" href="${ctx }/css/site.css">
    <link rel="stylesheet" media="screen" href="${ctx }/css/github.css">
    <link rel="stylesheet" media="screen" href="${ctx }/css/weshare.css">
    <link rel="stylesheet" media="screen" href="${ctx }/css/other.css">
	<link rel="stylesheet" media="screen" href="${ctx }/css/letter.css">
	<link rel="stylesheet" type="text/css" href="${ctx }/emotions/emoticon.css" />
    <%-- <link rel="stylesheet" href="${ctx }/css/animation.css"> --%>
    <script type="text/javascript" src="${ctx }/js/jquery-1.6.4.js"></script>
  </head>

  <body class="logged-in env-production page-profile intent-mouse">
    <!-- 头 -->
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
                  <a href="/weshare/file/itempage" aria-label="Pull requests you created" class="js-selected-navigation-item HeaderNavlink px-2" data-ga-click="Header, click, Nav menu - item:pulls context:user" data-hotkey="g p" data-selected-links="/pulls /pulls/assigned /pulls/mentioned /pulls">
                    我的主页
                  </a>
                </li>
                <li>
                  <a href="/weshare/friendscircle/select" aria-label="Issues you created" class="js-selected-navigation-item HeaderNavlink px-2" data-ga-click="Header, click, Nav menu - item:issues context:user" data-hotkey="g i" data-selected-links="/issues /issues/assigned /issues/mentioned /issues">
                    朋友圈
                  </a>
                </li>
                <li>
                  <a href="/weshare/file/select/all" class="js-selected-navigation-item HeaderNavlink px-2" data-ga-click="Header, click, Nav menu - item:marketplace context:user" data-selected-links=" /marketplace">
                    世界
                  </a>
                </li>
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
    <div role="main" class="application-main ">
      <div id="js-pjax-container">
        <div class="container-lg clearfix px-3 mt-4">
          <div id="myfloat-left" class="h-card col-3 float-left pr-3">
            <%-- 浮动 --%>
            <%-- <div id="" style="visibility: hidden; display: none; height: 55px;" class="UnderlineNav user-profile-nav top-0 is-placeholder"></div> --%>
            <%-- <div id = "myinfo1" style="visibility: hidden; display: none; height: 86px;" class="vcard-names-container py-3 js-user-profile-sticky-fields is-placeholder"></div> --%>
            <div id = "myinfo2" class="top-0" style="display: none; width:245px;height: 55px;z-index:999;background-color:#fff;">
              <%-- <div style="background-color:red">
              <span>zyh</span>
            </div> --%>
               <div class="user-profile-mini-vcard d-table">
                <span class="user-profile-mini-avatar d-table-cell v-align-middle lh-condensed-ultra pr-2">
                  <img alt="zyh" class="rounded-1" src="${ctx }/static/${authorDev.uHead}" width="32" height="32"/>
                </span>
                <span class="d-table-cell v-align-middle lh-condensed js-user-profile-following-mini-toggle">
                  <strong>${authorDev.username }</strong>
                  <span style="font-size:10px;">关注</span>
                </span>
              </div>
            </div>
            <!-- 头像 -->
            <a href="#" aria-hidden="true" class="u-photo d-block position-relative" itemprop="image">
              <img alt="" class="avatar width-full rounded-2" src="${ctx }/static/${authorDev.uHead }" width="230" height="230">
            </a>
					<div style="margin-top:10px;">
						<%-- 这里是关注-------------------------------------------------------------------------------------------------- --%>
						<c:if test="${authorDev.uFocus eq 'focus' }">
						    <JButton type="JButton" class="mybtn btn-color1 guanzhu float-left  focusbtn">√已关注</JButton>
						</c:if>
						<c:if test="${authorDev.uFocus eq 'notfocus'}">
						    <JButton type="JButton" class="mybtn btn-color1 guanzhu float-left focusbtn">+关注</JButton>
						</c:if>
			            
            			
						<JButton id="upload" type="JButton" class="mybtn2 guanzhu float-left sixin" style="width:100px;">私信</JButton>
					</div>

					<div
						class="vcard-names-container py-3 js-sticky js-user-profile-sticky-fields"
						style="position: static; top: 0px; left: 20px; height:70px;width: 229px; clear:both;">
						<h1 class="vcard-names">
							<span
								class="p-name vcard-fullname d-block overflow-hidden float-left"
								itemprop="name">${authorDev.username }<span
								style="font-size:20px;">的主页</span></span>&nbsp;
							<c:if test="${authorDev.uSex eq '男' }">
								<img width="20" height="24" alt="男" src="${ctx }/images/man.png" />
							</c:if>
							<c:if test="${authorDev.uSex eq '女' }">
								<img width="20" height="24" alt="女" src="${ctx }/images/woman.png" />
							</c:if>
						</h1>
						<div
							style="position:relative;right:0px;font-size:4px;width:300px;top:6px;"
							class="user-profile-bio">
							<span class="p-nickname vcard-username myfont1"
								itemprop="additionalName">关注: </span> <span
								class="p-nickname vcard-username myfont1"
								itemprop="additionalName">${authorDev.focusNum }</span><span
								class="myfont1" style="font-weight:600;"> | </span> <span
								class="p-nickname vcard-username myfont1"
								itemprop="additionalName">粉丝: </span> <span
								class="p-nickname vcard-username myfont1"
								itemprop="additionalName">${authorDev.beFocusNum }</span>

						</div>
					</div>
					<br/>

                   <br>
					<div class="p-note user-profile-bio">
					    <c:if test="${not empty authorDev.uSignature }">
					        <div>${authorDev.uSignature }</div>
					    </c:if>
						<c:if test="${empty authorDev.uSignature }">
						    这个人很懒，什么也没有留下
						</c:if>
					</div>

            <ul class="vcard-details border-top border-gray-light py-3">
              <!-- <li aria-label="Home location" class="vcard-detail pt-1 css-truncate css-truncate-target" itemprop="homeLocation" show_title="false">
                <svg aria-hidden="true" class="octicon octicon-location" height="16" version="1.1" viewBox="0 0 12 16" width="12">
                  <path fill-rule="evenodd" d="M6 0C2.69 0 0 2.5 0 5.5 0 10.02 6 16 6 16s6-5.98 6-10.5C12 2.5 9.31 0 6 0zm0 14.55C4.14 12.52 1 8.44 1 5.5 1 3.02 3.25 1 6 1c1.34 0 2.61.48 3.56 1.36.92.86 1.44 1.97 1.44 3.14 0 2.94-3.14 7.02-5 9.05zM8 5.5c0 1.11-.89 2-2 2-1.11 0-2-.89-2-2 0-1.11.89-2 2-2 1.11 0 2 .89 2 2z"></path>
                </svg>
                <span class="p-label">中国江苏</span>
              </li>
              <li aria-label="Email" class="vcard-detail pt-1 css-truncate css-truncate-target" itemprop="email"><svg aria-hidden="true" class="octicon octicon-mail" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path fill-rule="evenodd" d="M0 4v8c0 .55.45 1 1 1h12c.55 0 1-.45 1-1V4c0-.55-.45-1-1-1H1c-.55 0-1 .45-1 1zm13 0L7 9 1 4h12zM1 5.5l4 3-4 3v-6zM2 12l3.5-3L7 10.5 8.5 9l3.5 3H2zm11-.5l-4-3 4-3v6z"></path></svg>
                <a href="#" class="u-email">chao@hust.edu.cn</a>
              </li>
              <li aria-label="Blog or website" class="vcard-detail pt-1 css-truncate css-truncate-target" itemprop="url">
                <svg aria-hidden="true" class="octicon octicon-link" height="16" version="1.1" viewBox="0 0 16 16" width="16">
                  <path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path>
                </svg>
                <a href="#" class="u-url" rel="nofollow me">http://www.zhangyuhong.com</a>
              </li> -->
            </ul>
          </div>

          <div id="myfix" class="col-9 float-left pl-2">
            <div id="mynav1" style="visibility: hidden; display: none; height: 55px;" class="UnderlineNav user-profile-nav top-0 is-placeholder"></div>
            <div id="mynav2" class="UnderlineNav user-profile-nav js-sticky top-0" style="position:static; top: 0px; width: 727px;z-index:999 ">
              <nav class="UnderlineNav-body" data-pjax="" role="navigation">
              <a href="/weshare/file/otherFile?author=${authorDev.username }" class="UnderlineNav-item selected" aria-selected="true" role="tab" title="">
                 他的资源
                 <span class="Counter">
                   ${authorDev.filesNum }
                 </span>
              </a>
              <a href="/weshare/article/otherarticles" class="UnderlineNav-item " aria-selected="false" role="tab" title="">
                他的动态
                <span class="Counter">
                   ${authorDev.articlesNum } 
                </span>
              <a href="/weshare/focus/otherfocus" class="UnderlineNav-item " aria-selected="false" role="tab" title="">
                他的关注
                <span class="Counter">
                  ${authorDev.focusNum }
                </span>
              </a>
              <a href="/weshare/focus/otherfans" class="UnderlineNav-item " aria-selected="false" role="tab" title="">
                他的粉丝
                <span class="Counter">
                  ${authorDev.beFocusNum }
                </span>
              </a>
            </nav>
          </div>
          <%-- <div class="myJButton border-bottom">
            <div id="upload">
              <a href="javascript:;" class="btn btn-color1 btn-large btn-size4" data-ga-click="">
                上传文件
              </a>
            </div>

            <!--搜索框  -->
            <div class="float-right">
              <form accept-charset="UTF-8" action="/pulls" class="subnav-search float-left myfloat6" method="get">
                <div style="margin:0;padding:0;display:inline"><input name="utf8" value="✓" type="hidden"></div>
                <input name="q" value="" id="js-issues-search" class="form-control subnav-search-input subnav-search-input-wide input-contrast" placeholder="搜索文件" aria-label="Search all issues" type="text">
                <svg aria-hidden="true" class="octicon octicon-search subnav-search-icon" height="16" version="1.1" viewBox="0 0 16 16" width="16">
                  <path fill-rule="evenodd" d="M15.7 13.3l-3.81-3.83A5.93 5.93 0 0 0 13 6c0-3.31-2.69-6-6-6S1 2.69 1 6s2.69 6 6 6c1.3 0 2.48-.41 3.47-1.11l3.83 3.81c.19.2.45.3.7.3.25 0 .52-.09.7-.3a.996.996 0 0 0 0-1.41v.01zM7 10.7c-2.59 0-4.7-2.11-4.7-4.7 0-2.59 2.11-4.7 4.7-4.7 2.59 0 4.7 2.11 4.7 4.7 0 2.59-2.11 4.7-4.7 4.7z"></path>
                </svg>
              </form>
            </div>
          </div> --%>
          <div class="position-relative">
            <div id="user-repositories-list">
              <ul id="ul_se" data-filterable-for="your-repos-filter" data-filterable-type="substring">
              
              
              
                
                <c:if test="${empty authorDev.otherFileList }">
	                <div id="user-repositories-list">
	                    <div class="blankslate mt-5">
	                      <h4 style="font-weight:500;font-size:15px;">他还没有任何上传资源哦!</h4>
	                    </div>
	                </div>
                </c:if>

				<c:forEach items="${authorDev.otherFileList }" var="file">

				

				<li class="col-12 d-block width-full py-4 border-bottom"
					id="pa-open-nsynth-super">
					<div class="d-inline-block col-9 mb-1">
						<h3>
							<a href="####"> ${file.fTitle } - ${file.fName }
							</a>
						</h3>
					</div>

					<div class="float-right">

						<div
							class="js-toggler-container js-social-container starring-container ">
							<!-- '"` -->
							<!-- </textarea></xmp> -->
							
							
							
							<c:if test="${file.uCollect eq 'notcoll' }">
							
								<span onclick="coll(this)"  data-id="${file.fName }"  class="coll1"><img weight="22"height="22" src="${ctx }/img/coll-1.png" style="margin-top:5px;" "></img></span>								
							</c:if>
							<c:if test="${file.uCollect eq 'coll' }">
								<img weight="22"height="22" src="${ctx }/img/coll-2.png" style="margin-top:5px;"></img>
							</c:if>


						</div>

					</div>

					<div class="py-1">
						<p class="col-9 d-inline-block text-gray m-0 pr-4">
							${file.fDesc }</p>
					</div>

					<div class="f6 text-gray mt-2">

						<c:if test="${file.fKind  eq '哲学'}">
							<span class="repo-language-color ml-0"
								style="background-color:#8785a2;"></span>
							<span class="mr-3" itemprop="programmingLanguage">${file.fKind }</span>
						</c:if>
						<c:if test="${file.fKind  eq '科学'}">
							<span class="repo-language-color ml-0"
								style="background-color:#0b8457;"></span>
							<span class="mr-3" itemprop="programmingLanguage">${file.fKind }</span>
						</c:if>
						<c:if test="${file.fKind  eq '工学'}">
							<span class="repo-language-color ml-0"
								style="background-color:#70d4b4;"></span>
							<span class="mr-3" itemprop="programmingLanguage">${file.fKind }</span>
						</c:if>
						<c:if test="${file.fKind  eq '其他'}">
							<span class="repo-language-color ml-0"
								style="background-color:#f34b7d;"></span>
							<span class="mr-3" itemprop="programmingLanguage">${file.fKind }</span>
						</c:if>
						<c:url value="/file/worlddownload" var="downurl">
							<c:param name="fileName" value="${file.fName }"></c:param>
							<c:param name="fAuthor" value="${file.fAuthor }"></c:param>
						</c:url>
						
						<c:url value="/file/checkintegral" var="checkurl">
							<c:param name="fileId" value="${file.fId }"></c:param>
						</c:url>
						
						<span class="d-inline-block mr-3"> <span
							itemprop="programmingLanguage"> 下载量 </span> <span
							itemprop="programmingLanguage"> ${file.fDownnum } </span>
						</span> <a href="####" class="downurl" data-check="${checkurl }" data-url="${downurl }"><img src="${ctx }/images/download.png"
							height="20" width="17" alt="下载" title="下载" /></a>&emsp;所需积分：<strong
							class="myfont4" style="color:#EC610A;">${file.fIntegral}</strong>
							<!-- <a class="muted-link d-inline-block mr-3"
								href="/googlecreativelab/open-nsynth-super/network"> <svg
									aria-label="fork" class="octicon octicon-repo-forked"
									viewBox="0 0 10 16" version="1.1" width="10" height="16"
									role="img">
													<path fill-rule="evenodd"
										d="M8 1a1.993 1.993 0 0 0-1 3.72V6L5 8 3 6V4.72A1.993 1.993 0 0 0 2 1a1.993 1.993 0 0 0-1 3.72V6.5l3 3v1.78A1.993 1.993 0 0 0 5 15a1.993 1.993 0 0 0 1-3.72V9.5l3-3V4.72A1.993 1.993 0 0 0 8 1zM2 4.2C1.34 4.2.8 3.65.8 3c0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zm3 10c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zm3-10c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2z"></path></svg>
								14
							<%-- </a> --> <span class="d-inline-block mr-3"> 上传者 <a
							href="/googlecreativelab/open-nsynth-super/graphs/contributors"
							class="no-underline"> ${file.fAuthor } <!-- <img class="avatar mb-1" title="zebpedersen" src="https://avatars3.githubusercontent.com/u/1264029?s=40&amp;v=4" alt="@zebpedersen" width="20" height="20"> -->
						</a> --%>
						</span> <span class="d-inline-block float-sm-right"> <!-- <svg class="octicon octicon-star" viewBox="0 0 14 16" version="1.1" width="14" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M14 6l-4.9-.64L7 1 4.9 5.36 0 6l3.6 3.26L2.67 14 7 11.67 11.33 14l-.93-4.74z"></path></svg> -->
							<span itemprop="programmingLanguage"> 上传时间 </span> <span
							itemprop="programmingLanguage"> ${file.fCreat } </span>
						</span>
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
      <!-- 底部优化 -->
    </div>
  </div>
<br/>
       
  <!-- 私信弹框div -->
  <div id="theme-popover" class="theme-popover" style="height:450px;width: 750px;display: none;">
    <div class="theme-poptit">
      <a href="javascript:;" title="关闭" class="close">×</a>
      <h3>weshare-发送私信</h3>
    </div>
    <div class="letter-main">
      <form action=""  id="letterfor" method="post"  enctype="multipart/form-data" autocomplete="off" >
        <!-- 发送私信 -->
        <span>标题</span>
        <div>
            <div>
                <input type="text" name="pTitle" tabindex="1" autoComplete="off"
                       class="form-control"
                       size="79.8"
                       value=""
                       placeholder="私信标题"
                       id="letterhead"
                       required="required"/>
            </div>
        </div><br/>
        <script type="text/javascript">
            setTimeout(function () {
                if (!$("#fileName").val()) {
                    $("#fileName").get(0).focus();
                }
            }, 0);
        </script>
        <div id="container" >
          <span class="float-left">消息内容&emsp;&emsp;&emsp;</span><div class="float-left"><a href="JavaScript:void(0)" id="message_face"><img src="${ctx }/img/b.png" width="20px" height="20px" style="cursor: pointer;"/></a></div>
          <br />
          <%-- <div><a href="JavaScript:void(0)" id="show_face">显示textarea框中的表情</a></div>
          <br /> --%>
          <div class="show_e"></div>
          <textarea id="msg" name="pText" class="form-control letter-size1" placeholder="说点什么~" tabindex="2" required="required"></textarea><br/><br/>
        </div>
        <input class="mybtn btn-color1 guanzhu float-left letterbtn" style="margin-left:390px;background-color:#fff;color:#000;border: 1px solid" type="JButton" id="quxiao" tabindex="6" value="取消"/>
        <input class="mybtn btn-color1 guanzhu float-left letterbtn" style="margin-right:0px;" type="JButton" data-manid="${authorDev.uId}" id="lettersend" tabindex="6" value="发送"/>
      </form>
    </div>

  </div>
  <div id="theme-popover-mask" class="theme-popover-mask" style="display: none;"></div>
  <input type="hidden" id="integral"value="34"/>


</body>
   <script type="text/javascript" src="${ctx }/js/weshare.js"></script>
   <script type="text/javascript" src="${ctx }/js/other.js"></script>
   <script type="text/javascript" src="${ctx }/js/world.js"></script>
   <script type="text/javascript" src="${ctx }/js/jifen.js"></script>
   <script src="${ctx }/emotions/jquery.emoticons.js" type="text/javascript"></script>
   <script src="${ctx }/js/letter.js" type="text/javascript"></script>
   <script type="text/javascript">
       //放新浪微博表情
       $("#message_face").jqfaceedit({txtAreaObj:$("#msg"),containerObj:$('#container'),top:-50,left:-370});
       //显示表情
        $("#show_face").click(function(){
         $('.show_e').html($('#msg').val());
         $('.show_e').emotionsToHtml();
        });
    </script>
</html>

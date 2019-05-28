	<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <link rel="stylesheet" media="screen" href="${ctx }/css/frameworks.css">
    <link rel="stylesheet" media="screen" href="${ctx }/css/site.css">
    <link rel="stylesheet" media="screen" href="${ctx }/css/github.css">
    <link rel="stylesheet" media="screen" href="${ctx }/css/weshare.css">
    <link rel="stylesheet" media="screen" href="${ctx }/css/other.css">
    <link rel="stylesheet" media="screen" href="${ctx }/css/selfinfo.css">
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
                <a href="/issues" aria-label="Issues you created" class="js-selected-navigation-item HeaderNavlink px-2" data-ga-click="Header, click, Nav menu - item:issues context:user" data-hotkey="g i" data-selected-links="/issues /issues/assigned /issues/mentioned /issues">
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
            <li class="dropdown js-menu-container">
              <span class="d-inline-block  px-2">
              <a href="/weshare/priletter/selectpriletter" aria-label="You have no unread notifications" class="notification-indicator tooltipped tooltipped-s  js-socket-channel js-notification-indicator" data-hotkey="g n" data-ga-click="Header, go to notifications, icon:read" data-channel="notification-changed:30255396" href="/notifications">
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

  <div class="infomain">
    <div class="main-center">
      <%-- <div class="float-left info-change">
        <div class="">
         <h3>个人设置</h3>
        </div>
      </div> --%>

        <div class="col-9 float-left  change" style="margin-left:60px;">
          <div class="UnderlineNav user-profile-nav js-sticky top-0">
          <nav class="UnderlineNav-body" data-pjax="" role="navigation">
          <a href="/weshare/user/updateinformation" class="UnderlineNav-item " aria-selected="true" role="tab" title="">
            <h2 style="font-weight:500; font-size:20px;">基本信息</h2>
          </a>

          <a href="/weshare/changepass" class="UnderlineNav-item selected" aria-selected="false" role="tab" title="">
            <h2  style="font-weight:500;font-size:20px;">密码修改</h2>

          </a>
        </nav>
      </div>
        <br/>


          <form id="change_password" class="edit_user" action="t" accept-charset="UTF-8" method="post"><input name="utf8" value="✓" type="hidden"><input name="_method" value="put" type="hidden"><input name="authenticity_token" value="vgzhBcLI+SqFOS+2TzdRAvAGXisOgb0ytxN/bcoOWfkzfykuHFxilJQI/JrmxNqh/ohHIkQaH1V3VpqSWWPe3g==" type="hidden">
            <dl class="form-group password-confirmation-form">
              <dt><label for="user_old_password">旧密码</label></dt>
              <dd><input id="oldpassword" name="oldpassword"  tabindex="2" required="required" class="form-control" type="password"></dd>
            </dl>
            <dl class="form-group password-confirmation-form">
              <dt><label for="">新密码</label></dt>
              <dd><input id="newpassword" name="newpassword"  tabindex="2" required="required" class="form-control" type="password"></dd>
            </dl>
            <dl class="form-group password-confirmation-form">
              <dt><label for="user_confirm_new_password">确认新密码</label></dt>
              <dd><input id="newpassword" name="newpassword"  class="form-control"  tabindex="2" required="required"  type="password"></dd>
            </dl>
            <p>
              <JButton class="btn mr-2" id="passwordbtn" type="JButton">确认修改</JButton>
              <span><a href="/weshare/forgive">忘记密码，怎么办？</a></span>
            </p>
         </form>

          </div>



  <div class="infofooter">
  </div>

</body>
   <script type="text/javascript" src="${ctx }/js/weshare.js"></script>
   <script type="text/javascript" src="${ctx }/js/selfinfo.js"></script>
</html>

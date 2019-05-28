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
          <a href="/weshare/user/updateinformation" class="UnderlineNav-item selected" aria-selected="true" role="tab" title="">
            <h2 style="font-weight:500; font-size:20px;">基本信息</h2>
          </a>

          <a href="/weshare/changepass" class="UnderlineNav-item " aria-selected="false" role="tab" title="">
            <h2  style="font-weight:500;font-size:20px;">密码修改</h2>

          </a>
        </nav>
      </div>
        <br/>

          <%-- <div class="Subhead mt-0 mb-0 UnderlineNav-item selected">
            <h2 class="Subhead-heading ">基础信息</h2>
          </div> --%>
          <form id="selfinfoup" class="columns js-uploadable-container js-upload-avatar-image is-default"  action="/users/Yuhn-z" accept-charset="UTF-8" method="post">

                  <dl class="form-group edit-profile-avatar mr-4 float-right">
                    <dt><label for="upload-profile-picture">当前头像</label></dt>
                    <dd class="avatar-upload-container clearfix">
                      <img id="uploadimg" class="avatar rounded-2" src="${ctx }/static/${user.uHead }" width="200" height="200">
                        <div class="avatar-upload">
                          <label class="position-relative btn JButton-change-avatar mt-3 width-full text-center">
                            上传新头像
                            <input id="imgupload" accept="image/*" name="headFile" class="manual-file-chooser width-full height-full ml-0 js-manual-file-chooser" type="file">
                          </label>

                                                                              <%-- <div class="upload-state loading">
                                                                                <JButton type="JButton" class="btn mt-3 width-full text-center" disabled="">
                                                                                <img alt="" class="v-align-text-bottom" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" height="16"> Uploading...
                                                                                </JButton>
                                                                              </div> --%>

                                                                <%-- <div class="upload-state text-red file-empty">
                                                                  This file is empty.
                                                                </div>

                                                                <div class="upload-state text-red too-big">
                                                                  Please upload a picture smaller than 1 MB.
                                                                </div>

                                                                <div class="upload-state text-red bad-dimensions">
                                                                  Please upload a picture smaller than 10,000x10,000.
                                                                </div>

                                                                <div class="upload-state text-red bad-file">
                                                                  We only support PNG, GIF, or JPG pictures.
                                                                </div>

                                                                <div class="upload-state text-red failed-request">
                                                                  Something went really wrong and we can’t process that picture.
                                                                </div>

                                                                <div class="upload-state text-red bad-format">
                                                                  File contents don't match the file extension.
                                                                </div>
                                                              </div> <!-- /.avatar-upload --> --%>
                </dd>
              </dl>

            <div class="column two-thirds">
                <dl class="form-group">
                  <dt><label for="user_profile_name">昵称</label></dt>
                  <c:if test="${not empty user.uNickname }">
                  <dd><input class="form-control" name="uNickname" id="user_profile_name" value="${user.uNickname }" type="text" required="required" pattern="^[\u4e00-\u9fa5a-zA-Z0-9_]{4,16}$"></dd>
                  </c:if>
                  <c:if test="${empty user.uNickname }">
                  <dd><input class="form-control" name="uNickname" id="user_profile_name" type="text" required="required" pattern="^[\u4e00-\u9fa5a-zA-Z0-9_]{4,16}$"></dd>
                  </c:if>
                  <%-- <p class="text-small text-gray mt-3"> 在这里输入你的昵称，要在4-16个字符之内哦.</p> --%>
                  <p class="note">在这里输入你的昵称，要在4-16个字符之内哦.</p>
                </dl>
                <dl class="form-group">
                <label autocapitalize="off" autofocus="autofocus"> 性别</label><br/>
                <c:if test="${user.uSex eq '男' }">
                <input type="radio" name="uSex" checked="checked" value="男" >男
                &emsp;
                <input type="radio" name="uSex" value="女" >女
                </c:if>
                <c:if test="${user.uSex eq '女' }">
                <input type="radio" name="uSex" value="男" >男
                &emsp;
                <input type="radio" name="uSex" checked="checked" value="女" >女
                </c:if>
                </dl>

                <dl class="form-group">
                <label autocapitalize="off" autofocus="autofocus"> 职业</label><br/>
                <select name="uOccu" class="form-control">
                <c:if test="${user.uOccu eq '计算机/互联网/通信' }">
                  <option value="计算机/互联网/通信" selected="selected">计算机/互联网/通信&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</option>
                  <option value="生产/工艺/制造" >生产/工艺/制造</option>
                  <option value="金融/银行/投资/保险" >金融/银行/投资/保险</option>
                  <option value="文化/广告/传媒" >文化/广告/传媒</option>
                  <option value="公务员/行政/事业单位" >公务员/行政/事业单位</option>
                  <option value="商业/服务业/个体经营" >商业/服务业/个体经营</option>
                  <option value="学生" >学生</option>
                  <option value="其他" >其他</option>
                  </c:if>
                  <c:if test="${user.uOccu eq '生产/工艺/制造' }">
                  <option value="计算机/互联网/通信" >计算机/互联网/通信&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</option>
                  <option value="生产/工艺/制造" selected="selected">生产/工艺/制造</option>
                  <option value="金融/银行/投资/保险" >金融/银行/投资/保险</option>
                  <option value="文化/广告/传媒" >文化/广告/传媒</option>
                  <option value="公务员/行政/事业单位" >公务员/行政/事业单位</option>
                  <option value="商业/服务业/个体经营" >商业/服务业/个体经营</option>
                  <option value="学生" >学生</option>
                  <option value="其他" >其他</option>
                  </c:if>
                  <c:if test="${user.uOccu eq '金融/银行/投资/保险' }">
                  <option value="计算机/互联网/通信" >计算机/互联网/通信&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</option>
                  <option value="生产/工艺/制造" >生产/工艺/制造</option>
                  <option value="金融/银行/投资/保险" selected="selected">金融/银行/投资/保险</option>
                  <option value="文化/广告/传媒" >文化/广告/传媒</option>
                  <option value="公务员/行政/事业单位" >公务员/行政/事业单位</option>
                  <option value="商业/服务业/个体经营" >商业/服务业/个体经营</option>
                  <option value="学生" >学生</option>
                  <option value="其他" >其他</option>
                  </c:if>
                  <c:if test="${user.uOccu eq '文化/广告/传媒' }">
                  <option value="计算机/互联网/通信" >计算机/互联网/通信&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</option>
                  <option value="生产/工艺/制造" >生产/工艺/制造</option>
                  <option value="金融/银行/投资/保险" >金融/银行/投资/保险</option>
                  <option value="文化/广告/传媒" selected="selected">文化/广告/传媒</option>
                  <option value="公务员/行政/事业单位" >公务员/行政/事业单位</option>
                  <option value="商业/服务业/个体经营" >商业/服务业/个体经营</option>
                  <option value="学生" >学生</option>
                  <option value="其他" >其他</option>
                  </c:if>
                  <c:if test="${user.uOccu eq '公务员/行政/事业单位' }">
                  <option value="计算机/互联网/通信" >计算机/互联网/通信&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</option>
                  <option value="生产/工艺/制造" >生产/工艺/制造</option>
                  <option value="金融/银行/投资/保险" >金融/银行/投资/保险</option>
                  <option value="文化/广告/传媒" >文化/广告/传媒</option>
                  <option value="公务员/行政/事业单位" selected="selected">公务员/行政/事业单位</option>
                  <option value="商业/服务业/个体经营" >商业/服务业/个体经营</option>
                  <option value="学生" >学生</option>
                  <option value="其他" >其他</option>
                  </c:if>
                  <c:if test="${user.uOccu eq '商业/服务业/个体经营' }">
                  <option value="计算机/互联网/通信" >计算机/互联网/通信&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</option>
                  <option value="生产/工艺/制造" >生产/工艺/制造</option>
                  <option value="金融/银行/投资/保险" >金融/银行/投资/保险</option>
                  <option value="文化/广告/传媒" >文化/广告/传媒</option>
                  <option value="公务员/行政/事业单位" >公务员/行政/事业单位</option>
                  <option value="商业/服务业/个体经营" selected="selected">商业/服务业/个体经营</option>
                  <option value="学生" >学生</option>
                  <option value="其他" >其他</option>
                  </c:if>
                  <c:if test="${user.uOccu eq '学生' }">
                  <option value="计算机/互联网/通信" >计算机/互联网/通信&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</option>
                  <option value="生产/工艺/制造" >生产/工艺/制造</option>
                  <option value="金融/银行/投资/保险" >金融/银行/投资/保险</option>
                  <option value="文化/广告/传媒" >文化/广告/传媒</option>
                  <option value="公务员/行政/事业单位" >公务员/行政/事业单位</option>
                  <option value="商业/服务业/个体经营" >商业/服务业/个体经营</option>
                  <option value="学生" selected="selected">学生</option>
                  <option value="其他" >其他</option>
                  </c:if>
                  <c:if test="${user.uOccu eq '其他' }">
                  <option value="计算机/互联网/通信" >计算机/互联网/通信&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</option>
                  <option value="生产/工艺/制造" >生产/工艺/制造</option>
                  <option value="金融/银行/投资/保险" >金融/银行/投资/保险</option>
                  <option value="文化/广告/传媒" >文化/广告/传媒</option>
                  <option value="公务员/行政/事业单位" >公务员/行政/事业单位</option>
                  <option value="商业/服务业/个体经营" >商业/服务业/个体经营</option>
                  <option value="学生" >学生</option>
                  <option value="其他" selected="selected">其他</option>
                  </c:if>
                </select>
              </dl>


              <dl class="form-group">
                <div id="dphone">
                  <label autocapitalize="off" autofocus="autofocus">手机号码</label><br/>
                  <div class="fl item-ifo">
                    <input id="phone" size="40" maxlength="11" name="uPhone" value="${user.uPhone }"
                      class="form-control" tabindex="4" required="required"
                      autocomplete="off"  type="tel" pattern="^[1][0-9]{10}$"/> <i class="i-phone"></i>
                      <label id="phone_succeed" class="blank"></label> <label id="phone_error"></label>
                  </div>
                </div>
            </dl>


              <dl class="form-group">
                <dt><label for="user_profile_bio">个性签名</label></dt>
                <dd class="user-profile-bio-field-container js-suggester-container js-length-limited-input-container">
                <c:if test="${empty user.uSignature }">
                  <textarea class="form-control user-profile-bio-field js-suggester-field js-length-limited-input"  maxlength="30"  placeholder="这是一个很懒的人，什么也留下！"name="uSignature" required="required"></textarea>
                </c:if>
                <c:if test="${not empty user.uSignature }">
                  <textarea class="form-control user-profile-bio-field js-suggester-field js-length-limited-input"  maxlength="30"    name="uSignature" required="required">${user.uSignature }</textarea>               
                </c:if>
                  <p class="note">输入你的个性签名，让更多的人了解你，要在30个字符之内哦.</p>
                </dd>
              </dl>
              <hr/>
              <dl class="form-group">
                <dt><label for="user_profile_blog">生日</label></dt>
                <c:if test="${not empty userDesc.uBith }">
                <dd><input class="form-control" name="uBith" id="" type="date"  value="${userDesc.uBith }" required="required" pattern="^[1-9][0-9]{4,10}$"></dd>
                </c:if>
                <c:if test="${empty userDesc.uBith }">
                <dd><input class="form-control" name="uBith" id="" type="date" placeholder="输入你的生日吧"  required="required" pattern="^[1-9][0-9]{4,10}$"></dd>
                </c:if>
              </dl>
              <dl class="form-group">
                <dt><label for="user_profile_company">邮箱</label></dt>
                <dd class="user-profile-company-field-container js-suggester-container">
                <c:if test="${not empty userDesc.uEmail }">
                  <input  class="form-control js-suggester-field" autocomplete="off"required="required" name="uEmail" value="${userDesc.uEmail }" type="email" pattern="\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*">
                </c:if>
                <c:if test="${empty userDesc.uEmail }">
                  <input  class="form-control js-suggester-field" autocomplete="off"required="required" name="uEmail"  type="email" pattern="\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*">
                </c:if>
                  <div class="suggester-container">
                    <div class="suggester js-suggester js-navigation-container" data-url="/autocomplete/organizations">
                    </div>
                  </div>
                </dd>
              </dl>
                <dl class="form-group">
                  <dt><label for="user_profile_company">QQ号</label></dt>
                  <dd class="user-profile-company-field-container js-suggester-container">
                  <c:if test="${not empty userDesc.uQqnum }">
                    <input class="form-control js-suggester-field" required="required" autocomplete="off" name="uQqnum" id="" value="${userDesc.uQqnum }" type="text">
                  </c:if>
                  <c:if test="${empty userDesc.uQqnum }">
                    <input class="form-control js-suggester-field" required="required" autocomplete="off" name="uQqnum" id="" type="text">
                  </c:if>
                    <div class="suggester-container">
                      <div class="suggester js-suggester js-navigation-container" data-url="/autocomplete/organizations">
                      </div>
                    </div>
                  </dd>
                </dl>

              <dl class="form-group">
                <dt><label for="user_profile_location">地址</label></dt>
                <c:if test="${not empty userDesc.uAddress }">
                <dd><input class="form-control" required="required" name="uAddress" id="" type="text" value="${userDesc.uAddress }"></dd> 
                </c:if>
                <c:if test="${empty userDesc.uAddress }">
                <dd><input class="form-control" required="required" name="uAddress" id="" type="text" ></dd> 
                </c:if>
                <p class="note">在这里填写你的地址，格式如：中国，江苏</p>
              </dl>

              <br/><br/><p><JButton type="JButton" id="selfinfobtn" class="btn btn-color1 btn-large btn-size6">提交</JButton></p>
            </div>
          </form>

          </div>



  <div class="infofooter">
  </div>

</body>
   <script type="text/javascript" src="${ctx }/js/weshare.js"></script>
   <script type="text/javascript" src="${ctx }/js/selfinfo.js"></script>
</html>

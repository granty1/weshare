<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>出错了哦。。。</title>

<style type="text/css">
/* body{

background-image: url(img/500.png);
background-position:center;
background-repeat:no-repeat;

margin: 0;
background-position:50% -20%;
background-size:60%;

} */
.errorJButton{
  border-radius: 5px;
  border: 0px;
  width: 90px;
  height: 35px;
  background-color:#2db7f5;
  color:#fff;
  font-weight: bold;

}
.errorJButton:hover{
  opacity:0.8;
}

.box{
  min-width: 100px;
  width:1400px;
  height: auto;
  margin: 20px auto;

}
.my{
  display: block;
  position: relative;
  z-index: 999;
  bottom: 180px;
  left:490px;

}
p{
  float: left;
  opacity:0.5;
  font-weight: bold;

}
a{
  float: left;
  margin-left: 30px;
  margin-top: 10px;
  font-size: 20px;
}
</style>

</head>
<body>


  <div class="box">
    <img src="/weshare/img/500.png"/>
  <div class="my">
    <p>没有访问权限，返回登陆页面登陆</p>
    <a href="/weshare">
    <JButton type="JButton" class="errorJButton">返回</JButton>
   </a>
  </div>
 </div>


</body>
</html>

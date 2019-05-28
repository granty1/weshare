<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" media="screen" href="${ctx }/css/frameworks.css">
<link rel="stylesheet" media="screen" href="${ctx }/css/site.css">
<link rel="stylesheet" media="screen" href="${ctx }/css/github.css">
<link rel="stylesheet" media="screen" href="${ctx }/css/weshare.css">
<link rel="stylesheet" type="text/css"
	href="${ctx }/css/font-awesome.css">
<link rel="stylesheet" type="text/css" href="${ctx }/css/world.css">
<link rel="stylesheet" href="${ctx }/css/style.css">
<script type="text/javascript" src="${ctx }/js/jquery-1.6.4.js"></script>

</head>
<body>



	<div>
		<ol class="repo-list">

			<c:forEach items="${worldFileList }" var="file">

				<c:url value="/collect/add" var="collurl">
					<c:param name="fileName" value="${file.fName }"></c:param>
				</c:url>

				

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
						</span> <a href="####" class="downurl" data-check="${checkurl }" data-url="${downurl }" ><img src="${ctx }/images/download.png"
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
							</a> --> <span class="d-inline-block mr-3"> 上传者 <a
							href="/weshare/file/otherFile?author=${file.fAuthor }"
							class="no-underline"> ${file.fAuthor }
						</a>
						</span> <span class="d-inline-block float-sm-right"> <!-- <svg class="octicon octicon-star" viewBox="0 0 14 16" version="1.1" width="14" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M14 6l-4.9-.64L7 1 4.9 5.36 0 6l3.6 3.26L2.67 14 7 11.67 11.33 14l-.93-4.74z"></path></svg> -->
							<span itemprop="programmingLanguage"> 上传时间 </span> <span
							itemprop="programmingLanguage"> ${file.fCreat } </span>
						</span>
					</div>
				</li>
			</c:forEach>
			<div style="width:200px;margin:0 0 0 340px;">
			

			<a href="####" id="huanyipi">
			
			<svg fill="currentColor"
					preserveAspectRatio="xMidYMid meet" height="1em" width="1em"
					viewBox="0 0 40 40" class="cuk-icon cuk-icon-refresh "
					style="margin-top:20px;margin-right: 8px;vertical-align: middle;">
                    <g>
					<path
						d="m36.7 23.6q0 0.1 0 0.1-1.4 6-6 9.7t-10.6 3.7q-3.3 0-6.4-1.2t-5.4-3.5l-2.9 2.9q-0.4 0.4-1 0.4t-1-0.4-0.4-1v-10q0-0.6 0.4-1t1-0.4h10q0.6 0 1 0.4t0.5 1-0.5 1l-3 3q1.6 1.5 3.6 2.3t4.1 0.8q3 0 5.6-1.4t4.2-4q0.2-0.4 1.2-2.6 0.1-0.5 0.6-0.5h4.3q0.3 0 0.5 0.2t0.2 0.5z m0.6-17.9v10q0 0.6-0.4 1t-1 0.4h-10q-0.6 0-1-0.4t-0.5-1 0.5-1l3-3.1q-3.3-3-7.8-3-2.9 0-5.5 1.4t-4.2 4q-0.2 0.4-1.2 2.6-0.2 0.5-0.6 0.5h-4.5q-0.3 0-0.5-0.2t-0.2-0.5v-0.1q1.5-6 6-9.7t10.7-3.7q3.3 0 6.4 1.2t5.4 3.5l3-2.9q0.4-0.4 1-0.4t1 0.4 0.4 1z"></path></g>
                  </svg>
                  <span style="width:10px;position:relative;top:12px;">到底啦~你可以换一批</span>
            </a>
                              
            </div>


		</ol>
	</div>
</body>
<script type="text/javascript" src="${ctx }/js/jifen.js"></script>
</html>

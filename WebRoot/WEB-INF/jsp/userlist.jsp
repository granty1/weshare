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
</head>
<body>



	<div>

		<div class="position-relative">




			<c:forEach items="${worldUserList }" var="u">


				<%-- 这是一个单一例子 --%>
				<div
					class="d-table col-12 width-full py-4 border-bottom border-gray-light">
					<div class="d-table-cell col-1 v-align-top">
						<a href=""> <img class="avatar"
							src="${ctx }/static/${u.uHead }" alt="@lamhotsimamora"
							width="50" height="50">
						</a>
					</div>

					<div class="d-table-cell col-9 v-align-top pr-3">
						<a href="/weshare/file/otherFile?author=${u.username }"
							class="d-inline-block no-underline mb-1 float-left"> <span
							class="f4 link-gray-dark ">${u.username }</span>

						</a>
						<p class="text-small float-left"
							style="margin-left:12px;margin-top:6px;">
							<!-- <svg class="octicon octicon-location" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M6 0C2.69 0 0 2.5 0 5.5 0 10.02 6 16 6 16s6-5.98 6-10.5C12 2.5 9.31 0 6 0zm0 14.55C4.14 12.52 1 8.44 1 5.5 1 3.02 3.25 1 6 1c1.34 0 2.61.48 3.56 1.36.92.86 1.44 1.97 1.44 3.14 0 2.94-3.14 7.02-5 9.05zM8 5.5c0 1.11-.89 2-2 2-1.11 0-2-.89-2-2 0-1.11.89-2 2-2 1.11 0 2 .89 2 2z"></path></svg> -->
						</p>

						<div class="wb-break-all text-gray text-small mb-2 myclear">
							<c:if test="${empty u.uSignature }">
								<div>这是一个很懒的人，什么也没留下！</div>
							</c:if>
							<c:if test="${not empty user.uSignature }">
								<div>${u.uSignature }</div>
							</c:if>

						</div>
					</div>
					<c:if test="${user.username ne u.username }">
					<div class="d-table-cell col-2 v-align-top text-right">
						<div class="d-table-cell col-2 v-align-top text-right">
							 <c:if test="${u.uFocus eq 'focus' }">
								<JButton type="JButton" data-id="${u.username }"
									class="mybtn10 float-left btn-sm focusbtn1">√已关注</JButton>
							</c:if>
							<c:if test="${u.uFocus eq 'notfocus'}">
								<JButton type="JButton" data-id="${u.username }"
									class="mybtn10 float-left btn-sm focusbtn1">+关注</JButton>
							</c:if> 
						</div>

					</div>
					</c:if>
				</div>

			</c:forEach>


		</div>

	</div>
</body>
	<script type="text/javascript" src="${ctx }/js/other.js"></script>
</html>

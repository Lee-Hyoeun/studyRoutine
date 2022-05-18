<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- jsp 주석입니다~
	여러줄로 사용 가능합니다.
	 --%>
	 
	 <!--  html 주석입니다. -->

<%
/* 자바주석입니다~ 
	주석위치와 각 주석의 실행위치를
		기억해야합니다~! */

for(int i = 1; i <= 5; i++){ // 자바 주석입니다.
%>
<H<%=i %>> 아름다운 한글 </H<%=i %>>
<%
}
%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bean" class="bean.SearchBean" scope="request" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>検索結果</title>
</head>
<body>
 検索結果<br>
 <%if(bean.isExist()){ %>
 <%=bean.toString()%>
 <%} %>

<%if(!bean.isExist()){ %>
<%=bean.getMessage(  )%>
<% }%>
</body>
</html>
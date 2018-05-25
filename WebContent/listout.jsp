<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="bean" class="bean.ListOutBean" scope="request" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
 <td>会員ID </td>
 <td>名前 </td>
 <td> 登録年月日 </td>
  <td>性別 </td>
</tr>
<% for( bean.KaiinLineBean rb: bean.getLine() ){%>
<tr>
 <td> <%=rb.getKaiinNo(  ) %> </td>
 <td> <%=rb.getName(  ) %> </td>
 <td> <%=rb.getRegistDate(  ) %> </td>
 <td> <%=rb.getSex().name(  ) %> </td>
</tr>
<%}%>
</table>
<br>
<form  action="index.html">
	<input type="submit" value="戻る">
</form>
</body>
</html>
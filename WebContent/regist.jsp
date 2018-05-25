<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bean" class="bean.RegistBean" scope="request" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BeanStartWebApp2</title>
</head>
<body>
 登録しました。<br><br><br>
 <table>
<tr>
 <td>会員ID </td>
 <td>名前 </td>
 <td> 登録年月日 </td>
  <td>性別 </td>
</tr>
<% for( bean.KaiinLineBean rb: bean.getList().getLine() ){%>
<tr>
 <td> <%=rb.getKaiinNo(  ) %> </td>
 <td> <%=rb.getName(  ) %> </td>
 <td> <%=rb.getRegistDate(  ) %> </td>
 <td> <%=rb.getSex().name(  ) %> </td>
</tr>
<%}%>
</table>

<form  action="index.html">
	<input type="submit" value="戻る">
</form>


</body>
</html>
<%@page import="in.co.rays.bean.MarksheetBean"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="MarksheetListCtl"method="get">

		<%@ include file="Header.jsp"%>


		<%
			List list = (List) request.getAttribute("list");
		    int pageNo = (int) request.getAttribute("pageNo");

			Iterator it = list.iterator();
		%>

		<table border="5">

			<tr>

				<th>id</th>
				<th>name</th>
				<th>rollNo</th>
				<th>physics</th>
				<th>chemistry</th>
				<th>math</th>


			</tr>

			<%
				while (it.hasNext()) {

		     MarksheetBean bean2 = (MarksheetBean)it.next();
			%>
			<tr>
				<td><%=bean2.getId()%></td>
				<td><%=bean2.getName()%></td>
				<td><%=bean2.getRoll_No()%></td>
				<td><%=bean2.getPhysics()%></td>
				<td><%=bean2.getChemistry()%></td>
				<td><%=bean2.getMaths()%></td>

			</tr>
			<%
				}
			%>
		</table>

	</form>

</body>
</html>
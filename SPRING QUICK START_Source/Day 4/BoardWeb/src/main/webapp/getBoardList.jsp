<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�� ���</title>
</head>
<body>
	<center>
		<h1>�Խñ� ��ü ���� ����</h1>
		
		<br> <a href="insertBoard.jsp">���ο� �Խ��� ����ϱ�</a>
		
		<hr>
		
		<!-- �˻� ���� -->
		<table border="1" cellpadding="0" cellspacing="0" width="700">
			<tr>
				<th width="100">��ȣ</th>
				<th width="200">����</th>
				<th width="150">�۾���</th>
				<th width="150">����</th>
				<th width="100">��ϳ�¥</th>
			</tr>
			<c:forEach items="${boardList }" var="board">
				<tr>
					<td>${board.seq }</td>
					<td align="left"><a href="getBoard.do?seq=${board.seq }">
							${board.title }</a></td>
					<td>${board.writer }</td>
					<td>${board.regDate }</td>
					<td>${board.cnt }</td>
				</tr>
			</c:forEach>
		</table>

	</center>
</body>
</html>
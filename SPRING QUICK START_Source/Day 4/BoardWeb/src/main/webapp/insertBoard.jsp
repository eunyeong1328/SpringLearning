<%@page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>���۵��</title>
</head>
<body>
	<center>
		<h1>�Խ��� ���!!</h1>
		<hr>
		<form action="insertBoard.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td width="70" align="center">�� ����</td>
					<td align="center"><input type="text" name="title" /></td>
				</tr>
				<tr>
					<td align="center">�۾��� </td>
					<td align="center"><input type="text" name="writer"  /></td>
				</tr>
				<tr>
					<td align="center">�� ����</td>
					<td align="center"><textarea name="content" ></textarea></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value=" ���� ��� " /><input type="submit" value="�۵�� ��� " /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="getBoardList.do">�� ��� ����</a>
	</center>
</body>
</html>
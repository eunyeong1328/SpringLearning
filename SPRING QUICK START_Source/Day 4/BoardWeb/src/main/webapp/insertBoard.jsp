<%@page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>새글등록</title>
</head>
<body>
	<center>
		<h1>게시판 등록!!</h1>
		<hr>
		<form action="insertBoard.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td width="70" align="center">글 제목</td>
					<td align="center"><input type="text" name="title" /></td>
				</tr>
				<tr>
					<td align="center">글쓴이 </td>
					<td align="center"><input type="text" name="writer"  /></td>
				</tr>
				<tr>
					<td align="center">글 내용</td>
					<td align="center"><textarea name="content" ></textarea></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value=" 새글 등록 " /><input type="submit" value="글등록 취소 " /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="getBoardList.do">글 목록 가기</a>
	</center>
</body>
</html>
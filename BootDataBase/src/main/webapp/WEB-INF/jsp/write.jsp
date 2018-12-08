<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>

<body>
    <h1>글 쓰기</h1>
    <form action="${pageContext.request.contextPath}/board/insert" method="post">
        글쓴이 <input type="text" name="writer"><br>
        제목 <input type="text" name="title"><br>
        내용
        <textarea name="content" id="content" cols="30" rows="10"></textarea><br>
        <input type="submit" value="입력">
    </form>
</body>

</html>
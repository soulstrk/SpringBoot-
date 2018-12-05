<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
    
<body>
    <div class="container">
        <div class="row">
            <div class="div" style="background-color: aqua; height: 100px; text-align: center; width: 100%; font-size: 3em;">게 시 판</div>
        </div>
        <div class="row">
            <table class="table table-dark table-striped">
                <tr>
                    <th>글 번호</th>
                    <th>작성자</th>
                    <th>글 제목</th>
                    <th>좋아요</th>
                </tr>
			<c:forEach items="${boardList }" var="vo">                
                <tr>
                    <td>${vo.num }</td>
                    <td>${vo.writer }</td>
                    <td>${vo.title }</td>
                    <td>10</td>
                </tr>
            </c:forEach>
            </table>
        </div>
            
        <div class="row">
            <div class="col-md-5">
                <button>글 쓰기</button>
            </div>

            <ul class="pagination">
                <li class="page-item"><a class="page-link" href="#">Previous</a></li>
                <li class="page-item"><a class="page-link" href="#">1</a></li>
                <li class="page-item active"><a class="page-link" href="#">2</a></li>
                <li class="page-item"><a class="page-link" href="#">3</a></li>
                <li class="page-item"><a class="page-link" href="#">Next</a></li>
            </ul>
        </div>            

        <div class="row">
            <select name="keyWord" id="select">
                <option value="writer">작성자</option>
                <option value="title">글 제목</option>
            </select>
            <input type="text" name="searchWord" placeholder="검색할 단어">
            <button id="searchButton">검색</button>            
        </div>
    </div>
</body>

</html>
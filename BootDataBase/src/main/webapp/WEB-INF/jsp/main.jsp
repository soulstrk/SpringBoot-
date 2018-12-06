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
            	<c:if test="${boardInfo.pu.startPageNum ne '1' }">
                	<li class="page-item">
                	<a class="page-link" 
                		href="${pageContext.request.contextPath}/board?pageNum=${boardInfo.pu.startPageNum - 1}&searchWord=${boardInfo.searchWord}&keyWord=${boardInfo.keyWord}">
                			Previous</a></li>
                </c:if>
                <c:forEach begin="${boardInfo.pu.startPageNum }" end="${boardInfo.pu.endPageNum }" var="i" step="1">
                	<c:choose>
                		<c:when test="${boardInfo.pu.pageNum eq i }">
                			<li class="page-item active"><a class="page-link" 
                				href="${pageContext.request.contextPath }/board?pageNum=${i}&searchWord=${boardInfo.searchWord}&keyWord=${boardInfo.keyWord}">${i }</a></li>	
                		</c:when>
                		<c:otherwise>
                			<li class="page-item"><a class="page-link" 
                				href="${pageContext.request.contextPath }/board?pageNum=${i}&searchWord=${boardInfo.searchWord}&keyWord=${boardInfo.keyWord}">${i }</a></li>
                		</c:otherwise>
                	</c:choose>
                </c:forEach>
                <c:if test="${boardInfo.pu.totalPageCount > boardInfo.pu.endPageNum }">
                	<li class="page-item"><a class="page-link" 
                		href="${pageContext.request.contextPath }/board?pageNum=${boardInfo.pu.endPageNum + 1}&searchWord=${boardInfo.searchWord}&keyWord=${boardInfo.keyWord}">Next</a></li>
                </c:if>
            </ul>
        </div>            

        <div class="row">
            <select name="keyWord" id="select">
                    
            </select>
            <input type="text" name="searchWord" placeholder="검색할 단어" value=${boardInfo.searchWord }>
            <button id="searchButton">검색</button>            
        </div>
    </div>
</body>
<script>
    var contextPath = '${pageContext.request.contextPath}';
    var selectedOption = '${boardInfo.keyWord}';

    $(function(){
        makeOption(selectedOption);

        $('#searchButton').on('click',function(){
            var keyWord = $('#select option:selected').val();
            var searchWord = $('input[name=searchWord]').val();
            
            var frm = makeForm('/board', contextPath);
            var add = addData("keyWord",keyWord);
            frm.append(add);

            add = addData("searchWord", searchWord);
            frm.append(add);
            
            console.log(frm);
            $(document.body).append(frm);
            frm.submit();
        });
    })

    function makeForm(actionURL, contextPath){
        var frm = document.createElement('form');

        frm.name = 'frm';
        frm.action = contextPath+actionURL;
        frm.method = "get";

        return frm;
    }

    function addData(name, value){
        var add = document.createElement('input');

        add.setAttribute('type', 'hidden');
        add.setAttribute('name', name);
        add.setAttribute('value', value);
        
        return add;
    }

    function makeOption(keyWord) {
        switch (keyWord) {
            case "title":
                var option2 = $("<option value='writer'>작성자</option>");
                var option1 = $("<option value='title' selected>글 제목</option>");
                $('#select').append(option2).append(option1);                
                break;
        
            default :
                var option2 = $("<option value='writer' seleted>작성자</option>");
                var option1 = $("<option value='title'>글 제목</option>");
                $('#select').append(option2).append(option1);
                break;
        }
    }
</script>
</html>
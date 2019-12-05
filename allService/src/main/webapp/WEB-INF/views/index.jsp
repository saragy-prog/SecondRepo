<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <img class="logo" src="icons/logo.png" alt="AllService logo" height="50px" width="auto">
   <div class="container">
    <ul class="menu">
        <li>
           <a class="menuLinks" href="links/calendar.htm">Календарь</a> 
        </li>
        <li>
            Список бариста
            <ul class="submenu">
                <li>
                    <a class="menuLinks" href="links/barista.htm">Все</a>
                </li>
                <li>
                    <a class="menuLinks" href="links/barista.htm">Популярные</a>
                </li>
                <li>
                    <a class="menuLinks" href="links/barista.htm">Профи</a>
                </li>
                <li>
                    <a class="menuLinks" href="links/barista.htm">Начинающие</a>
                </li>
            </ul>
        </li>
        <li>
            <a class="menuLinks" href="links/barista.htm">Отзывы</a>
        </li>
        <li>
            <a class="menuLinks" href="links/barista.htm"> Связь</a>
        </li>
    <li>	<c:url value="/loginform" var="loginURL"/>
            <a class="menuLinks" href="${loginURL}"> Войти</a>
        </li>
        </ul>
      
    <div class="paragr" style="height: auto; width: 90%">
     <img src="icons/Goal2.jpg" alt="Goal" width="400px" height="auto">
     <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repudiandae, quos ipsa enim alias veniam unde doloribus deserunt dolorem natus? Quam laboriosam, itaque magnam, odit natus omnis sequi ipsa, veniam eum iusto dolorem!
     </p>
     <hr>
 <img src="icons/Philosophy.jpg" alt="Philosophy" width="400px" height="auto" style="opacity:inherit">  
     <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repudiandae, quos ipsa enim alias veniam unde doloribus deserunt dolorem natus? Quam laboriosam, itaque magnam, odit natus omnis sequi ipsa, veniam eum iusto dolorem!
     </p>
     <hr>
     <img src="icons/Time.png" alt="Time" width="400px" height="auto" style="opacity:inherit">
     <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aut fugiat cum cupiditate ratione ut fuga exercitationem praesentium mollitia est, omnis, quia impedit veritatis odio quo illo dignissimos itaque autem magni, molestiae. Quidem possimus architecto asperiores deleniti facilis et accusamus vero quis cum porro! Consequuntur sint sunt, nostrum totam veniam tenetur.</p>
     </div>
</div>
</body>
</html>
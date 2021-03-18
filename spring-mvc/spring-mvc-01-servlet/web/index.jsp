<%--
  Created by IntelliJ IDEA.
  User: kuer
  Date: 2021/3/11
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  $END$
  ${pageContext.request.contextPath}
  <form action="${pageContext.request.contextPath}/hello" method="post">
    <label>
      <input name="name" type="text"/>
    </label>
    <input type="submit"/>
  </form>
  </body>
</html>

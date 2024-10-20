<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html> <%-- Created by IntelliJ IDEA. User: janto Date: 21/10/2024 Time: 00:05  --%>
<head>
    <title>Current Date</title>
</head>
<body>
  <%
    LocalDateTime now = LocalDateTime.now();

    DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formattedNow = now.format(formater);

    pageContext.setAttribute("now", formattedNow);

  %>
<h1><%= pageContext.getAttribute("now")%></h1>
<h1>${pageScope.now}</h1>
</body>
</html>

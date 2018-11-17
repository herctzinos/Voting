

<%@page import="Model.CandidateDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello  ${voter.name}  !</h1>
        <%CandidateDao.name();%>

    </body>
</html>

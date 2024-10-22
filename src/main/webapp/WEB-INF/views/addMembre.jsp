<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Add Membre</title>
</head>
<body>
<h2>Add Membre</h2>
<a href="${pageContext.request.contextPath}/test">Test page</a>
<form:form action="${pageContext.request.contextPath}/save" modelAttribute="membre" method="post">
    <form:input path="adhesionNumber" /><br/>

    <form:input path="firstname" /><br/>

    <form:input path="lastname" /><br/>

    <form:input path="cin" /><br/>

    <form:input path="nationality" /><br/>

    <form:input path="adhessionDate" type="date" /><br/>

    <form:input path="expirationDateLicence" type="date" /><br/>

    <input type="submit" value="Save" />
</form:form>
</body>
</html>

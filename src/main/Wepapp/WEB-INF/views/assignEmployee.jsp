<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Assign Employees to Projects</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/styles.css'/>">
</head>
<body>
<h1>Assign Employees to Projects</h1>

<form:form method="post" action="assign" modelAttribute="assignmentForm">
    <label for="employee">Employee:</label>
    <form:select path="employeeId">
        <form:options items="${employees}" itemValue="id" itemLabel="name"/>
    </form:select>
    <br/>

    <label for="projects">Projects:</label>
    <form:select path="projectIds" multiple="true">
        <form:options items="${projects}" itemValue="id" itemLabel="name"/>
    </form:select>
    <br/>

    <input type="submit" value="Assign"/>
</form:form>
</body>
</html>
